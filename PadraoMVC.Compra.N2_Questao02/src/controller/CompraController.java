/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Compra;
import view.CompraView;

/**
 *
 * @author enzoappi
 */
public class CompraController {
    
    private Compra modelCompra;
    private CompraView viewCompra;

    public CompraController(Compra modelCompra, CompraView viewCompra) {
        this.modelCompra = modelCompra;
        this.viewCompra = viewCompra;
    }
    
    public void setRegistroCompra(Integer codigo) {
        this.modelCompra.setCodigo(codigo);
    }
    
    public long getRegistroCompra() {
        return this.modelCompra.getCodigo();
    }
    
    public void setDescricaoCompra(String descricao) {
        this.modelCompra.setDescricao(descricao);
    }
    
    public String getDescricaoCompra() {
        return this.modelCompra.getDescricao();
    }
    
    public void setValor(double valor) {
        this.modelCompra.setValor(valor);
    }
    
    public double getValor() {
        return this.modelCompra.getValor();
    }
    
    public void atualizarViewCompra() {
        this.viewCompra.imprimeDetalhesDaCompra(this.modelCompra.getCodigo(), this.modelCompra.getDescricao(), this.modelCompra.getValor());
    }
}
