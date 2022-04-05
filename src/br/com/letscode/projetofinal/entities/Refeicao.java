package br.com.letscode.projetofinal.entities;

import br.com.letscode.projetofinal.enums.TipoRefeicaoEnum;

public class Refeicao {
    private TipoRefeicaoEnum tipoRefeicao;
    private String nome;
    private double preco;

    public Refeicao(TipoRefeicaoEnum tipoRefeicao, String nome, double preco) {
        this.tipoRefeicao = tipoRefeicao;
        this.nome = nome;
        this.preco = preco;
    }

    public Refeicao() {

    }

    public TipoRefeicaoEnum getTipoRefeicao() {return this.tipoRefeicao;}
    public void setTipoRefeicao(TipoRefeicaoEnum tipoRefeicao) {this.tipoRefeicao = tipoRefeicao;}

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}

    @Override
    public String toString() {
        return "| . " + nome + " - R$" + preco + "\n";
    }
}
