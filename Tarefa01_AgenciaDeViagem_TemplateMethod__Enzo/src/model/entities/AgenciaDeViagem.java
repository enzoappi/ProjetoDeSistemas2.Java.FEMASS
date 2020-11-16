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
public class AgenciaDeViagem {
    
    public void organizar_viagem() {
        int resposta = 0;
        
        resposta =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o tipo de viagem desejada?\n" 
                + "\n[1] - Campestre" 
                + "\n[2] - Praia" 
                + "\n[3] - Histórica"
                + "\n[4] - Gastronômica"));
        
        switch(resposta) {
            case 1:
                new ViagemCampestre().itinerarioViagem();
                break;
            case 2:
                new ViagemPraia().itinerarioViagem();
                break;
            case 3:
                new ViagemHistorica().itinerarioViagem();
                break;
            case 4:
                new ViagemGastronomica().itinerarioViagem();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor selecione um valor correto!");
                organizar_viagem();
        }

    }
}
