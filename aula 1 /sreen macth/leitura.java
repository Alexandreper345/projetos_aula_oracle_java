import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite seu filme favorito");
        System.out.println("ano de lançamento");
        System.out.println("Diga sua avaliação para o filme");
        String filme = leitura.nextLine();
        int anodelaca= leitura.nextInt();
        double acaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anodelaca);
        System.out.println(acaliacao);
    }
    
}
