package veiculo;

public class Carro {
    private String modelo;
    private String placa;
    private Boolean ligado;
    private Motorista motorista;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void atribuirMotorista(Motorista motorista){
        this.motorista = motorista;
    }

    public String ligar(){
        if(motorista!=null){
            ligado = true;
            return "O carro está ligado.";
        }else{
            ligado = false;
            return "O carro está desligado.";
        }
    }

}
