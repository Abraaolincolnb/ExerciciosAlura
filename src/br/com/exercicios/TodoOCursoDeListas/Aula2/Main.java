package br.com.exercicios.TodoOCursoDeListas.Aula2;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product( "Apple Juice", 2.59, 16));
        products.add(new Product( "Coca Cola", 13.47, 6));
        products.add(new Product( "Peanut", 6.90, 24));
        products.add(new PerishableProduct("Apple", 1.0, 300, 200225));

        System.out.println("List Size: " + products.size());

        System.out.println(products.get(2));
        System.out.println(products.get(1));
        System.out.println(products.get(3));



    }
}
