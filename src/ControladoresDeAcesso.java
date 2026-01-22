public class ControladoresDeAcesso {
    static void main() {
        RandomNumber rng = new RandomNumber();
        int gerador = 13 * rng.getSemente();
        rng.setNum(gerador);
        rng.galis = "12";
        RandomNumber rng2 = new RandomNumber();

        rng2.setNum(18);

    }
}
