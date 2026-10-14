package atividade_tratamento_erro;

public class Q7 {
    public static void main(String[] args) {

        String[] valores = {"10.5", "20.3", "abc", "15.8", "dez"};

        for (int i = 0; i < valores.length; i++) {

            try {
                double numero = Double.parseDouble(valores[i]);

                System.out.println("Número convertido: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("Não foi possível converter: " + valores[i]);
            }
        }
    }
}