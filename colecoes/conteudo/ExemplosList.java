import java.util.List;

public class ExemplosList {
    public static void main(String[] args) {
        List<Produto> listaProdutos = List.of(new Produto("Arroz" , 4.5,9),
                        new Produto("Feijão" , 9,6),
                        new Produto("Café" , 4, 2));
                    //List.of -> cria uma lista
        System.out.println("Lista de Produtos: " + listaProdutos);
        listaProdutos.add(new Produto("Farinha", 40, 4));
        //Listaa Imutável - não deixa adicionar nem deixa remover
    }
}
