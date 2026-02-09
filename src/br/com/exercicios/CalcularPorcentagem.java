package br.com.exercicios;

import java.util.Scanner;

public class CalcularPorcentagem {
    static void main() {
        int choice = 1;
        Scanner input = new Scanner(System.in);

        while (choice == 1) {


            System.out.println("Digite o valor do produto: ");

            double produto = input.nextDouble();
            double margem = produto * .70;
            double precoFinal = produto + margem;

            System.out.println("##################################");

            System.out.println("Valor do produto: " + produto);
            System.out.println("Margem: " + margem);
            System.out.println("Preco final: " + precoFinal);
            System.out.println("###################################");

            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            choice = input.nextInt();

        }

    }
}
