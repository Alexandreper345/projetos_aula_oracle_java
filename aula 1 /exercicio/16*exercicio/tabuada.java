import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        System.out.println("choose a number of 1 to 10");
        int number = ler.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("the multiplication table for number " + number + " is");
        System.out.println("------------------------------------------");
        for(int i = 0; i <= 10;i++){
            int resultado =number * i;
            System.out.println(number + " x " + i + " = " + resultado);
        }
    }
}
