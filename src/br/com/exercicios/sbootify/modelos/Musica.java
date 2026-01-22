package br.com.exercicios.sbootify.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;
    private String banda;


    /// Setters e getters
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }


    @Override
    public void ExibeFicha() {
        super.ExibeFicha();
        System.out.println(this.getAlbum());
        System.out.println(this.getArtista());
        System.out.println(this.getBanda());
        System.out.println(this.getGenero());
    }
}
