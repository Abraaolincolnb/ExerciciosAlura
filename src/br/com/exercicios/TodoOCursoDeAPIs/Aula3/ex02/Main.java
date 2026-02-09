package br.com.exercicios.TodoOCursoDeAPIs.Aula3.ex02;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String usuario = Scanner.nextLine();

        try {
            System.out.println("Crie uma senha: ");
            String senha = Scanner.nextLine();
            if (senha.length() < 8) {
                throw new SenhaInvalidaExeption();
            }
        }catch(SenhaInvalidaExeption e) {
            System.out.println("Senha Invalida! a senha precisa conter no mínimo 8 caracteres!");
        }



    }
}
