package br.com.exercicios.TodoOCursoDeListas.Aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    static void main() {
        List<Integer> numeros  = new ArrayList<>();
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

    }
}
