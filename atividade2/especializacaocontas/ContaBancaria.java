package especializacaocontas;

public class ContaBancaria{
    private Cliente cliente;
    private String agencia;
    private String conta; /*identificador da conta */
    private Double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(Cliente cliente, String agencia, String conta, Double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Double sacar(double saque) { /*Para realizar o metodo, precisa de um valor, que é o saque */
        if(saque<=saldo){
            saldo-= saque;
        }else{
            System.out.print("Saque de valor inválido.");
        }
        return saldo;
    }

    public Double depositar(double deposito){
        if(deposito>0){
            saldo+=deposito;
        }else{
            System.out.print("Depósito de valor inválido.");
        }
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}