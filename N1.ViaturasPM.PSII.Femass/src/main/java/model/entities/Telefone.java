/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author enzoappi
 */
public class Telefone {
    private String ddd;
    private String numero;
    private boolean fonePrincipal;

    public Telefone() {
    }
    
    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isFonePrincipal() {
        return fonePrincipal;
    }

    public void setFonePrincipal(boolean fonePrincipal) {
        this.fonePrincipal = fonePrincipal;
    }
}
