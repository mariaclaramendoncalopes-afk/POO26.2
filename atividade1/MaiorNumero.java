package atividade1;
import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros diferentes entre si.");
        System.out.print("Digite o 1° número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o 2° número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o 3° número: ");
        int num3 = sc.nextInt();
        sc.close();

        if (num1 > num2 && num1 > num3){
            System.out.println("O Maior número é: " + num1);
        }else if(num2>num3){
            System.out.println("O Maior número é: " + num2);}
        else{
            System.out.println("O Maior número é: " + num3);}
    }
}
/* Se o n1 é maior q o n2 e o n3 -> n1 é o maior numero
Se não -> se n2 for maior q n3 (n2 já é maior q n1) -> n2 é o maior 
Se não -> nem n1, nem n2 são maiores que n3 */