package quest_av1.buscar_livro;

public class Livro {
    private String[] livros = {"Java", "Python", "Solid", "Node"};

    public String buscarLivroPeloTitulo(String titulo){
        for(String l : livros) {
            if(l.equalsIgnoreCase(titulo));
            return l;
        }
        return null;
    }
}
