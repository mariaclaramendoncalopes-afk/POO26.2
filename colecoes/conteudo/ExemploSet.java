import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Map;
public class ExemploSet {
    public static void main(String[] args) {
        /*
        Set<String> veiculos = new HashSet<>();
        veiculos.add("BMW");
        veiculos.add("Celta");
        veiculos.add("Ferrari");
        veiculos.add("Celta");
        veiculos.forEach(veiculo -> System.out.println(veiculo)); // não Lê valores duplicados
        */

       Set<Pessoa> pessoas = new HashSet<>();
       pessoas.add(new Pessoa("José", "012", 27, 'M'));
       pessoas.add(new Pessoa("José", "345", 43, 'M'));
       pessoas.add(new Pessoa("Júlia", "678", 18, 'F'));
       pessoas.add(new Pessoa("Jussara", "012", 52, 'F'));
       
       pessoas.forEach(pessoa -> System.out.println(pessoa.getCpf())); // na classe pessoa tem um metodo para comparar os cpf, caso forem iguais o set não irá exibir
    

       Set<Pessoa> pessoasTreeSet = new TreeSet<>(); //ordena pelo atributo selecionado
       pessoasTreeSet.add(new Pessoa("José", "012", 27, 'M'));
       pessoasTreeSet.add(new Pessoa("José", "345", 43, 'M'));
       pessoasTreeSet.add(new Pessoa("Júlia", "678", 18, 'F'));
       pessoasTreeSet.add(new Pessoa("Jussara", "012", 52, 'F'));
       pessoasTreeSet.forEach(pessoa -> System.out.println(pessoa));

       //chave e valor
       Map<String, Pessoa> mapPessoa = new HashMap();
        mapPessoa.put("012", new Pessoa("José", "012", 27, 'M'));
        mapPessoa.put("345", new Pessoa("João", "345", 43, 'M'));
        mapPessoa.put("012", new Pessoa("José", "012", 27, 'M'));
        mapPessoa.entrySet().forEach(c -> {
            System.out.print("Chave: " + c.getKey() + "\nValor: " + c.getValue());
        });
    }
}
