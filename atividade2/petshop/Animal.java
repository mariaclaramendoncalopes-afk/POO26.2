package petshop;

public class Animal {
    private String nome;
    private Integer idade;
    
    public Animal() {
    }

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
    }

    public void mover(){
    }

    @Override
    public String toString() {
        return "Nome do animal: " + nome + "\nIdade: " + idade;
    }

    
}
