package cadastro;

public class Funcionario {
    private String nome;
    private String cpf;
    private Double salarioBase;
    private Double aliquotaBonus;
    private Integer totalVendas;


    public Funcionario() {
    }


    public Funcionario(String nome, String cpf, Double salarioBase, Double aliquotaBonus, Integer totalVendas) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.aliquotaBonus = aliquotaBonus;
        this.totalVendas = totalVendas;
    }


    public Double calcularSalario(){
        Double bonus = totalVendas * aliquotaBonus;
        return bonus + salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getAliquotaBonus() {
        return aliquotaBonus;
    }

    public void setAliquotaBonus(Double aliquotaBonus) {
        this.aliquotaBonus = aliquotaBonus;
    }

    public Integer getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Integer totalVendas) {
        this.totalVendas = totalVendas;
    }

    
}
