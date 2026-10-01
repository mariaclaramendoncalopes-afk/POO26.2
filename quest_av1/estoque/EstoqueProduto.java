package quest_av1.estoque;

public class EstoqueProduto {
    private String descricao;
    private int quantidadeEmEstoque;
    public EstoqueProduto(String descricao){
        this.descricao = descricao;
        this.quantidadeEmEstoque = 0;
    }

    public void adicionarEstoque(int quant){
        if(quant<=0){
            System.out.println("Quantidade inválida!");
        }
        this.quantidadeEmEstoque += quant;
    }

    public void removerEstoque(int quant){
        if(quant> quantidadeEmEstoque){
            System.out.println("Quantidade inválida!");
        }
        this.quantidadeEmEstoque -= quant;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

}
