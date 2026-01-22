package br.com.exercicios.TodoOCursoDeListas.Aula3;

public class Quadrado implements Forma{
    //Variaveis
    private double base;
    private double altura;

    //Construtor
    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}