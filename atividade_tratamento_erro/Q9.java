package atividade_tratamento_erro;

import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40);

        try {
            double media = calcularMedia(numeros);

            System.out.println("Média: " + media);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularMedia(List<Integer> numeros) {

        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia ou ser nula.");
        }

        int soma = 0;

        for (Integer numero : numeros) {

            if (numero == null) {
                throw new IllegalArgumentException("A lista contém um valor inválido.");
            }

            soma += numero;
        }

        return (double) soma / numeros.size();
    }
}