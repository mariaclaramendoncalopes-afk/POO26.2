import java.util.ArrayList;
import java.util.List;

public class AppPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("José", "123", 30, 'M'));
        pessoas.add(new Pessoa("Maria", "456", 20, 'F'));
        pessoas.add(new Pessoa("Pedro", "789", 40, 'M'));
        pessoas.add(new Pessoa("Ana", "223", 25, 'F'));
        pessoas.forEach(pessoa -> System.out.println(pessoa));

    }
    // shift alt baixo para duplicar linhas
}
