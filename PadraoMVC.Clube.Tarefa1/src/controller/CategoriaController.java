/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Categoria;
import view.CategoriaView;

/**
 *
 * @author enzoappi
 */
public class CategoriaController {
    
    private Categoria modelCategoria;
    private CategoriaView viewCategoria;

    public CategoriaController(Categoria modelCategoria, CategoriaView viewCategoria) {
        this.modelCategoria = modelCategoria;
        this.viewCategoria = viewCategoria;
    }

    public void setCategoria(String descricaoCategoria) {
        this.modelCategoria.setDescricaoCategoria(descricaoCategoria);
    }
    
    public String getCategoria() {
        return this.modelCategoria.getDescricaoCategoria();
    }
    
    public void atualizarViewCategoria() {
        this.viewCategoria.imprimeDetalhesDaCategoria(this.modelCategoria.getDescricaoCategoria());
    }
}
