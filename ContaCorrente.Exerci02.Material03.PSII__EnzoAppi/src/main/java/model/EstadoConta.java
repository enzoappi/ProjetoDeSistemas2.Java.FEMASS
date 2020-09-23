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
public abstract class EstadoConta {
    
    Conta conta;

    public EstadoConta(Conta conta) {
        this.conta = conta;
    }
    
    public abstract void saque(Double valor);
    
    public abstract void deposito(Double valor);
    
}
