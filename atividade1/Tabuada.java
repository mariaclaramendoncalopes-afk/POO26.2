package atividade1;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número que deseja para ver a sua tabuada: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println("Tabuada do "+numero);
        for(int i = 1; i < 11; i++){
            System.out.println(numero +" X "+ i + " = " + (numero*i));
        }
    }
}
