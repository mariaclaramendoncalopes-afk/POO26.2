package atividade_collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {
   public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(7);
        numeros.add(19);
        numeros.add(3);
        numeros.add(25);

        Collections.sort(numeros); //ordena uma lista em ordem crescente
        System.out.println("Crescente: " + numeros);

        Collections.sort(numeros,Collections.reverseOrder()); //ordena uma lista em ordem decrescente
        System.out.println("Decrescente: " + numeros);
   } 
}
