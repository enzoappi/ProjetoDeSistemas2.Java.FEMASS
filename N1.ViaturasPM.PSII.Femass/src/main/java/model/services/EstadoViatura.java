/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import model.entities.Viatura;

/**
 *
 * @author enzoappi
 */
public interface EstadoViatura {
    public void acusarProblema(Viatura viatura);
    public void acionarManutencao(Viatura viatura);
    public void retornoManutencao(Viatura viarura);
    
}
