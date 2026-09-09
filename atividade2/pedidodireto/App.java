package pedidodireto;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Clara", "Eme@gmail.com");
        Produto produto = new Produto("Coca-cola", 5.50);
        Pedido pedido = new Pedido(cliente, produto, 10, false);

        pedido.processarPagamento(67.00);
    }
}
