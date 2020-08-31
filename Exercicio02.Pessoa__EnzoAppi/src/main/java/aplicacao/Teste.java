/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.PessoaFisica;
import entidades.PessoaJuridica;

/**
 *
 * @author enzoappi
 */
public class Teste {
    public static void main(String[] args) {
        
        PessoaFisica pessoa1 = new PessoaFisica("123456789", "Jose Silva");
        PessoaJuridica pessoa2 = new PessoaJuridica("987654320001", "FulanoSA");

        System.out.println("IRPF: ");
        System.out.println("Pessoa: " + pessoa1.getNome()
                + "\nRG: " + pessoa1.getRG() + "\nImposto a pagar: R$" + pessoa1.calcularIR(12350.00));
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("IRPJ: ");
        System.out.println("Empresa: " + pessoa2.getNome()
                + "\nCNPJ: " + pessoa2.getCnpj() + "\nImposto a pagar: R$" + pessoa2.calcularIR(120350.00));
    }
}
