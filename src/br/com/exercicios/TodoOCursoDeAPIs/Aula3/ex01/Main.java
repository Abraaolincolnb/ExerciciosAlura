package br.com.exercicios.TodoOCursoDeAPIs.Aula3.ex01;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner Scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Digite o divivendo");
            double dividendo = Double.parseDouble(Scanner.nextLine());
            System.out.println("Digite o divisor");
            double divisor = Double.parseDouble(Scanner.nextLine());

            try {
                double resultado = dividendo / divisor;
                System.out.println("Seu numero e: " + resultado);
                if (resultado == Double.POSITIVE_INFINITY || resultado == Double.NEGATIVE_INFINITY || Double.isNaN(resultado)) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Voce tentou dividir por 0, reiniciando o programa! :)");
                continue;
            }
            break;
        }
    }
}
