package atividade_1;
import java.util.Scanner;
public class CalculadoraCLI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                ( + ) -- SOMA
                ( - ) -- SUBTRAÇÃO
                ( * ) -- MULTIPLICAÇÃO
                ( / ) -- DIVISÃO
                """);
        System.out.print("Digite a operação que deseja realizar: ");
        String operacao = sc.nextLine();
        
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        sc.close();
        
        int resultado = 0;
        switch(operacao){
            case "+":
            resultado = n1 + n2;
            System.out.print("O resultado da soma de " + n1 + " + " + n2 + " é " + resultado);
            break;

            case "-":
            resultado = n1 - n2;
            System.out.print("O resultado da subtração de " + n1 + " - " + n2 + " é " + resultado);
            break;
            
            case "*":
            resultado = n1 * n2;
            System.out.print("O resultado da multiplicação de " + n1 + " X " + n2 + " é " + resultado);
            break;
            
            case "/":
            resultado = n1 / n2;
            System.out.print("O resultado da divisão de " + n1 + " / " + n2 + " é " + resultado);
            break;
        }

    }
}