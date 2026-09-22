package atividade1;
import java.util.Scanner;
public class PostoCombustivel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Informe o tipo de combustível (G - Gasolina | A - Álcool): ");
       char tipo = sc.next().charAt(0);
       /*caractere - precisa de apenas 1 letra
       char.At - pegar a letra de uma string
       index 0 - pega a primeira letra */
       tipo = Character.toUpperCase(tipo);
       /* transformar a letra em maiúscula, caso ela não esteja */
       System.out.println("Informe a quantidade (Litros): ");
       float litros = sc.nextFloat();
       sc.close();

        float valor = 0;
       if (tipo == 'G'){
            valor = litros * 5.50f; 
            System.out.println("O valor total é: " + valor +"R$.");}
       else if (tipo == 'A'){
            valor = litros * 4;
            System.out.println("O valor total é: " + valor +"R$.");}
       else{
            System.out.println("Tipo incorreto.");
       }

    }
}
