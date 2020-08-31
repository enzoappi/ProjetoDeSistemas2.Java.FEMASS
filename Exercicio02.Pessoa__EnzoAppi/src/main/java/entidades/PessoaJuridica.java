/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author enzoappi
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   public Double calcularIR(double lucro) {
        double faixa0 = 0, faixa10 = 0, faixa20 = 0, faixa27 = 0;
        if(lucro > 30000) {
            faixa10 = (50000 - 30000) * 0.10;
        }
        if(lucro > 50000) {
            faixa20 = (90000 - 50000) * 0.20;
        }
        if(lucro > 90000) {
            faixa27 = (lucro - 90000) * 0.27;
        }
        return faixa0 + faixa10 + faixa20 + faixa27;
    }
    
}
