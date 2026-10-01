import java.lang.Comparable;
public class Pessoa implements Comparable<Pessoa>{//tem que passar o comparable pelo objeto escolhido
    private String nome;
    private String cpf;
    private int idade;
    private char genero;
    
    public Pessoa(String nome, String cpf, int idade, char genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
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
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\n-----\nNome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nGenero: " + genero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pessoa o) {
        // TODO Auto-generated method stub
        return this.cpf.compareTo(o.cpf);
    }

    
}
