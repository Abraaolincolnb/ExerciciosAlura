package br.com.exercicios.TodoOCursoDeListas.Aula3;

public class Circulo implements Forma{
    //variaveis
    private double raio;

    //construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = 3.14 * Math.pow(this.raio, 2);
        return area;
    }
}

