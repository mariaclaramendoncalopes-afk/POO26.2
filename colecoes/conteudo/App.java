import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(/*não precisa delimitar*/);//não pode instanciar interface!
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Louise");
        nomes.forEach(n -> System.out.println(n));
        System.out.println("\n");
        
        //remover um valor expecífico
        // for(String nome: nomes){
        //     if(nome.equalsIgnoreCase("pedro"));
        //         nomes.remove(nome);
        // } ou
        nomes.removeIf(n -> n.equalsIgnoreCase("pedro"));
        Collections.reverse(nomes);
        nomes.forEach(n -> System.out.println(n));
        System.out.println("\n");
        

        nomes.set(1, "Nome alterado");
        nomes.forEach(n -> System.out.println(n));
        System.out.println("\n");

        //Remove um elemento da lista pelo indice
        nomes.remove(2);

        //ordenar os elementos da lista em ordem (alfabetica - String)
        Collections.sort(nomes);

        nomes.forEach(n -> System.out.println(n));
        System.out.println("\n");

        List<Integer> idades = new ArrayList<>();
        idades.add(10);
        idades.add(23);
        idades.add(9);
        idades.add(20);
        Collections.sort(idades);
        idades.forEach(idade -> System.out.println(idade));

        //imprime a quantidade de itens em uma lista
        System.out.println("total de elementos contidos no array: " + idades.size());

        //apaga todos os elementos do array
        idades.clear();
        System.out.println("total de elementos contidos no array: " + idades.size());
    }
}
