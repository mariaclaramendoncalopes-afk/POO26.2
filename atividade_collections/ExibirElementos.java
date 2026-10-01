package atividade_collections;

import java.util.ArrayList;
import java.util.List;

public class ExibirElementos {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        listaNumeros.add(50);

        for (int i = 0; i < listaNumeros.size(); i++) { //se utiliza size para lista
            System.out.println(listaNumeros.get(i));
        }
        
        System.out.println("\n");
        
        for (Integer numero : listaNumeros) {
            System.out.println(numero);
        }
    }
}
