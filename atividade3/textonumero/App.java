package atividade3.textonumero;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TextoNumero conversor = new TextoNumero();
        Scanner sc = new Scanner(System.in);
        String idade;

        while(true){
            try{
                System.out.println("Digite sua idade: ");
                idade = sc.nextLine();
                System.out.println("Sua idade é: " + conversor.textoNumero(idade));
            } catch (Exception e){
                System.out.println("Entrada inválida! Digite apenas números.");
            }
        }
    }
}
