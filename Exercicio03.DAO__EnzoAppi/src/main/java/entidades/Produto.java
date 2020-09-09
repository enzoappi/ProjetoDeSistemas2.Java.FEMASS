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
public class Produto implements Dao{
    
    private int numero;
    private String descricao;

    public Produto(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void inserir() {
        System.out.println("Produto inserido...");
    }
    
    public void excluir() {
        System.out.println("Produto excluido...");
    }
    
    public void localizar() {
        System.out.println("Produto localizado...");
    }
    
}
