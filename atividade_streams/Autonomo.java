package atividade_streams;

import java.util.List;

public class Autonomo {
    private String nome;
    private String cpf;
    private List<Servico> listaServico;

    public Autonomo(){}

    public Autonomo(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Servico> getListaServico() {
        return listaServico;
    }

    public void setListaServico(List<Servico> listaServico) {
        this.listaServico = listaServico;
    }

    public void adicionarServico(Servico servico) {
        listaServico.add(servico);
    }
}
