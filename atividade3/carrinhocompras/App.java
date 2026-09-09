package atividade3.carrinhocompras;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Informe o nome do produto: ");
                String nome = sc.nextLine();
                System.out.println("Informe a quantidade comprada: ");
                int quantidade = sc.nextInt();
                System.out.println("Informe o preço do produto comprado: ");
                double preco = sc.nextDouble();
                carrinhoCompras.adicionarItem(nome,quantidade,preco);
            } catch (PrecoInvalidoException e){
                System.out.println(e.getMessage());
            } catch (QuantidadeInvalidaException e){
                System.out.println(e.getMessage());
            }
            sc.nextLine();
        }
    }
}
