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
public class Conta {
    double saldo;
    EstadoConta estadoConta;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.estadoConta = new ContaPositiva();
        System.out.println("Parabens, sua conta foi criada e seu saldo eh: " + this.saldo);
    }
    
    public void saque(Double valor) {
        this.estadoConta.saque(valor, this);
    }
    
    public void deposito(Double valor) {
        this.estadoConta.deposito(valor, this);
    }

}
