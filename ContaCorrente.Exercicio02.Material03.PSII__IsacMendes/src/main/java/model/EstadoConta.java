/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author enzoappi
 */
public interface EstadoConta {
    public void saque(Double valor, Conta conta);
    public void deposito(Double valor, Conta conta);
}
