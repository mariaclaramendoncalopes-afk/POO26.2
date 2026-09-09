package atividade3.referencianula;

public class App {
    public static void main(String[] args) {
        ReferenciaNula rn = new ReferenciaNula();
        String nula = null;
        rn.tamanho(nula);        
    }
}
/*Como o valor da variável é nulo, ela não tem tamanho, logo o length não conseguirá medir o tamanho da variável. */