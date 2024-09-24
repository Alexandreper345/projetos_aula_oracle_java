

public class Conta {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setnumeroconta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setsaldo(double saldo){
        this.saldo = saldo;
    }  
}
