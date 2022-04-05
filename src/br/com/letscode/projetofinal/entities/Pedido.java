package br.com.letscode.projetofinal.entities;

import br.com.letscode.projetofinal.enums.TipoRefeicaoEnum;
import br.com.letscode.projetofinal.interfaces.ITaxaEntrega;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements ITaxaEntrega {
    private List<Refeicao> itensPedido = new ArrayList();
    private double valorTotal;
    private double valorTaxa;

    public Pedido(List<Refeicao> itensPedido, double valorTotal, double valorTaxa) {
        this.itensPedido = itensPedido;
        this.valorTotal = valorTotal;
        this.valorTaxa = valorTaxa;
    }

    public Pedido() {
    }

    public List<Refeicao> getItensPedido() {return itensPedido;}
    public void setItensPedido(List<Refeicao> itensPedido) {this.itensPedido = itensPedido;}

    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal;}


//    public double getValorTaxa() {return valorTaxa;}
//    public void setValorTaxa(double valorTaxa) {this.valorTaxa = valorTaxa;}


    public Refeicao adicionarComida(String nomeComida){
        for(int i =0; i < itensPedido.size(); i++){
            if(itensPedido.get(i).getNome().equalsIgnoreCase(nomeComida)
                    && (itensPedido.get(i).getTipoRefeicao().equals(TipoRefeicaoEnum.LANCHE)
                        || itensPedido.get(i).getTipoRefeicao().equals(TipoRefeicaoEnum.COMIDA))){
                return itensPedido.get(i);
            }
        }
        return null;
    }
    public Refeicao adicionarBebida(String nomeBebida){
        for (int i = 0; i < itensPedido.size(); i++){
            if(itensPedido.get(i).getNome().equalsIgnoreCase(nomeBebida)
                    && itensPedido.get(i).getTipoRefeicao().equals(TipoRefeicaoEnum.BEBIDA)){
                return itensPedido.get(i);
            }
        }
        return null;
    }

    public boolean continuarPedido (String continua){return continua.equalsIgnoreCase("S");}

    @Override
    public double calcularTaxaDelivery(List<Refeicao> itensPedido, double valorTaxa){
        for(int i = 0; i < itensPedido.size(); i++){
            if(itensPedido.get(i).getTipoRefeicao().equals(TipoRefeicaoEnum.COMIDA)){
                this.valorTaxa = valorTaxa + 2;
            }else if(itensPedido.get(i).getTipoRefeicao().equals(TipoRefeicaoEnum.LANCHE)
                    || itensPedido.get(i).getTipoRefeicao().equals(TipoRefeicaoEnum.BEBIDA)){
                this.valorTaxa = valorTaxa + 1;

            }
        }
        return this.valorTaxa;
    }

    public double calcularValorTotalPedido(List<Refeicao> itensPedido, double valorTaxa){
        for(int i =0; i< itensPedido.size(); i++){
           this.valorTotal += itensPedido.get(i).getPreco();
           this.valorTotal = this.valorTotal + this.valorTaxa;
        }
        return this.valorTotal;
    }

    public void exibirResumoPedido(){
        System.out.println("=============RESUMO DO PEDIDO============= \n" +
                "| Cantina Codifichiamo \n" +
                "==========================================\n" +
                "| Itens: \n");
        for (int i =0; i < itensPedido.size(); i++){
            System.out.println(itensPedido.get(i).getTipoRefeicao());
            System.out.println(itensPedido.get(i).getNome());
            System.out.println(itensPedido.get(i).getPreco());
            System.out.println("==========================================");
        }
        System.out.println("| Taxa Entrega: R$ " + this.valorTaxa);
        System.out.println("| Valor Total: R$ " + this.valorTotal);
        System.out.println("==========================================");
        System.out.println("| OBRIGADO PELO PEDIDO - CONTE CONOSCO! :)");
        System.out.println("==========================================\n");
    }



}
