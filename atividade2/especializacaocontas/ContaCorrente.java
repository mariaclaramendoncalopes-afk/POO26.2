package especializacaocontas;

public class ContaCorrente extends ContaBancaria{
    private Double chequeEspecial;


    @Override
    public Double sacar(double saque) {
        if(saque<=getSaldo() && saque<chequeEspecial){
        setSaldo(getSaldo() - saque); /*Pega o valor do saldo e tira o saque, depois coloca o valor restante na variavel saldo */
        }else{
            System.out.println("Saque de valor incorreto");
        }
        return getSaldo();
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Cliente: " + getCliente() + "\nAgencia: " + getAgencia() + "\nConta: "
                + getConta() + "\nSaldo: " + getSaldo();
    }
    
    
}
