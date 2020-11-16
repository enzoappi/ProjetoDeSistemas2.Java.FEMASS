/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public abstract class CicloEstudo {
    
    public abstract String passo_1();
    public abstract String passo_2();
    public abstract String passo_3();
    public abstract String passo_4();
    
    public void realizar() {
        JOptionPane.showMessageDialog(null, "Ciclo de Estudos\n" 
                + "\nProgramação de disciplinas de estudo:"
                + "\nI: " + passo_1()
                + "\nII: " + passo_2()
                + "\nIII: " + passo_3()
                + "\nIV: " + passo_4());
    }
}
