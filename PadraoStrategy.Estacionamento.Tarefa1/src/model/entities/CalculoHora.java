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
public class CalculoHora implements CalculoValor{
    
    static double valorHora = 4.30;

    public String calcular(ContaEstacionamento contaEstacionamento) {
        long horasPassadas = ChronoUnit.HOURS.between(contaEstacionamento.getInicio(), contaEstacionamento.getFim());
        BigDecimal bd = new BigDecimal(horasPassadas * valorHora).setScale(2, RoundingMode.HALF_EVEN);
        return bd.toString();
    }
    
}
