public class Main {
    public static void main(String[] args) {
        Musica music = new Musica();
        music.titulo = "vento no litoral";
        music.artista = "legião urbana";
        music.anoLancamento = 1981;
        music.avaliar(10);
        music.avaliar(8);
        music.avaliar(9);
        music.avaliar(7);
        System.out.println(music.exibeFichatecnica());
        System.out.println(music.avaliacoes);
        System.out.println(music.numavaliacoes);
        System.out.println(music.calcularmedia());
    }
}
