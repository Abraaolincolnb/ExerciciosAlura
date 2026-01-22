package br.com.exercicios.TodoOCursoDeListas.Aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<Integer> numeros  = new ArrayList<>();
        numeros.add(1);
        numeros.add(53);
        numeros.add(15);
        numeros.add(12);
        numeros.add(22);
        numeros.add(33);
        numeros.add(7);
        numeros.add(9);
        numeros.add(91);
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        List<Titulo> titulos = new LinkedList<>();
        titulos.add(new Titulo("Matrix"));
        titulos.add(new Titulo("Luca"));
        titulos.add(new Titulo("Tropa de elite"));
        titulos.add(new Titulo("Tik e tok "));
        titulos.add(new Titulo("Azevedo da silva o filme"));
        titulos.add(new Titulo("Lukao"));
        titulos.add(new Titulo("Lukinhas"));
        titulos.add(new Titulo("Maribondo extrapolado"));

        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println(titulos);


    }
}
