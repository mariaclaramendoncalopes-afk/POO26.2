package atividade_tratamento_erro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Acessar nome pelo índice");
            System.out.println("4 - Mostrar lista");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            try {

                switch (opcao) {

                    case 1:
                        System.out.print("Digite o nome: ");
                        String nome = sc.nextLine();

                        nomes.add(nome);

                        System.out.println("Nome adicionado!");
                        break;

                    case 2:
                        System.out.print("Digite o índice que deseja remover: ");
                        int indiceRemover = sc.nextInt();

                        nomes.remove(indiceRemover);

                        System.out.println("Nome removido!");
                        break;

                    case 3:
                        System.out.print("Digite o índice que deseja acessar: ");
                        int indiceAcessar = sc.nextInt();

                        System.out.println("Nome: " + nomes.get(indiceAcessar));
                        break;

                    case 4:
                        System.out.println("Lista: " + nomes);
                        break;

                    case 5:
                        System.out.println("Programa encerrado.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida!");

                }

            } catch (IndexOutOfBoundsException e) {

                System.out.println("Erro: índice inválido!");

            }
        }
    }
}