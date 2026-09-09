package termostato;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Termostato t = new Termostato();
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Informe que modo gostaria:
                Resfriar
                Aquecer
                Desligar
                """);
        t.setModo(sc.nextLine());
        System.out.println("Informe a temperatura Atual: ");
        t.setTemperaturaAtual(sc.nextDouble());
        System.out.println("Informe a temperatura que Deseja:");
        t.definirTemperatura(sc.nextDouble());   

        t.executarCiclo();
    }
}
