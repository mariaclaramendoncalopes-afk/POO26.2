package atividade3.multiploscatches;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        MultiplosCatches mc = new MultiplosCatches();
        Scanner sc = new Scanner(System.in);
        String num1;
        String num2;

        while(true){
            try{
                System.out.print("Digite o dividendo: ");
                num1 = sc.nextLine();
                System.out.print("Digite o divisor: ");
                num2 = sc.nextLine();
                System.out.println(mc.conversaoDivisao(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println("Não é possivel fazer uma divisão com 0.");
            } catch (Exception e){
                System.out.println("Erro de conversão. Digite o número novamente.");
            }
        }
    }
}