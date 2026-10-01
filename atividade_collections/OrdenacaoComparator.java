package atividade_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoComparator {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 28 ,"111.111.111-11"));
        pessoas.add(new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.add(new Pessoa("Carla", 35, "333.333.333-33"));
        pessoas.add(new Pessoa("Diego", 22, "444.444.444-44"));

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade)); // Ordene a lista | Compare as pessoas pela idade | :: -> para cada pessoa chame getIdade()
        System.out.println(pessoas);

        System.out.println("\n");

        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println(pessoas);
        // Compara por nome e mostra em ordem alfabética
    }
}
