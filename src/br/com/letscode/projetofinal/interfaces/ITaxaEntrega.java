package br.com.letscode.projetofinal.interfaces;

import br.com.letscode.projetofinal.entities.Refeicao;

import java.util.List;

public interface ITaxaEntrega {
    default double calcularTaxaDelivery(List<Refeicao> itensPedido, double valorTaxa){

        return valorTaxa;
    }
}
