package atividade3.saldoinsuficiente;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        SaldoInsuficiente s = new SaldoInsuficiente();
        Scanner sc = new Scanner(System.in);
        while (true){
            if(s.getSaldo()==0){
                System.out.println("Você não tem mais dinheiro disponível no saque.");
                break;
            }
            System.out.println("Disponível para saque: " + s.getSaldo());
            System.out.println("Digite o valor para o saque: ");
            Double valor = sc.nextDouble();
            try {
                s.sacar(valor);
            } catch (SaldoInsuficienteException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
