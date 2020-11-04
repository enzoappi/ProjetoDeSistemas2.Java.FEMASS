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
public class Socio {
    private long cartao;
    private String nome;
    private String endereco;
    private String email;
    
    //explicitacao dos relacionamentos entre as classes
    public Categoria categoria;
    public Dependente dependente[];
    public Mensalidade mensalidade[];

    public void setCartao(long cartao) {
        this.cartao = cartao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public long regSocio() {
        return this.cartao;
    }

    public String consSocio() {
        return "\nDados do Socio:" + "\nCartao: " + this.cartao + "\nNome: " + this.nome + "\nEndereco: " + this.endereco + "\nEmail: " + this.email;
    }
}
