package controle_lampada;

public class LampadaInteligente {
    private Boolean ligada;
    private Integer intensidade;
    private String cor;

    

    public LampadaInteligente(Boolean ligada, Integer intensidade, String cor) {
        this.ligada = ligada;
        this.intensidade = intensidade;
        this.cor = cor;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void ajustarIntensidade(int valor){
        if(ligada==true){
            intensidade = valor;
        }else{
            intensidade = 0;
            System.out.println("A intensidade da luz não pode ser alterada porque ela está apagada.");
        }
    }

    public void mudarCor(String novaCor){
        if(ligada==true){
            cor = novaCor;
        }else{
            cor = null;
            System.out.println("A cor da luz não pode ser alterada porque ela está apagada.");
        }
    }

    @Override
    public String toString() {
        return "A luz está ligada?" + ligada + "\n Intensidade" + intensidade + "\n Cor: " + cor;
    }


}