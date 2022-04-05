package br.com.letscode.projetofinal.entities;

import br.com.letscode.projetofinal.enums.TipoRefeicaoEnum;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static br.com.letscode.projetofinal.enums.TipoRefeicaoEnum.*;

public class Cardapio {
    private List<Refeicao> refeicoes = new ArrayList<>();

    public List<Refeicao> getRefeicoes() {return refeicoes;}
    public void setRefeicoes(List<Refeicao> refeicoes) {this.refeicoes = refeicoes;}

    public static List<Refeicao> montarCardapio(){
        return  Arrays.asList(
                new Refeicao(TipoRefeicaoEnum.LANCHE, "Burger", 30.0),
                new Refeicao(TipoRefeicaoEnum.LANCHE, "Pizza", 45.0),
                new Refeicao(TipoRefeicaoEnum.LANCHE, "Fogazza", 20.0),
                new Refeicao(TipoRefeicaoEnum.COMIDA, "Pasta", 30.0),
                new Refeicao(TipoRefeicaoEnum.COMIDA, "Lasanha", 70.0),
                new Refeicao(TipoRefeicaoEnum.COMIDA, "Polpetone", 50.0),
                new Refeicao(TipoRefeicaoEnum.BEBIDA, "Refrigerante", 5.0),
                new Refeicao(TipoRefeicaoEnum.BEBIDA, "Suco", 7.0),
                new Refeicao(TipoRefeicaoEnum.BEBIDA, "Vinho", 50.0)

        );
    }

    public void exibirCardapio(){
        System.out.println("========CARDÁPIO========");
        System.out.println("|LANCHES: ");
        for(Refeicao prato : refeicoes){
            if(prato.getTipoRefeicao().equals(LANCHE)) {
                System.out.println(prato.toString());
            }
        }
        System.out.println("========================");
        System.out.println("|COMIDAS: ");
        for(Refeicao prato : refeicoes){
            if(prato.getTipoRefeicao().equals(COMIDA)) {
                System.out.println(prato.toString());
            }
        }
        System.out.println("========================");
        System.out.println("|BEBIDAS: ");
        for(Refeicao prato : refeicoes) {
            if (prato.getTipoRefeicao().equals(BEBIDA)) {
                System.out.println(prato.toString());
            }
        }
    }





}
