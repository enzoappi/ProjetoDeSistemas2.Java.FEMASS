/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.services.EstadoViatura;
/**
 *
 * @author enzoappi
 */
public class Defeituoso implements EstadoViatura{
    
    @Override
    public void acusarProblema(Viatura viatura) {
        System.out.println("O problema ja foi informado ah Central e a manutencao ja esta sendo providenciada");
    }
    
    @Override
    public void acionarManutencao(Viatura viatura) {
        viatura.setEstadoViatura(new EmManutencao());
        System.out.println("A viatura foi encaminhada para a manutencao!");
    }
    
    @Override
    public void retornoManutencao(Viatura viarura) {
        System.out.println("A viatura ainda esta passando por reparos!");
    }
    
    @Override
    public String toString() {
        return "Defeituoso";
    }
}
