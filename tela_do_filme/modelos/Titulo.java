package tela_do_filme.modelos;

import com.google.gson.annotations.SerializedName;



public class Titulo implements Comparable<Titulo>{  
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;
    

        public Titulo(String nome, int anoDeLancamento){
            this.nome = nome;
            this.anoDeLancamento = anoDeLancamento;

        }

        public Titulo(OMBD meuTituloOmbd) {
            this.nome = meuTituloOmbd.title();
           
            if (meuTituloOmbd.year().length() > 4) {
                throw new ErrorDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 caracteres.");
            }
            this.anoDeLancamento = Integer.valueOf(meuTituloOmbd.year());
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOmbd.runtime().substring(0,2));
        }

        public String getNome() {
            return nome;
        }
    
        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }
    
        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }
    
        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }
    
        public int getTotalDeAvaliacoes() {
            return totalDeAvaliacoes;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }
    
        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }
    
        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }
    
        public void exibeFichaTecnica(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
        }
    
        public void avalia(double nota){
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }
    
        public double pegaMedia(){
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }
    
        @Override
        public int compareTo(Titulo ouTitulo){
            return this.getNome().compareTo(ouTitulo.getNome());
        }

        @Override
        public String toString() {
            return "(nome = " + nome + 
            " , anodelancamento = " + anoDeLancamento + 
            " , minutos = " + duracaoEmMinutos +  ')'; 
        }
    }


