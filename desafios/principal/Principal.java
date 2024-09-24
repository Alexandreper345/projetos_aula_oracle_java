package desafios.principal;

import desafios.modelos.MinhasPreferidas;
import desafios.modelos.Musica;
import desafios.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhMusica = new Musica();
        minhMusica.setTitulo("forever");
        minhMusica.setCantor("kiss");

        for (int i = 0; i < 100; i++ ){
            minhMusica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            minhMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus mendes");

        for (int i = 0; i < 5000; i++ ){
            minhMusica.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            minhMusica.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhMusica);

    }    
}
