package atividade3.referencianula;

public class ReferenciaNula {
    public void tamanho(String variavel){
        try{   
        variavel.length();
        }  catch (Exception e){
            System.out.println("O valor da variável não foi definido.");
        }      
    }
}
