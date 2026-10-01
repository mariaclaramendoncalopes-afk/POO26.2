package atividade_collections;

import java.util.HashMap;

public class ModificarValoresMap {
    public static void main(String[] args) {
        HashMap<Integer, String> diasSemana = new HashMap<>();
        diasSemana.put(1,"Segunda-feira");
        diasSemana.put(2,"Terça-feira");
        diasSemana.put(3, "Quarta");
        diasSemana.put(4, "Quinta-feira");
        diasSemana.put(5, "Sexta-feira");
        System.out.println(diasSemana);
        
        diasSemana.replace(3, "Quarta-feira");
        System.out.println(diasSemana);

        diasSemana.replace(6, "Sábado");
        //Não funciona pois o valor da chave não faz parte do Map, logo não da pra ela substituir um valor
    }
}
