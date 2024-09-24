import java.util.Scanner;

public class par_or_impar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("enter a number");
        int num = ler.nextInt();
        if (num % 2 == 0){
            System.out.println("your number is even");
        }else if (num % 2 != 0){
            System.out.println("your number is odd");
        }else {
            System.out.println("error: enter a  valid number ");

        }
    

    }
    


}
