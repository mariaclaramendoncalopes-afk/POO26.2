package atividade_collections;

import java.util.HashSet;

public class VerificarElemento {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        int num1 = 15;
        int num2 = 18;

        if(numeros.contains(num1)){
            System.out.println(num1 +" está no conjunto.");
        }else{
            System.out.println(num1 + " não está no conjunto.");
        }

        if(numeros.contains(num2)){
            System.out.println(num2 +" está no conjunto.");
        }else{
            System.out.println(num2 + " não está no conjunto.");
        }
    }
}
