public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double dolar) {
        double cotacaoDolar = 5.42;
        double real = dolar * cotacaoDolar;


        return real;
    }
}
