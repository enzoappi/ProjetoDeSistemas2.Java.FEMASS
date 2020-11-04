/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import model.entities.ContaEstacionamento;

/**
 *
 * @author enzoappi
 */
public interface CalculoValor {
    
    public String calcular(ContaEstacionamento contaEstacionamento);
    
}
