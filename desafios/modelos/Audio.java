package desafios.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCultidas;
    private int classificacao;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public int getTotalCurtidas(){
        return totalCultidas;
    }
    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCultidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }


}
