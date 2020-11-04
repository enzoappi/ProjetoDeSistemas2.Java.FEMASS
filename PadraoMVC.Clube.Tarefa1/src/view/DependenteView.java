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
public class DependenteView {
    
    public void imprimeDetalhesDoDependente(long cartaoDependente, String nomeDependente, String parentescoDependente, String emailDependente) {
        JOptionPane.showMessageDialog(null, "Dados do Dependente:" 
                + "\n\nCartão:" + cartaoDependente 
                + "\nNome: " + nomeDependente 
                + "\nGrau de Parentesco: " + parentescoDependente 
                + "\nE-mail: " + emailDependente);
    }
}
