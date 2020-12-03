/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import javax.swing.JOptionPane;
import model.services.VShale;

/**
 *
 * @author enzoappi
 */
public class Stibier implements VShale{

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Calculo de saturacao VShale pelo STIBIER");
    }
    
}
