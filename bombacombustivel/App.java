package bombacombustivel;

public class App {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("gasolina", 6.60, 150.00);

        bomba.abastecerPorValor(50.00);
        bomba.abastecerPorLitro(20.0);
    }
}
