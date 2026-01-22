package br.com.exercicios.TodoOCursoDeListas.Aula2;

public class PerishableProduct extends Product {

    int expirationDate;

    public PerishableProduct(String name, double price, int quantity , int expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " expirationDate=" + expirationDate;
    }
}
