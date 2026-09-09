package atividade3.calculadoramenu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CalculadoraMenu calculadora = new CalculadoraMenu();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("""
                ===== CALCULADORA =====
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Dividir
                5 - Sair
                """);
                
            try{
                System.out.println("Escolha uma opção: ");
                int opc = Integer.parseInt(sc.nextLine());

                if(opc == 5){
                    break;
                }

                if(opc < 1 || opc > 5){
                    throw new CalculadoraMenuException("Opção de menu inválida! Escolha uma opção (1 - 5).");
                }

                System.out.print("Digite o primeiro número: ");
                int n1 = Integer.parseInt(sc.nextLine());
                System.out.print("Digite o segundo número: ");
                int n2 = Integer.parseInt(sc.nextLine());
                System.out.println();

                if (opc == 1){
                    System.out.println(calculadora.somar(n1,n2));
                    System.out.println("\n");
                } else if(opc == 2){
                    System.out.println(calculadora.subtrair(n1, n2));
                    System.out.println("\n");
                } else if (opc == 3){
                    System.out.println(calculadora.multiplicar(n1,n2));
                    System.out.println("\n");
                }else{
                    System.out.println(calculadora.dividir(n1, n2));
                    System.out.println("\n");
                }
            } catch (CalculadoraMenuException e){
                System.out.println(e.getMessage());

            } catch (DivisaoPorZeroException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e){
                System.out.println("Número de formato incorreto, digite um número. Erro: " + e.getMessage());
            } finally {
                System.out.println("Operação concluída.");
                System.out.println("\n\n");
            }
        }
        sc.close();
        System.out.print("Calculadora Encerrada.");
    }
}
