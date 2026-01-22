package br.com.exercicios.ExerciciosAleatorios;

import java.util.Scanner;

public class Testes {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }
}
