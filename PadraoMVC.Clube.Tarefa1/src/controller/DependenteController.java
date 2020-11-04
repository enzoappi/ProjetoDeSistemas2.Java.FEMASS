/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Dependente;
import view.DependenteView;

/**
 *
 * @author enzoappi
 */
public class DependenteController {
    
    private Dependente modelDependente;
    private DependenteView viewDependente;

    public DependenteController(Dependente modelDependente, DependenteView viewDependente) {
        this.modelDependente = modelDependente;
        this.viewDependente = viewDependente;
    }

    public void setCartaoDependente(long cartao) {
        this.modelDependente.setCartao(cartao);
    }
    
    public long getCartaoDependente() {
        return this.modelDependente.getCartao();
    }
    
    public void setNomeDependente(String nome) {
        this.modelDependente.setNome(nome);
    }
    
    public String getNomeDependente() {
        return this.modelDependente.getNome();
    }
    
    public void setParentescoDependente(String parentesco) {
        this.modelDependente.setParentesco(parentesco);
    }
    
    public String getParentescoDependente() {
        return this.modelDependente.getParentesco();
    }
    
    public void setEmailDependente(String email) {
        this.modelDependente.setEmail(email);
    }
    
    public String getEmailDependente() {
        return this.modelDependente.getEmail();
    }
    
    public void atualizarViewDependente() {
        this.viewDependente.imprimeDetalhesDoDependente(this.modelDependente.getCartao(), this.modelDependente.getNome(), this.modelDependente.getParentesco(), this.modelDependente.getEmail());
    }
}
