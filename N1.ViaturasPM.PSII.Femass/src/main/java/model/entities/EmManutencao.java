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
public class EmManutencao implements EstadoViatura{
    
    @Override
    public void acusarProblema(Viatura viatura) {
        System.out.println("O defeito ja nos foi sinalizado e os reparos estao em curso.");
    }
    
    @Override
    public void acionarManutencao(Viatura viatura) {
        System.out.println("A manutencao ainda esta em curso.\nPor favor aguarde!");
    }
    
    @Override
    public void retornoManutencao(Viatura viatura) {
        viatura.setEstadoViatura(new DispUso());
        System.out.println("Reparos Concluidos!\nA viatura ja esta disponivel para uso!");
    }
    
    @Override
    public String toString() {
        return "Em manutenção";
    }
}
