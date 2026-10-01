package atividade_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoverDuplicatas {
    public static void main(String[] args) {
        List<String> nomesRep = Arrays.asList("Ana","Bruno","Ana","Carla","Bruno","Diego");
        Set<String> conjunto = new LinkedHashSet<>(nomesRep); //o LinkedHashSet serve Para remover valores identicos e manter a ordem de inserção dos elementos
        //transforma a lista nomesRep(que ja está com os valores) em set
        List<String> nomes = new ArrayList<>(conjunto);
        //cria uma nova lista com os nomes que não se repetem

        System.out.println("Antes: " + nomesRep);
        System.out.println("Depois: " + nomes);
    }
}
