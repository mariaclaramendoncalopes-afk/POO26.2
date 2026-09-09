package bombacombustivel;

public class BombaCombustivel {
    private String tipoCombustivel;
    private Double valorLitro;
    private Double quantidadeCombustivelNaBomba;

    public BombaCombustivel(String tipoCombustivel, Double valorLitro, Double quantidadeCombustivelNaBomba) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }

    public void abastecerPorValor(Double valor){
        Double litros = valor / valorLitro;

        if(litros>quantidadeCombustivelNaBomba){
            System.out.println("Não tem combustível suficiente na bomba");
        }else{
            quantidadeCombustivelNaBomba-=litros;
        }
        System.out.println("Quantidade de litros colocada: " + litros);
    }

    public void abastecerPorLitro(Double litros){
        Double valor = litros*valorLitro;
        if(litros>quantidadeCombustivelNaBomba){
            System.out.println("Não tem combustível suficiente na bomba");
        }else{
            quantidadeCombustivelNaBomba-=litros;
        }

        System.out.println("Valor a pagar: " + valor);
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(Double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public Double getQuantidadeCombustivelNaBomba() {
        return quantidadeCombustivelNaBomba;
    }

    public void setQuantidadeCombustivelNaBomba(Double quantidadeCombustivelNaBomba) {
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }

    
}
