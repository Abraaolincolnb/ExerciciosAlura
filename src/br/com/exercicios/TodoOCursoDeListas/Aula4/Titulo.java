package br.com.exercicios.TodoOCursoDeListas.Aula4;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return nome.compareTo(o.nome);
    }
}
