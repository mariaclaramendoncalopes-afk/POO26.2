package atividade_collections;

import java.util.TreeSet;

public class OrdenacaoAutoTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros); //irá descartar os repetidos e ordenar os elementos
        System.out.println("Menor: " + numeros.first() + " | Maior: " + numeros.last());
    }
}
