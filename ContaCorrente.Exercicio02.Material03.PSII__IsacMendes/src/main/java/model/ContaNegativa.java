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
public class ContaNegativa implements EstadoConta{
    
    @Override
    public void saque(Double valor, Conta conta) {
        conta.estadoConta = new ContaBloqueada();
        System.out.println("Sua conta acabou de ser bloqueada");
        System.out.println("Seu saldo eh: " + conta.saldo);
    }
    
    @Override
    public void deposito(Double valor, Conta conta) {
        conta.saldo += valor;
        if(conta.saldo >= 0) {
            conta.estadoConta = new ContaPositiva();
        }
        System.out.println("Seu saldo eh: " + conta.saldo);
    }
}
