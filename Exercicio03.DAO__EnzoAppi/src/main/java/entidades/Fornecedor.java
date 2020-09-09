/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author enzoappi
 */
public class Fornecedor implements Dao{
    
    private String cnpj;
    private String razaoSocial;

    public Fornecedor(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public void inserir() {
        System.out.println("Fornecedor inserido...");
    }
    
    public void excluir() {
        System.out.println("Fornecedor excluido...");
    }
    
    public void localizar() {
        System.out.println("Fornecedor localizado...");
    }
    
}
