package atividade_tratamento_erro;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        try {

            validarCPF(cpf);

            System.out.println("CPF válido!");

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());

        }

        sc.close();
    }

    public static void validarCPF(String cpf) {

        if (cpf == null) {
            throw new IllegalArgumentException("CPF não pode ser nulo.");
        }

        if (cpf.length() != 11) {
            throw new IllegalArgumentException(
                "CPF deve possuir exatamente 11 caracteres."
            );
        }

        if (!cpf.matches("\\d+")) {
            throw new IllegalArgumentException(
                "CPF deve conter apenas números."
            );
        }
    }
}