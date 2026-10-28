package atividade_streams;

import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(4, 25, 32, 5, 45, 13, 8, 77, 58, 2,52);

        long maiorQue10 = numeros.stream()
            .filter(num -> num > 10)
            .count();

        System.out.println("Quantidade de números maior que 10: " + maiorQue10);
    }
}
