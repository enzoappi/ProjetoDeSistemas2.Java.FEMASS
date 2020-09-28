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
public class ContaBloqueada implements EstadoConta{
    
    @Override
    public void saque(Double valor, Conta conta) {
        System.out.println("Sua conta esta bloqueada e nao pode ser feito nenhum saque nela.");
        System.out.println("Seu saldo eh: " + conta.saldo);
    }
    
    @Override
    public void deposito(Double valor, Conta conta) {
        conta.saldo += valor;
        if(conta.saldo >= 0) {
            conta.estadoConta = new ContaPositiva();
            System.out.println("Com o deposito realizado, sua conta esta positiva.");
        }
        else if(conta.saldo >= -100) {
            conta.estadoConta = new ContaNegativa();
            System.out.println("Com o deposito realizado, sua conta esta negativa.");
        }
        System.out.println("Seu saldo eh: " + conta.saldo);
    }
    
}
