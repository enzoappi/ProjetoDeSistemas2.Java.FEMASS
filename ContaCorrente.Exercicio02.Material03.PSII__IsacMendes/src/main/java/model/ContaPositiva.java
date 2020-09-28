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
public class ContaPositiva implements EstadoConta{

    @Override
    public void saque(Double valor, Conta conta) {
        conta.saldo -= valor;
        if(conta.saldo < 0) {
            conta.estadoConta = new ContaNegativa();
            System.out.println("Com o saque, sua conta esta agora negativa");
        }
        System.out.println("O saldo agora eh: " + conta.saldo);
    }
    
    @Override
    public void deposito(Double valor, Conta conta) {
        conta.saldo += valor;
        System.out.println("Seu saldo eh: " + conta.saldo);
    }
    
}
