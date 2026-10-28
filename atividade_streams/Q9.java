package atividade_streams;

import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, -7, 6, 13, -8);

        boolean verificarPositivos = numeros.stream()
            .allMatch(num -> num > 0);

        System.out.println("Todos os números são positivos?: " + verificarPositivos);
    }
}
