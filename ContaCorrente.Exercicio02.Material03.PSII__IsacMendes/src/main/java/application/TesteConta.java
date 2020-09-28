/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.Conta;


/**
 *
 * @author enzoappi
 */
public class TesteConta {
    public static void main(String[] args) {
        Conta conta_1 = new Conta(100);
        
        conta_1.saque(100.00);
        conta_1.saque(100.00);
        conta_1.saque(10.00);
        conta_1.saque(1.00);
        
        conta_1.deposito(100.00);
        conta_1.deposito(100.00);
    }
}
