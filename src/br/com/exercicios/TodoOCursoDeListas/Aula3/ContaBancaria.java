package br.com.exercicios.TodoOCursoDeListas.Aula3;

public class ContaBancaria {

    private int id;
    private double saldo;

    public ContaBancaria(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
