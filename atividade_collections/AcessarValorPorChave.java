package atividade_collections;

import java.util.HashMap;
import java.util.Map;

public class AcessarValorPorChave {
    public static void main(String[] args) {
        Map<String, Integer> pares = new HashMap<>();
        pares.put("João",30);
        pares.put("Maria",25);
        pares.put("Pedro",41);

        //get() pega o valor correspondente a chave fornecida
        String chave = "João";
        int idade = pares.get(chave); 
        System.out.print(chave + " tem " + idade + " anos.\n");

        //containsKey() verifica se a chave existe, se não existir retorna false
        chave = "Ana";
        boolean existeChave = pares.containsKey(chave); 
        if (existeChave == true){
            idade = pares.get(chave);
            System.out.print(chave + " tem " + idade + " anos.");
        } else {
            System.out.print(chave + " não está cadastrada.\n");
        }

        //getOrDefault() verifica o valor da chave, caso não exista, é utilizado um valor alternativo.
        chave = "Julia";
        idade = pares.getOrDefault(chave, 0);
        if (idade != 0){
            System.out.print(chave + " tem " + idade + " anos.");
        } else {
            System.out.print(chave + " não está cadastrada.");
        }
    }
}
