package atividade_streams;

import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<String> palavras = List.of("Anel", "Arco", "Cerveja");

        List<String> palavras5mais = palavras.stream()
            .filter(palavra -> palavra.length() > 5)
            .toList();

        System.out.println("Palavras que tem mais de 5 letras: " + palavras5mais);
    }
}
