public class Musica{

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacoes;
    double numavaliacoes;


    void exibirfichatecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento); 
    }

    void avaliar(double nota){
       avaliacoes += nota; 
       numavaliacoes++;

    }

    double calcularmedia(){
        return avaliacoes / numavaliacoes;
    }
}