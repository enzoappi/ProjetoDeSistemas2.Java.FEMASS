/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Socio;
import view.SocioView;

/**
 *
 * @author enzoappi
 */
public class SocioController {
    
    private Socio modelSocio;
    private SocioView viewSocio;

    public SocioController(Socio modelSocio, SocioView viewSocio) {
        this.modelSocio = modelSocio;
        this.viewSocio = viewSocio;
    }
    
    public void setCartaoSocio(long cartao) {
        this.modelSocio.setCartao(cartao);
    }
    
    public long getRegistroSocio() {
        return this.modelSocio.regSocio();
    }
    
    public void setNomeSocio(String nome) {
        this.modelSocio.setNome(nome);
    }
    
    public String getNomeSocio() {
        return this.modelSocio.getNome();
    }
    
    public void setEnderecoSocio(String endereco) {
        this.modelSocio.setEndereco(endereco);
    }
    
    public String getEnderecoSocio() {
        return this.modelSocio.getEndereco();
    }
    
    public void setEmailSocio(String email) {
        this.modelSocio.setEmail(email);
    }
    
    public String getEmailSocio() {
        return this.modelSocio.getEmail();
    }
    
    public void atualizarViewSocio() {
        this.viewSocio.imprimeDetalhesDoSocio(this.modelSocio.regSocio(), this.modelSocio.getNome(), this.modelSocio.getEndereco(), this.modelSocio.getEmail());
    }
}
