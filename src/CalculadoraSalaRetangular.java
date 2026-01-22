public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public int CalcularArea(int base, int altura) {

        System.out.println("Area : " + base*altura);

        return 0;
    }

    @Override
    public int CalcularPerimetro(int base, int altura) {
        int perimetro = (base * 2) + (altura * 2);
        System.out.println("Perimetro : " + perimetro);

        return 0;
    }
}
