package br.com.alura.spotify.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacaoEmEstrelas;

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacaoEmEstrelas() {
        return classificacaoEmEstrelas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public void setClassificacaoEmEstrelas(int classificacaoEmEstrelas) {
        this.classificacaoEmEstrelas = classificacaoEmEstrelas;
    }

    public void curte(){
        this.totalCurtidas++;
        System.out.println("Você curtiu!");
    }
    public void reproduz(){

    }
}
