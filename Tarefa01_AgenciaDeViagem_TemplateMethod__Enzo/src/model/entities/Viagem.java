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
public abstract class Viagem {
    public abstract String dia_1();
    public abstract String dia_2();
    public abstract String dia_3();
    
    public void itinerarioViagem() {
        JOptionPane.showMessageDialog(null, "Viagem Campestre\n" 
                + "\nItinerário de viagem:\n" 
                + "\nDia 1: " + dia_1() 
                + "\nDia 2: " + dia_2() 
                + "\nDia 3: " + dia_3());
    };
}
