package atividade_collections;

import java.util.HashMap;
import java.util.Map;

public class ArmazenarChaveValor {
    public static void main(String[] args) {
        Map<String, Integer> pares = new HashMap<>();
        pares.put("João",30);
        pares.put("Maria",25);
        pares.put("Pedro",41);

        System.out.println(pares.entrySet() + "\n");

        for (Map.Entry<String, Integer> par : pares.entrySet()) {
            System.out.println(par.getKey() + " tem " + par.getValue() + " anos.");
        }
        /* */
    }
}
