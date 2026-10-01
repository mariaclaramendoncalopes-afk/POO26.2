package quest_av1.conversor;

public class App {
    public static void main(String[] args) {
        ConversorTemperatura conv = new ConversorTemperatura();
        System.out.println(conv.celsiusParaFahrenheit(28));
    }
}
