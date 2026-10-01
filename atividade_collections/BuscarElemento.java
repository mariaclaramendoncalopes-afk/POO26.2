package atividade_collections;

import java.util.ArrayList;
import java.util.List;

public class BuscarElemento {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        int indice = frutas.indexOf("banana"); // descobre o indice de um elemento dentro da lista
        if (indice != -1){
            System.out.println("'banana' encontrada no índice " + indice);
        } else {
            System.out.println("'banana' não foi encontrada na lista");
        }

        indice = frutas.indexOf("uva");
        if (indice != -1){ // quando o indice é igual a -1, significa que não foi encontrado esse elemento
            System.out.println("'uva' encontrada no índice " + indice);
        }  else {
            System.out.println("'uva' não foi encontrada na lista");
        }      
    }
}
