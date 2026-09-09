package atividade3.idadeinvalida;

public class IdadeInvalida {
    public void cadastrarIdade(int idade){
        if(idade<0||idade>120){
            throw new IdadeInvalidaException("Erro: A idade deve estar entre 0 e 120 anos.");
        }
        System.out.println("Idade: " + idade);
    }
}
