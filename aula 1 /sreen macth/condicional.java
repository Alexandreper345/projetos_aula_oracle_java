public class condicional {
    public static void main(String[] args){
        int ano_de_lançamento = 2024;
        boolean incluido_no_plano = true;
        double nota_do_filme = 9.2;
        String tipoPlano = "plus";

        if (ano_de_lançamento >= 2024){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme ainda não foi lançado");

        }
        if (tipoPlano.equals("plus")){
            System.out.println("ecesso liberado");
        }else{
            System.out.println("Deve pagar a pensão ");
        }



    }



}
