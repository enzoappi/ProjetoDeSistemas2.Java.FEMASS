/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import javax.swing.JOptionPane;
import model.services.Saturation;

/**
 *
 * @author enzoappi
 */
public class Simandoux extends Saturation{
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Calculo de saturacao pelo SIMANDOUX");
    }
    
}
