package atividade3.idadeinvalida;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        IdadeInvalida i = new IdadeInvalida();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Digite sua idade: ");
            try{
                int idade = sc.nextInt();
                i.cadastrarIdade(idade);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
