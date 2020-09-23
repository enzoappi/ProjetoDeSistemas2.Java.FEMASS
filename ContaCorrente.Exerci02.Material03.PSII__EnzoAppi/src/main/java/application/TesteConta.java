/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import model.Conta;

/**
 *
 * @author enzoappi
 */
public class TesteConta {
    public static void main(String[] args) {
        try{
            Conta conta = new Conta(500.0);
            
            System.out.println("\n\nCriando uma conta nova...");
            System.out.println("Saldo original da conta: " + conta.getSaldo());
            System.out.println("Status da conta: " + conta.getEstadoConta());

            System.out.println("\n\nVamos sacar dessa conta...");
            conta.saque(600.0);
            System.out.println("Saldo apos saque: " + conta.getSaldo());
            System.out.println("Status da conta: " + conta.getEstadoConta());

            System.out.println("\n\nVamos sacar dessa conta, mais uma vez...");
            conta.saque(100.0);
            System.out.println("Saldo apos saque: " + conta.getSaldo());
            System.out.println("Status da conta: " + conta.getEstadoConta());

            System.out.println("\n\nVamos depositar nessa conta...");
            conta.deposito(100.0);
            System.out.println("Saldo apos o depósito: " + conta.getSaldo());
            System.out.println("Status da conta: " + conta.getEstadoConta());

            System.out.println("\n\nVamos continuar a depositar nessa conta...");
            conta.deposito(600.0);
            System.out.println("Saldo apos o depósito: " + conta.getSaldo());
            System.out.println("Status da conta: " + conta.getEstadoConta());

            System.out.println("\n\nVamos sacar dessa conta, mais uma vez...");
            conta.saque(1500.0);
            System.out.println("Saldo apos o depósito: " + conta.getSaldo());
            System.out.println("Status da conta: " + conta.getEstadoConta());
            System.out.println("\n\n");
            
        }
        catch(InputMismatchException ime){
            System.out.println("\n\nErro: " + ime.getMessage());
            System.out.println("\n\n");
        }
    }
}
