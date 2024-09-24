import java.util.Scanner;

public class dois_numeros_inteiros {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        System.out.println("enter two number");
        int num = ler.nextInt();
        int num2 = ler.nextInt();

        if (num == num2){
            System.out.println("both numbers are the same");
        }else if(num != num2){
            System.out.println("the two numbers are different");
            if (num > num2){
                System.out.println("the " + num + " is greater than the "  + num2 );
            }else if (num < num2){
                System.out.println("the " + num2 + " is greater than the "  + num );
            }
        }else{
            System.out.println("error enter a number");
        }

    }
}
