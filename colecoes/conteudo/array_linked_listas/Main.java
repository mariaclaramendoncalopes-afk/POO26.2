package array_linked_listas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       int TOTAL_ELEMENTOS = 100000; 
       List<Integer> ArrayList = new ArrayList<>();
       List<Integer> linkedList = new LinkedList<>();

       System.out.println("--------- Inserção ----------");
       System.out.println("ArrayList\n");//mais aconselhado
        //sempre conhece o próximo - implementa +1 ao indice
       long tempoInsercaoInicial = System.currentTimeMillis();
        for(int i = 0; i < TOTAL_ELEMENTOS; i++){
            ArrayList.addFirst(i);
        }
        long tempoTotal = System.currentTimeMillis() - tempoInsercaoInicial;
        System.out.println("Tempo Inserção Arraylist: " + tempoTotal + "ms.\n");
         
        System.out.println("------------------------------");
        System.out.println("LinkedList");
        //move todo a lista para a direita para inserir um novo elemento
        tempoInsercaoInicial = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ELEMENTOS; i++) {
            linkedList.add(i);
        }
        tempoTotal = System.currentTimeMillis() - tempoInsercaoInicial;
        System.out.println("Tempo Inserção LinkedList: " + tempoTotal + "ms.\n");



        System.out.println("----------------- Leitura ----------------");
        System.out.println("ArrayList");
        //conhece o tamanho da lista, ganhando performance independente do tamanho
        long tempoLeituraInicial = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ELEMENTOS; i++) {
            ArrayList.get(i);
        }
        long tempoLeitura = System.currentTimeMillis() - tempoLeituraInicial;
        System.out.println("Tempo leitura ArrayList: " + tempoLeitura + "ms.\n");

        System.out.println("-----------------------");
        System.out.println("LinkedList");
        //Lê o endereçamento de memória
        tempoLeituraInicial = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ELEMENTOS; i++) {
            linkedList.get(i);
        }
        tempoLeitura = System.currentTimeMillis() - tempoLeituraInicial;
        System.out.println("Tempo leitura LinkedList: " + tempoLeitura + "ms.\n");
    }
}
