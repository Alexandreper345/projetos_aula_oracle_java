import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("enter a number");
        int num = ler.nextInt();
        int fatorial = 1;

        while (num > 0) {
            fatorial *= num--;
        }
        System.out.println(fatorial);

    }
}

