package cadastro;

public class Vendedor extends Funcionario {

    
    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, Double salarioBase, Double aliquotaBonus, Integer totalVendas) {
        super(nome, cpf, salarioBase, aliquotaBonus, totalVendas);
    }

    @Override
    public Double calcularSalario() {
        Double bonus = getTotalVendas() * (1.0/100);
        return bonus + getSalarioBase();
    }

    @Override
    public String toString() {
        return "Vendedor []";
    }
    
    
}
