package pedidodireto;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private Integer quantidade;
    private Boolean pago;

    public Pedido(Cliente cliente, Produto produto, Integer quantidade, Boolean pago) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pago = pago;
    }

    public void processarPagamento(Double valorRecebido){
       Double valorCompra = produto.getPreco() * quantidade;
       if(valorRecebido>=valorCompra){
            System.out.println("O valor recebido cobriu a conta.");
       }else{
            System.out.println("O valor recebido não cobriu a conta!");
       }
       pago = true;
       if(valorRecebido>valorCompra){
            Double troco = valorRecebido - valorCompra;
            System.out.println("O Troco é: R$" + troco);
       }
    }
}
