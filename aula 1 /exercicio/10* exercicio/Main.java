public class Main {
    public static void main(String[] args){
        double precoProduto = 15.5;
        int quantidade_do_produto  = 30;
        int result =  (int) (precoProduto * quantidade_do_produto);
        System.out.println(String.format("o resultado do preço do produto que é %.2f e a quantidade do produto é de  %d e o resultado dos dois é de  %d ", precoProduto,quantidade_do_produto,result));
    }
}
