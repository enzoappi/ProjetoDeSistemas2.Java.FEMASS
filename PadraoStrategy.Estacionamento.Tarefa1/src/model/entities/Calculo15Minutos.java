/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.temporal.ChronoUnit;
import model.services.CalculoValor;

/**
 *
 * @author enzoappi
 */
public class Calculo15Minutos implements CalculoValor{
    
    static double valorPeriodo = 1.075;

    public String calcular(ContaEstacionamento contaEstacionamento) {
        long periodo = ChronoUnit.MINUTES.between(contaEstacionamento.getInicio(), contaEstacionamento.getFim());
        BigDecimal bd = new BigDecimal(periodo/15 * valorPeriodo).setScale(2, RoundingMode.HALF_EVEN);
        return bd.toString();
    }
    
}
