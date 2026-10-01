package quest_av1.buscar_livro;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println(livro.buscarLivroPeloTitulo("Node"));
        System.out.println(livro.buscarLivroPeloTitulo("nita"));
    }
}
