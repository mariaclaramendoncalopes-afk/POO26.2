package atividade1;
import java.util.Scanner;
public class ParImpar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero%2==0){
            System.out.println("O número "+numero+" é PAR.");
        }else{
            System.out.println("O número "+numero+" é IMPAR.");    
        }
    }
}