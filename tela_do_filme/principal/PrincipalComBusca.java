package tela_do_filme.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import tela_do_filme.modelos.ErrorDeConversaoDeAnoException;
import tela_do_filme.modelos.OMBD;
import tela_do_filme.modelos.Titulo;



public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();


        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }


            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=a03ee0f"; 
        try{    
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();      

            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        
            String json =  response.body();
            System.out.println(json);


            
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            OMBD meuTituloOmbd = gson.fromJson(json, OMBD.class);
            System.out.println(meuTituloOmbd);
            
                Titulo meuTitulo = new Titulo(meuTituloOmbd);
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);


            } catch(NumberFormatException e){

                System.out.println("aconteceu um error");
                System.out.println(e.getMessage());

            } catch(IllegalArgumentException e){
                System.out.println("algum erro de argumento na busca,verique o endereço");
            }catch (ErrorDeConversaoDeAnoException e){
                System.out.println(e.getMessage());

            }
        
        } 
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

    }
}
