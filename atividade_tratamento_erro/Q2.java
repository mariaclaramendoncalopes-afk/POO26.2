package atividade_tratamento_erro;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            String num_String = sc.nextLine();
            Integer num_Int = Integer.parseInt(num_String);
            System.out.println("Número convertido!");
        } catch (NumberFormatException ex){
            System.out.println("A conversão de String para Integer não deu certo! " + ex.getMessage());
        }

    }
}
