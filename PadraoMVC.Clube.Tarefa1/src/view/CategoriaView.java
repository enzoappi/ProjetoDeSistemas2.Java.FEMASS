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
public class CategoriaView {
    
    public void imprimeDetalhesDaCategoria(String descricaoCategoria) {
        JOptionPane.showMessageDialog(null, "Dados da Categoria:" 
                + "\n\nDescricao da categoria: " + descricaoCategoria);
    }
}
