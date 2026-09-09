package atividade3.divisaosegura;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DivisaoSegura divisaoSegura = new DivisaoSegura();
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int opcao;

    String menu = "Digite -1 para sair ou 0 para continuar: ";
    while (true){
        try{
            System.out.println(menu);
            opcao = sc.nextInt();

            if(opcao == -1){
                break;
            }

            System.out.println("Digite o dividendo: ");
            num1 = sc.nextInt();
            System.out.println("Digite o divisor: ");
            num2 = sc.nextInt();
            System.out.println(divisaoSegura.divisao(num1, num2)); 
        }
        catch (ArithmeticException e){
            System.out.println("Não é possivel fazer uma divisão com 0.");
        }
        }
    }
}