package atividade_collections;

import java.util.HashSet;
import java.util.Iterator;

public class PercorrerRemoverSet {
    public static void main(String[] args) {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("Recife");
        cidades.add("Natal");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("São Luís");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }
        System.out.println("\n");

        Iterator<String> iterator = cidades.iterator(); // cria um iterator que percorre as Strings dentro de cidades
        while (iterator.hasNext(/* observa se ainda tem um elemento na lista - se existir, o while continua*/)) {
            String cidade = iterator.next(/* guarda o valor do próximo elemento do Iterator */);

            if(cidade.contains("S")){ //verifica se o valor guardado em cidade tem o caractere "S"
                iterator.remove(); // se tiver, o iterator irá remover esse valor da lista
            }
        }
        System.out.println("Restantes: " + cidades);
    }
}
