/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author enzoappi
 */
public class Dependente {
    private long cartao;
    private String nome;
    private String parentesco;
    private String email;
    
    //explicitacao dos relacionamentos entre as classes
    public Socio socio;

    public void setCartao(long cartao) {
        this.cartao = cartao;
    }
    
    public long getCartao() {
        return this.cartao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return this.parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long regDep() {
        new Dependente();
        return this.cartao;
    }
}
