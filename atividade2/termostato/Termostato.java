package termostato;

public class Termostato{
    private Double temperaturaAtual;
    private Double temperaturaDesejada;
    private String modo;
    
    public Termostato() {
    }

    public Termostato(Double temperaturaAtual, Double temperaturaDesejada, String modo) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
        this.modo = modo;
    }

    public void definirTemperatura(Double temp){
        if(temp<16){
            temperaturaDesejada = 16.0;
            System.out.println("Temperatura definida para: 16°C");
        }else if(temp>30){
            temperaturaDesejada = 30.0;
            System.out.println("Temperatura definida para: 30°C");
        }else{
            temperaturaDesejada = temp;
            System.out.println("Temperatura definida para: " + temp + "°C");
        }
    }

    public void alterarModo(String novoModo){
        if(novoModo.equals("Resfriar") ||
            novoModo.equals("Aquecer") ||
            novoModo.equals("Desligado")){
            modo = novoModo;
        }else{
            System.out.println("Modo inválido");
        }

    }

    public void executarCiclo(){
        if(modo.equals("Desligar")){
            System.out.println("Sistema desligado.");
        }else if(modo.equals("Aquecer")){
            if(temperaturaDesejada<=temperaturaAtual){
                System.out.println("Meta de temperatura do ambiente atingida.");
            }else{
                System.out.println("Compressor acionado para aquecer o ambiente.");
            }
        }else if(modo.equals("Resfriar")){
            if(temperaturaDesejada>=temperaturaAtual){
                System.out.println("Meta de temperatura do ambiente atingida.");
            }else{
                System.out.println("Compressor acionado para resfriar o ambiente.");
            }
        }
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaDesejada(Double temperaturaDesejada) {
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
}