/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class CompraView {
    
    public void imprimeDetalhesDaCompra(Integer codigo, String descricao, double valor) {
        JOptionPane.showMessageDialog(null, "Dados da Compra:" 
                + "\n\nCodigo:" + codigo 
                + "\nDescricao: " + descricao 
                + "\nValor: " + valor);
    }
}
