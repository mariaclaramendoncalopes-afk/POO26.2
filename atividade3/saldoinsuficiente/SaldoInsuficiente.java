package atividade3.saldoinsuficiente;

public class SaldoInsuficiente {
    Double saldo = 2500.00;

    public void sacar(double valor){
        if(saldo<valor){
            throw new SaldoInsuficienteException("Valor indisponível para o saque. Informe um valor menor.");
        }else{
         saldo -= valor;
        }
        System.out.println("- Saldo atual: R$" + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
}
