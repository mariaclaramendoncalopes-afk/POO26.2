package atividade_tratamento_erro;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numeros = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        try {

            System.out.print("Digite a linha: ");
            int linha = sc.nextInt();

            System.out.print("Digite a coluna: ");
            int coluna = sc.nextInt();

            System.out.println("Valor: " + numeros[linha][coluna]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: índice inválido!");

        }
    }
}