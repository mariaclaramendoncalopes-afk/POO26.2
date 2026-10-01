import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploScannerList {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String menu = """
            1 - Adicionar
            2 - Remover
            3 - Ver todos
            4 - Sair
                """;

        int opcao = 0;

        while (true){
            System.out.println(menu);
            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();

            if(opcao == 4){ //opção de saida primeiro para evitar percorrer todos os if's até o encerramento do loop
                break;
            }

            if(opcao == 1){
                sc.nextLine();

                System.out.println("Digite a descrição do produto: ");
                String descricao = sc.nextLine();

                System.out.println("Digite o preço: ");
                double preco = sc.nextDouble();

                System.out.println("Digite o estoque: ");
                int estoque = sc.nextInt();

                produtos.add(new Produto(descricao, preco, estoque)); //adicionar as informações que o usuário irá inserir na lista
            } else if (opcao == 2){
                sc.nextLine();

                System.out.println("Digite a descrição para remover o produto: ");
                String descricao = sc.nextLine();
                produtos.removeIf(produto -> produto.getDescricao().equalsIgnoreCase(descricao)); //Se o a descrição do produto bate com a que o usuário descreveu, ele será apagado da lista
            } else if (opcao == 3){
                produtos.forEach(produto -> System.out.println(produto + "\n")); // para cada produto em Produto irá printar o produto
            }
        }
    }
}
