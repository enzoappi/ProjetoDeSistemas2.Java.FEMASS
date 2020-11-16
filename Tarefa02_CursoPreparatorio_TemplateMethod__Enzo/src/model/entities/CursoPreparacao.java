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
public class CursoPreparacao {
    
    private CicloEstudo cicloEstudo;

    public CursoPreparacao() {
    }

    public void setCicloEstudo() {
        int resposta = 0;
        
        resposta =  Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o seu nivel de conhecimento?\n" 
                + "\n[1] - Basico" 
                + "\n[2] - Intermediário" 
                + "\n[3] - Avançado"));
        
        switch(resposta) {
            case 1:
                this.cicloEstudo = new CicloBasico();
                break;
            case 2:
                this.cicloEstudo = new CicloIntermediario();
                break;
            case 3:
                this.cicloEstudo = new CicloAvancado();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor selecione um valor correto!");
                setCicloEstudo();
        }
    }

    public void realizar() {
        try{
            this.cicloEstudo.realizar();
        } catch(NullPointerException npe) {
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }
    }
}
