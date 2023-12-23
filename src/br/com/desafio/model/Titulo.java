package br.com.desafio.model;

public class Titulo {

    private String nome;
    private String duracao;
    private int anoLancamento;

    public Titulo(String nome, String duracao, int anoLancamento) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
