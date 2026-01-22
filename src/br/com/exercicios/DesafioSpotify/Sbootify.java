package br.com.exercicios.DesafioSpotify;

import br.com.exercicios.DesafioSpotify.modelos.Musica;
import br.com.exercicios.DesafioSpotify.modelos.Podcast;

public class Sbootify {
    static void main() {
        /// Podcasts
        Podcast FabioAkita = new Podcast();
        FabioAkita.setTitulo("Papo Dev com Fabio Akita");
        FabioAkita.setDuracaoEmMinutos(240);
        FabioAkita.setTema("Programação e IA");
        FabioAkita.setHost("Vilella");
        FabioAkita.setConvidado("Fabio Akita");
        FabioAkita.setDescricao("Batendo um papo de dev com o fabio akita, o rei das pilulas da bolha dev!");
        FabioAkita.Reproduzir();
        FabioAkita.Curtir();

        /// Musica

        Musica fractures = new Musica();
        fractures.setTitulo("Fractures - Illenium");
        fractures.setDuracaoEmMinutos(2.30);
        fractures.setGenero("eletronica");
        fractures.setAlbum("Awake");
        fractures.Reproduzir();
        fractures.Curtir();


        /// Rodando o projeto

        FabioAkita.ExibeFicha();
        fractures.ExibeFicha();



    }
}
