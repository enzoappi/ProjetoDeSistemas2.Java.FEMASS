/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class ContaNegativa extends EstadoConta{
    
    public ContaNegativa(Conta conta) {
        super(conta);
    }
    
    @Override
    public void saque(Double valor) {
        if(conta.getSaldo() - valor >= -100) {
            conta.setSaldo(conta.getSaldo() - valor);
            conta.setEstadoConta(new ContaNegativa(conta));
        }
        else {
            conta.setSaldo(conta.getSaldo() - valor);
            conta.setEstadoConta(new ContaBloqueada(conta));
            System.out.println("A conta foi bloqueada por motivos de seguranca");
        }
    }
    
    @Override
    public void deposito(Double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        if(conta.getSaldo() < -100) {
            conta.setEstadoConta(new ContaBloqueada(conta));
        }
        if(conta.getSaldo() < 0){
            conta.setEstadoConta(this);
        }
        if(conta.getSaldo() >= 0) {
            conta.setEstadoConta(new ContaPositiva(conta));
        }
    }
}
