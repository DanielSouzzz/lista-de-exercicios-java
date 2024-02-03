package br.com.alura.spotify.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
