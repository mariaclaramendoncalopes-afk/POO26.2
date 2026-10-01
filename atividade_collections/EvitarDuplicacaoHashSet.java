package atividade_collections;

import java.util.HashSet;

public class EvitarDuplicacaoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);

        System.out.println("Conjunto: " + numeros);
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("add(10) retornou: " + numeros.add(10));

    }
    
}
