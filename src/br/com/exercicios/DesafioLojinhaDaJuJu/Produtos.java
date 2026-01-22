package br.com.exercicios.DesafioLojinhaDaJuJu;

public class Produtos implements Comparable<Produtos> {
    /// Variaveis
    private String nome;
    private double valor;

    /// Construtor
    public Produtos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /// Implementação do metodo (toString)
    @Override
    public String toString() {
        return "nome='" + nome + '-' +
                " valor=" + valor;
    }
    /// Ajeitando a logica para comparar esse objeto
    @Override
    public int compareTo(Produtos o) {
        return Double.compare(valor, o.valor);
    }
}
