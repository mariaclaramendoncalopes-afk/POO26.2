package controle_lampada;

public class App {
    public static void main(String[] args) {
        LampadaInteligente lampada = new LampadaInteligente(true, 50, "rosa");
        LampadaInteligente lampada2 = new LampadaInteligente(false, 0, null);

        System.out.println(lampada);
        lampada.ajustarIntensidade(100);
        System.out.println(lampada2);
    }
}
