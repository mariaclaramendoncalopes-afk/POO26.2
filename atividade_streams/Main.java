package atividade_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Autonomo> autonomos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE AUTÔNOMOS =====");
            System.out.println("1 - Cadastrar autônomo");
            System.out.println("2 - Cadastrar serviço");
            System.out.println("3 - Consultar serviços pelo CPF");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n--- CADASTRAR AUTÔNOMO ---");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    Autonomo autonomo = new Autonomo(nome, cpf);

                    autonomos.add(autonomo);

                    System.out.println("Autônomo cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\n--- CADASTRAR SERVIÇO ---");

                    System.out.print("Digite o CPF do autônomo: ");
                    String cpfBusca = sc.nextLine();

                    Autonomo encontrado = autonomos.stream()
                            .filter(a -> a.getCpf().equals(cpfBusca))
                            .findFirst()
                            .orElse(null);

                    if (encontrado == null) {

                        System.out.println("Autônomo não encontrado!");

                    } else {

                        System.out.println("\nTipos de serviço:");
                        System.out.println("1 - ELÉTRICO");
                        System.out.println("2 - HIDRÁULICO");
                        System.out.println("3 - ALVENARIA");

                        System.out.print("Escolha o tipo: ");
                        int tipo = sc.nextInt();

                        TipoServico tipoServico;

                        switch (tipo) {

                            case 1:
                                tipoServico = TipoServico.ELETRICO;
                                break;

                            case 2:
                                tipoServico = TipoServico.HIDRAULICO;
                                break;

                            case 3:
                                tipoServico = TipoServico.ALVENARIA;
                                break;

                            default:
                                System.out.println("Tipo de serviço inválido!");
                                continue;
                        }

                        System.out.print("Valor do serviço: R$ ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        Servico servico = new Servico(tipoServico, valor);

                        encontrado.adicionarServico(servico);

                        System.out.println("Serviço cadastrado com sucesso!");
                    }

                    break;

                case 3:

                    System.out.println("\n--- CONSULTAR SERVIÇOS ---");

                    System.out.print("Digite o CPF do autônomo: ");
                    String cpfConsulta = sc.nextLine();

                    Autonomo autonomoConsulta = autonomos.stream()
                            .filter(a -> a.getCpf().equals(cpfConsulta))
                            .findFirst()
                            .orElse(null);

                    if (autonomoConsulta == null) {

                        System.out.println("Autônomo não encontrado!");

                    } else {

                        System.out.println("\nAutônomo: "
                                + autonomoConsulta.getNome());

                        if (autonomoConsulta.getListaServico().isEmpty()) {

                            System.out.println("Esse autônomo não possui serviços cadastrados.");

                        } else {

                            System.out.println("Serviços:");

                            for (Servico servico : autonomoConsulta.getListaServico()) {
                                System.out.println(servico);
                            }
                        }
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado!");

                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
