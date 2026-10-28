package atividade_streams;

import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(4, 25, 32,78,45,13,10,77,58,61,52);

        List<Integer> numerosDobrados = numeros.stream()
            .map(numero -> numero * 2)
            .toList();

        numerosDobrados.forEach(numDobrado -> System.out.println(numDobrado));
    }
}
