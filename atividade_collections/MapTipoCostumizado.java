package atividade_collections;

import java.util.HashMap;
import java.util.Map;

public class MapTipoCostumizado {
    public static void main(String[] args) {
        HashMap<String, Pessoa> pessoas = new HashMap<>();
        pessoas.put("111.111.111-11",new Pessoa("Ana", 28 ,"111.111.111-11"));
        pessoas.put("222.222.222-22",new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.put("333.333.333-33",new Pessoa("Carla", 35, "333.333.333-33"));

        for (Map.Entry<String, Pessoa> pessoa : pessoas.entrySet()) {
            System.out.println(pessoa);            
        }

        String cpf = "222.222.222-22";
        System.out.println("Busca retornou: " + pessoas.get(cpf));

        System.out.println("Put retornou: " + pessoas.put("222.222.222-22", new Pessoa("Bruna", 20, "222.222.222-22")));

        System.out.println("Tamanho do mapa: " + pessoas.size());
    }
}
