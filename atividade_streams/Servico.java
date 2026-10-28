package atividade_streams;

public class Servico {
    private TipoServico tipoServico;
    private double valor;

    public Servico(){}

    public Servico(TipoServico tipoServico, double valor) {
        this.tipoServico = tipoServico;
        this.valor = valor;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
