package atividade_tratamento_erro;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu telefone (9 dígitos): ");
        String telefone = sc.nextLine();

        try {
            validarTelefone(telefone);
            System.out.println("Telefone válido!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static void validarTelefone(String telefone) {

        if (telefone.length() != 9) {
            throw new IllegalArgumentException(
                "O telefone deve possuir exatamente 9 dígitos."
            );
        }

        for (int i = 0; i < telefone.length(); i++) {

            if (!Character.isDigit(telefone.charAt(i))) {
                throw new IllegalArgumentException(
                    "O telefone deve conter apenas números."
                );
            }
        }
    }
}