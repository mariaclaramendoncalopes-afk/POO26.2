package atividade_collections;

import java.util.LinkedList;
import java.util.List;

public class UsoLinkedList {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.addFirst(0); //adiciona o 0 no primeiro indice da lista
        numeros.addLast(6); //adiciona o 6 no ultimo indice da lista

        System.out.println(numeros);
        System.out.println("Primeiro: " + numeros.getFirst() + " | Último: " + numeros.getLast());
    }
}
