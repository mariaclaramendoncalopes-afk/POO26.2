import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ExemploIterator {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 4.5, 5));
        produtos.add(new Produto("Açucar", 8, 0));
        produtos.add(new Produto("Café", 17.2, 2));
        produtos.add(new Produto("Feijão", 9.5, 0));

        System.out.println("Estoque: " + produtos);
        
        /*
        for (Produto produto : produtos) { // Para cada produto, de tipo Produto, em produtos
            if(produto.getEstoque()==0){ // se o estoque do produto for igual a 0
                produtos.remove(produto); // o produto será removido da lista
                //dará um erro, já que não é possivel alterar a lista enquanto ela está sendo percorrida
            }
        } */
        
       Iterator<Produto> produtoIterator = produtos.iterator(); //Permite interagir com todos os itens da lista (podendo remover e adicionar itens)
        while (produtoIterator.hasNext()){ //não tem for each, precisa do while, enquanto tiver um próximo valor
            Produto produto = produtoIterator.next();

            if (produto.getEstoque() == 0){ //retira todos os itens com estoque zerado
                produtoIterator.remove();
            }
        }
        System.out.println("\nPós Iterator");
        System.out.println("Estoque: " + produtos);
    }
}
