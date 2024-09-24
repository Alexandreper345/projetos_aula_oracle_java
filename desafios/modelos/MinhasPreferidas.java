package desafios.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "é considerado preferida de todos e grande sucesso");
        } else {
            System.out.println(audio.getTitulo() + "é umas também mais curtidas");
        }
    }
}
