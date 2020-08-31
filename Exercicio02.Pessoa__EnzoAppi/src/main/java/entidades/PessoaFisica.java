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
public class PessoaFisica extends Pessoa{
    
    private String RG;

    public PessoaFisica(String RG, String nome) {
        super(nome);
        this.RG = RG;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double calcularIR() {
        return 2750.00;
    }
    
}
