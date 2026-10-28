package atividade_streams;

import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Maria", "Nicoly", "Kamily", "Matheus", "Lara");

        List<String> nomesMaiusculo = nomes.stream()
            .map(nome -> nome.toUpperCase())
            .toList();
        
            System.out.println("Nomes em caixa alta: " + nomesMaiusculo);
    }
}
