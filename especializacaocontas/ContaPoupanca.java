package especializacaocontas;

public class ContaPoupanca extends ContaBancaria {
    private Double taxaRendimento;
    
    public void aplicarRendimento(){
        Double rendimento = getSaldo() * taxaRendimento/100;
        setSaldo(rendimento + getSaldo());
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return "Cliente: " + getCliente() + "\nAgencia: " + getAgencia() + "\nConta: "
                + getConta() + "\nSaldo: " + getSaldo();
    }
}
