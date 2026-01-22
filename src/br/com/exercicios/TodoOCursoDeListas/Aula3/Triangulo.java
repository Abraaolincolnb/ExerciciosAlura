package br.com.exercicios.TodoOCursoDeListas.Aula3;

public class Triangulo implements Forma{
    //variaveis
    private double base;
    private double altura;

    //construtor
    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (base*altura) / 2;
        return area;
    }
}
