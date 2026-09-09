package atividade3.execucaofinally;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ExecucaoFinally exe = new ExecucaoFinally();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite o valor (número): ");
            String dado = sc.nextLine();
            exe.leituraArquivo(dado);
            }
    }
}
