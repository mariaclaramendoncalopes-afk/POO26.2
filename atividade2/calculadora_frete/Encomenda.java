package calculadora_frete;

public class Encomenda {
    private Double pesoKg;
    private Double distanciaKm;
    private Double valorDeclarado;

    public Encomenda(Double pesoKg, Double distanciaKm, Double valorDeclarado) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.valorDeclarado = valorDeclarado;
    }

    public Double calcularFretePadrao(){
        return 5*pesoKg + 0.5*distanciaKm;
    }

    public Double calcularFreteExpresso(){
        return calcularFretePadrao() + 30 + (1/100)*valorDeclarado;
    }

    @Override
    public String toString() {
        return "Peso da encomenda em KG: " + pesoKg + "\n Distancia(KM): " + distanciaKm + "\n Valor declarado: " + valorDeclarado
                + "\nFrete padrão: R$" + calcularFretePadrao() + "\nFrete expresso: R$"
                + calcularFreteExpresso();
    }

    
}
