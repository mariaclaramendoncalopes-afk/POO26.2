package atividade_tratamento_erro;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String texto = null;
        if (texto == null) {
            try {
                System.out.println("A String é Nula.");

                System.out.println("Comprimento: " + texto.length());
            } catch (NullPointerException e) {
                System.out.println("Erro! Não é possível acessar o comprimento de uma String nula! " + e.getMessage());
            }
        }
    }
}
