package atividade3.acessoarray;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AcessoArray acessar = new AcessoArray();
        Scanner sc = new Scanner(System.in);
        int posicao;
        while (true){
            try{
                System.out.println("Digite a posição desejada (0 a 4): ");
                posicao = sc.nextInt();
                System.out.println(acessar.acessarNome(posicao));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição inválida! O vetor só possui 5 posições (0 a 4).");
                System.out.println(e.getMessage());
            }
        }
    }
}
