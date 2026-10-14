package atividade_tratamento_erro;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try{
            Integer[] numeros = new Integer[]{1,2,3,4,5};
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o número do índice para acessar o número da lista: ");
            int indice = sc.nextInt();

            acessarPeloIndice(indice, numeros);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Erro! Não existe nenhum elemento nesse Índice. " + ex.getMessage());
        }
        

    }

    public static void acessarPeloIndice (int indice, Integer[] lista){ //lista é o Integer
        int retorno = lista[indice];
        System.out.println(retorno);;
    }
}
