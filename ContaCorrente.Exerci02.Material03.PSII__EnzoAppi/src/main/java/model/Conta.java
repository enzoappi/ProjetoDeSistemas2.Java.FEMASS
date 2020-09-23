/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.InputMismatchException;

/**
 *
 * @author enzoappi
 */
public class Conta {
    private Double saldo;
    private EstadoConta estadoConta;

    public Conta(Double valorInicial) {
        if(valorInicial >= 0) {
            this.saldo = valorInicial;
            this.estadoConta = new ContaPositiva(this);
        }else{
            throw new InputMismatchException("O saldo inicial precisa ser maior ou igual a zero, no momento de abertura da conta!");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getEstadoConta() {
        return estadoConta.getClass().toString();
    }

    public void setEstadoConta(EstadoConta estadoConta) {
        this.estadoConta = estadoConta;
    }
    
    public void saque(Double valor) {
        this.estadoConta.saque(valor);
    }
    
    public void deposito(Double valor) {
        this.estadoConta.deposito(valor);
    }
}
