package quest_av1.conta_bac;

public class App {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Maria", "123-987");
        cb.depositar(50);
        System.out.println("Valor do saldo: " + cb.getSaldo());
        cb.sacar(75.0);
        System.out.println("Valor do saldo: " + cb.getSaldo());
    }
}
