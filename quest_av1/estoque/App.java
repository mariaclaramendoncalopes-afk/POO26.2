package quest_av1.estoque;

public class App {
    public static void main(String[] args) {
        EstoqueProduto ep = new EstoqueProduto("Arroz");
        ep.adicionarEstoque(50);
        System.out.println("Quantidade em estoque: " + ep.getQuantidadeEmEstoque());
        ep.removerEstoque(25);
        System.out.println("Nova quantidade: " + ep.getQuantidadeEmEstoque());
        System.out.println("Produto: " + ep.getDescricao());
    }
}
