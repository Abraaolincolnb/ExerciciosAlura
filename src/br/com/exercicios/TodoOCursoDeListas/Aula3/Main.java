package br.com.exercicios.TodoOCursoDeListas.Aula3;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<String> listaDeStringues = new ArrayList<>();
        listaDeStringues.add("A");
        listaDeStringues.add("B");
        listaDeStringues.add("C");
        listaDeStringues.add("D");
        listaDeStringues.add("E");

        for ( String str : listaDeStringues ) { // 1. Ok!
            System.out.println(str);
        }

        Animal lobo = new Cachorro();

        if (lobo instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) lobo;
        } else {
            System.out.println("Num e cachorro");
        } // 2. Ok!


        ArrayList<Produto> ListaProdutos  = new ArrayList<>();

        ListaProdutos.add(new Produto("Papel", 12.5));
        ListaProdutos.add(new Produto("Caneta", 2.5));
        ListaProdutos.add(new Produto("Caderno", 13.3));

        double Soma = 0.0;
        for (Produto p : ListaProdutos) {
            Soma += p.getPreco();

        }
        double media = Soma/ListaProdutos.size();
        System.out.println("Media de preço = " + String.format("%.2f",media));

        //6. Coiso das conta bancaria

        ArrayList<ContaBancaria> ListaContasBancarias = new ArrayList<>();

        ListaContasBancarias.add(new ContaBancaria(0, 12.5));
        ListaContasBancarias.add(new ContaBancaria(1, 99.1));
        ListaContasBancarias.add(new ContaBancaria(2, 23.6));


        double maiorSaldo = 0;
        for (ContaBancaria i : ListaContasBancarias) {
            if (i.getSaldo() > maiorSaldo) {
                maiorSaldo = i.getSaldo();
            }
        }

        System.out.println("Conta com maior saldo: " + maiorSaldo);

        /// *******************************************

        // 5. Coiso dos quadrados e area sla mt doido esse exercicio :P

        System.out.println("Dados daqui pra baixo sao do negocio de area de coisas e formas viu!");
        ArrayList<Forma> ListaFormas = new ArrayList<>();

        ListaFormas.add(new Quadrado(12,10));
        ListaFormas.add(new Quadrado(16,9));
        ListaFormas.add(new Triangulo(15, 18));
        ListaFormas.add(new Triangulo(25, 38));
        ListaFormas.add(new Circulo(5));
        ListaFormas.add(new Circulo(166));

        for (Forma p : ListaFormas) {
            System.out.println(p.calcularArea());
        }

    }
}
