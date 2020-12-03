/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.CompraController;
import model.Compra;
import view.CompraView;

/**
 *
 * @author enzoappi
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        /*-------------------------------------------------------------------------------------
                                             BANCO DE DADOS
        --------------------------------------------------------------------------------------*/
        //Alimentar a base de dados
        Compra compra = new Compra();
        compra.setCodigo(108653212);
        compra.setDescricao("Televisao de Plasma");
        compra.setValor(2850.00);
        
        /*-------------------------------------------------------------------------------------
                            VISUALIZACAO DAS INFORMACOES DO BANCO DE DADOS
        --------------------------------------------------------------------------------------*/
        
        //Gerarar a view Compra
        CompraView compraView = new CompraView();
        CompraController compraController = new CompraController(compra, compraView);
        compraController.atualizarViewCompra();
        
        /*-------------------------------------------------------------------------------------
                               ATUALIZACAO E VISUALIZACAO DAS INFORMACOES
        ---------------------------------------------------------------------------------------
                                               SOCIO
        --------------------------------------------------------------------------------------*/
        
        //Atualizar os dados do model
        compraController.setRegistroCompra(132356465);
        compraController.setDescricaoCompra("Notebook Lenovo Ideapad L340");
        compraController.setValor(3230.25);
        compraController.atualizarViewCompra();
    }
}
