package atividade_streams;

import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(4, 25, 32,78,45,13,10,77,58,61,52);

        int maiorNumero = numeros.stream()
            .mapToInt(num -> num)
            .max()
            .orElse(0);

        System.out.println("O maior número da lista: " + maiorNumero);
    }
}
