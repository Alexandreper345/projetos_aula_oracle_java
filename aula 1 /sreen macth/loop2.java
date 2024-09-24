import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaavl = 0;
        double nota = 0;
        int totaldenotas = 0;



        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme");
            nota = leitura.nextDouble();
           if (nota !=1){
               mediaavl += nota;
               totaldenotas++;
           } 
        }
        System.out.println("Média de avaliações " + mediaavl/totaldenotas);
    }


}

