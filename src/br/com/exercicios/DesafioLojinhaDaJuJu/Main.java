package br.com.exercicios.DesafioLojinhaDaJuJu;
import br.com.exercicios.TodoOCursoDeListas.Aula3.Produto;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produtos> produtos = new ArrayList<>();

        System.out.println("Digite seu saldo: ");

        int saldo = Integer.valueOf(scanner.nextLine());

        int choice = 1;

        while (choice == 1) {

            System.out.println("Digite o nome do produto desejado: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o valor do produto desejado: ");
            int valor = Integer.valueOf(scanner.nextLine());

            if (valor > saldo) {
                System.out.println("Você não possui saldo suficiente!");
                break;
            }

            saldo -= valor;

            produtos.add(new Produtos(nome, valor));

            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            choice = Integer.valueOf(scanner.nextLine());

        }

        Collections.sort(produtos);

        System.out.println("Produtos comprados:");
        System.out.println("*******************");
        for (Produtos produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("*******************");

    }
}
