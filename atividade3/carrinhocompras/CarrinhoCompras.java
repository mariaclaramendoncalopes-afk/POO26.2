package atividade3.carrinhocompras;

public class CarrinhoCompras {
    int qntItensCarrinho = 0;
    public void adicionarItem(String nome, int quantidade, double preco){
        if(quantidade<1){
            throw new QuantidadeInvalidaException("A quantidade não pode ser nula ou negativa!");
        }
        if(preco<0){
            throw new PrecoInvalidoException("O preço não pode ser negativo!");
        }
        
        String item = "Nome: " + nome + "\nQuantidade: " + quantidade + "\nPreço: " + preco;
        System.out.println(item);
    }
}
