package br.com.letscode.projetofinal;

import br.com.letscode.projetofinal.entities.Cardapio;
import br.com.letscode.projetofinal.entities.Pedido;
import br.com.letscode.projetofinal.entities.Refeicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DeliveryCantinaApplication {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        Refeicao prato = new Refeicao();
        Pedido pedido = new Pedido();
        double taxaEntrega = 0;
        double valorTotal = 0;


        List<Refeicao> itensCardapio = Cardapio.montarCardapio();
        cardapio.setRefeicoes(itensCardapio);


        List<Refeicao> itensPedido = new ArrayList<>();

        Scanner opcMenu = new Scanner (System.in);
        System.out.println("*****SEJA BEM-VINDO À CANTINA CODIFICHIAMO!*****");

        do{
            System.out.println("==========MENU==========\n" +
                    "1 - CARDÁPIO\n" +
                    "2 - REALIZAR PEDIDO\n" +
                    "3 - SAIR\n" +
                    "========================");

            switch(opcMenu.nextInt()){
                case 1:
                    cardapio.exibirCardapio();
                    break;
                case 2:

                    System.out.println("=======MENU PEDIDO=======");

            }
        }while(true);










    }

}
