import java.util.Scanner;

public class saldinho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String name = "Alexandre";
        String tipo_de_conta = "corrente";
        double saldo_inicial = 150.99;
        System.out.println("--------------------------");
        System.out.println(name);
        System.out.println(tipo_de_conta);
        System.out.println(saldo_inicial);
        System.out.println("--------------------------");
    
        while (true) {
            System.out.println("operações");
            System.out.println(" ");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Recebe valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println(" ");
            System.out.println("Digite a opção desejada:");
            int escolher = ler.nextInt();
            System.out.println(" ");
            System.out.println("--------------------------");
    
    
            if (escolher == 1 ) {
                System.out.println(" ");
                System.out.println(saldo_inicial);
                System.out.println(" ");
                System.out.println("--------------------------");
            } else if(escolher == 2){
                System.out.println(" ");
                System.out.println("digite o valor que irá receber:");
                double receber_saldo = ler.nextDouble();
                System.out.println(saldo_inicial += receber_saldo);
                System.out.println(" ");
                System.out.println("--------------------------");
            }else if(escolher == 3){
                System.out.println(" ");
                System.out.println("digite o valor que deseja transferir:");
                Double transferir_saldo = ler.nextDouble();
                if (transferir_saldo > saldo_inicial){
                    System.out.println("error: o valor que você digitou é maior que o saldo que você tem");
                }else if (transferir_saldo < 0 ) {
                    System.out.println("error: pera como é possivel transferir um numero negativo");                    
                }else{
                    System.out.println(saldo_inicial -= transferir_saldo);
                }
                System.out.println(" ");
                System.out.println("--------------------------");
            }else if(escolher == 4){
                    break;
    
            }else {
                    System.out.println("opção invalida");
            }
        }
    }
}
