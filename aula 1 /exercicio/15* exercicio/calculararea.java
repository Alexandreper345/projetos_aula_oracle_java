import java.util.Scanner;

public class calculararea{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Which of these options do you want to calculate");
        System.out.println("1 = calculate the area of the square");
        System.out.println("2 = calculate the area of the circle ");
        int choice  = ler.nextInt();
        System.out.println("----------------------------------");
        if (choice == 1 ){
            System.out.println("enter a two number");
            int num = ler.nextInt();
            int num2 = ler.nextInt();
            int result = num * num2;
            System.out.println("----------------------------");
            System.out.println("the result is " + result);
            System.out.println("----------------------------");
        }else if (choice == 2){
            System.out.println("enter a  number");
            int num = ler.nextInt();
            double result = 3.14 * (num * num); 
            System.out.println("----------------------------");
            System.out.println("the result is " + result);
            System.out.println("----------------------------");

        }else{
            System.out.println("enter a number");
        }
    }
}
