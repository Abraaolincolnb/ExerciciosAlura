package br.com.exercicios.DesafioSpotify.modelos;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;



    public void Curtir(){
        this.curtidas++;
    }

    public void Reproduzir(){
        this.totalReproducoes++;
    }

    /// setters e getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void ExibeFicha(){
        System.out.println(this.getTitulo());
        System.out.println(this.getDuracaoEmMinutos());
        System.out.println(this.getClassificacao());
        System.out.println(this.getCurtidas());
        System.out.println(this.getTotalReproducoes());

    }
}
