package atividade_collections;

import java.util.Map;
import java.util.TreeMap;

public class OrdenarMapaPorChavesTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> pares = new TreeMap<>();
        pares.put("Rafael", 33);
        pares.put("Beatriz", 27);
        pares.put("Lucas", 19);
        pares.put("Amanda", 45);
        pares.put("Gustavo", 22);

        for (Map.Entry<String,Integer> par : pares.entrySet()) {
            System.out.println(par.getKey() + ": " + par.getValue());
        }

        System.out.println("Primeira: " + pares.firstKey() + " | Última: " + pares.lastKey());
        
    }
}
