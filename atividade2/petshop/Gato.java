package petshop;

public class Gato extends Animal{

    
    public Gato() {
    }

    public Gato(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void mover() {
        System.out.println("Marchada Lateral");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau!");
    }
}
