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
public class SocioView {
    
    public void imprimeDetalhesDoSocio(long cartaoSocio, String nomeSocio, String enderecoSocio, String emailSocio) {
        JOptionPane.showMessageDialog(null, "Dados do Socio:" 
                + "\n\nCartão:" + cartaoSocio 
                + "\nNome: " + nomeSocio 
                + "\nEndereco: " + enderecoSocio 
                + "\nE-mail: " + emailSocio);
    }
}
