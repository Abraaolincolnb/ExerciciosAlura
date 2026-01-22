package br.com.exercicios.TodoOCursoDeListas.Aula1;

import java.util.ArrayList;

public class Main {
    static void main() {
        Pessoa Romao = new Pessoa("Romao", 23);
        Pessoa Julio = new Pessoa("Julio", 32);
        Pessoa Felipe = new  Pessoa("Felipe", 27);
        Pessoa Victor = new Pessoa("Victor", 21);
        Pessoa Abraao = new Pessoa("Abraão",19);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(Romao);
        listaDePessoas.add(Julio);
        listaDePessoas.add(Felipe);
        listaDePessoas.add(Victor);
        listaDePessoas.add(Abraao);

        System.out.println("Tamanho da lista: "  + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
