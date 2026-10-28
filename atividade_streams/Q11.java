package atividade_streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {
        List<String> palavras = List.of("casa","bola","gato","computador","sol","mar","carro");

        Map<Integer, List<String>> palavrasAgrupadas =palavras.stream()
            .collect(Collectors.groupingBy(String::length));

        System.out.println("Palavras agrupadas por tamanho: " + palavrasAgrupadas);
    }
}