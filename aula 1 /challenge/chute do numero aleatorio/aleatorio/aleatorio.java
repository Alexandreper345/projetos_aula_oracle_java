package aleatorio;
import java.util.Random;
import java.util.Scanner;

public class aleatorio {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in); 
        int num = new Random().nextInt(100);
        int cont = 0;
        while (cont != 5) {
            System.out.println("guess the number");
            int tent = ler.nextInt();
            System.out.println("---------------------------------------------");

            if (tent == num){
                cont++;
                System.out.println("ebaa you won with just " + cont +" tries");
                break;
            }else if (tent > num){
                System.out.println("the number is smaller");
                cont++;
                System.out.println("you have " + cont + " try");

            }else{
                System.out.println("the number is greater");
                cont++;
                System.out.println("you have " + cont + " try");
            }
            
            if ( cont == 5) {
                System.out.println("you lost");
                break;
            }


        }

    }
}
