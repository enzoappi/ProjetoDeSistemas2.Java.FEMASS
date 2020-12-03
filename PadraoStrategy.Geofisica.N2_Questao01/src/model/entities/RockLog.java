/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import javax.swing.JOptionPane;
import model.services.Saturation;
import model.services.VShale;

/**
 *
 * @author enzoappi
 */
public class RockLog {
    
    private Saturation saturation;
    private VShale vshale;
    
    public RockLog() {
    }
        
    public void setCalculos() {
        int resposta = 0;
        
        resposta =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o tipo de metodo?\n" 
                + "\n[1] - ARCHIE" 
                + "\n[2] - SIMANDOUX" 
                + "\n[3] - APPROACHXPTO"
                + "\n[4] - STIBIER"
                + "\n[5] - CLAVIER"));
        
        switch(resposta) {
            case 1:
                this.saturation = new Archie();
                calc_saturation();
                break;
            case 2:
                this.saturation = new Simandoux();
                calc_saturation();
                break;
            case 3:
                this.saturation = new ApproachXPTO();
                calc_saturation();
                break;
            case 4:
                this.vshale = new Stibier();
                calc_VShale();
                break;
            case 5:
                this.vshale = new Clavier();
                calc_VShale();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor selecione um valor correto!");
        }
    }

    public void calc_saturation() {
        this.saturation.run();
    }
    
    public void calc_VShale() {
        this.vshale.run();
    }
    
}
