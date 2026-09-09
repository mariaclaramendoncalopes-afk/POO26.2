package veiculo;

public class App {
    public static void main(String[] args) {
        Motorista motorista = new Motorista("Maria", "000123456789");
        Carro carro = new Carro("Sedan", "EME-4267");

        carro.atribuirMotorista(motorista);
        
        System.out.println(carro.ligar());
    }
}
