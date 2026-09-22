package atividade1;
import java.util.Scanner;

public class SalarioMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o ganho por hora: ");
        float ganho = sc.nextFloat();
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        int horas = sc.nextInt();
        sc.close();
        float salario = ganho * horas;
        float IR = salario * 0.11f;
        float INSS = salario * 0.08f;
        float sindicato = salario * 0.05f;
        float salario_liquido = salario - IR - INSS - sindicato;


        System.out.println("+| Salário Bruto: " + salario + "R$");
        System.out.println("-| IR (11%) : " + IR + "R$");
        System.out.println("-| INSS (8%) : " + INSS + "R$");
        System.out.println("-| Sindicato (5%) : " + sindicato + "R$");
        System.out.println("=| Salário Líquido: " + salario_liquido + "R$");

    }
}
