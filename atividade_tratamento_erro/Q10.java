package atividade_tratamento_erro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data (Dia/Mês/Ano): ");
        String entrada = sc.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date data = formato.parse(entrada);

            System.out.println("Data convertida: " + formato.format(data));

        } catch (ParseException e) {

            System.out.println("Formato de data inválido!");

        }
    }
}