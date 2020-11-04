/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.services.CalculoValor;

/**
 *
 * @author enzoappi
 */
public class CalculoMensalidade implements CalculoValor{
    
    static double valorMensalidade = 3096.00;

    public String calcular(ContaEstacionamento contaEstacionamento) {
        return Double.toString(valorMensalidade);
    }
}
