package atividade_streams;

import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Pedro", "Ana", "José", "Maria", "Antonia", "Augusto", "Carlos", "Francisco");

        List<String> nomesComA = nomes.stream()
            .filter(nome -> nome.startsWith("A"))
            .sorted()
            .toList();

        System.out.println("Nomes que começam com a letra A: " + nomesComA);
    }
}
