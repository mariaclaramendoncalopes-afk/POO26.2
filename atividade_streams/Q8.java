package atividade_streams;

import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
            new Pessoa("Maria", 17),
            new Pessoa("Nicoly", 67),
            new Pessoa("Lara", 21));

        List<String> pessoasDeMaior = pessoas.stream()
            .filter(pessoa -> pessoa.getIdade() >= 18)
            .map(pessoa -> pessoa.getNome())
            .collect(Collectors.toList());

        System.out.println("Pessoas que são maiores de idade: " + pessoasDeMaior);
    }
}
