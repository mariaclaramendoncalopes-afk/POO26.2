package atividade_tratamento_erro;

public class Q5 {
    public static void main(String[] args) {

        String[] palavras = {"java", "python", null, "javascript"};

        for (int i = 0; i < palavras.length; i++) {

            try {
                System.out.println(palavras[i].toUpperCase());

            } catch (NullPointerException e) {
                System.out.println("Elemento nulo encontrado.");
            }
        }
    }
}
