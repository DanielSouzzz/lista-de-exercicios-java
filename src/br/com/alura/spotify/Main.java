package br.com.alura.spotify;

import br.com.alura.spotify.modelos.Musica;

public class Main {
    public static void main(String[] args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Runaway");
        minhaMusica.setAlbum("GirlsAward SELECTION mixed by KSUKE");
        minhaMusica.setArtista("Galantis");
        minhaMusica.setGenero("Eletrônica");
        minhaMusica.sobre();
    }
}
