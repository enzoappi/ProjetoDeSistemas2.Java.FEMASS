/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import model.entities.CursoPreparacao;

/**
 *
 * @author enzoappi
 */
public class TesteCursoPreparacao {
    public static void main(String[] args) {
        
        CursoPreparacao cursoPreparacao = new CursoPreparacao();
        cursoPreparacao.setCicloEstudo();
        cursoPreparacao.realizar();
        
    }
}
