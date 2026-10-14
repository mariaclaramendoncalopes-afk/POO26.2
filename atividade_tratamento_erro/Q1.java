package atividade_tratamento_erro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numerador: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o denominador: ");
            int n2 = sc.nextInt();
            sc.close();
            float divisao = n1/n2;
            System.out.println("O resultado da divisão é: " + divisao);
            
        } catch (ArithmeticException ex){
            System.out.println("Erro! Um número não pode ser dividido por 0. " + ex.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Erro! Digite um número inteiro! " + e.getMessage());
        }
    }
}
