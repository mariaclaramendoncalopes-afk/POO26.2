package cadastro;

public class Gerente extends Funcionario{
    
    public Gerente() {
    }

    public Gerente(String nome, String cpf, Double salarioBase, Double aliquotaBonus, Integer totalVendas) {
        super(nome, cpf, salarioBase, aliquotaBonus, totalVendas);
    }

    @Override
    public Double calcularSalario() {
        Double bonus = getTotalVendas() * (0.5/100);
        return bonus + getSalarioBase();
    }

}