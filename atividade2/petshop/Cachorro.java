package petshop;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }



    @Override
    public void mover() {
        System.out.println("Passo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}
