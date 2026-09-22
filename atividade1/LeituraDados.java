package atividade1;
import java.util.Scanner;

public class LeituraDados{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        sc.close();
    }
}