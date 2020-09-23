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
public class ContaPositiva extends EstadoConta{

    public ContaPositiva(Conta conta) {
        super(conta);
    }

    @Override
    public void saque(Double valor) {
        if(conta.getSaldo() >= 0) {
            if(conta.getSaldo() - valor >= 0) {
                conta.setSaldo(conta.getSaldo() - valor);
                conta.setEstadoConta(new ContaPositiva(conta));
            }
            else {
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
        }
        else {
            if(conta.getSaldo() - valor >= -100) {
                conta.setSaldo(conta.getSaldo() - valor);
                conta.setEstadoConta(new ContaNegativa(conta));
            }
            else {
                conta.setEstadoConta(new ContaBloqueada(conta));
                JOptionPane.showMessageDialog(null, "A conta foi bloqueada por motivos de seguranca");
            }
        }
    }
    
    @Override
    public void deposito(Double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        if(conta.getSaldo() < -100) {
            //implementar o BLOQUEAR A CONTA
        }
        if(conta.getSaldo() < 0){
            //implementar o NEGATIVAR A CONTA
        }
        if(conta.getSaldo() >= 0) {
            conta.setEstadoConta(new ContaPositiva(conta));
        }
    }
}
