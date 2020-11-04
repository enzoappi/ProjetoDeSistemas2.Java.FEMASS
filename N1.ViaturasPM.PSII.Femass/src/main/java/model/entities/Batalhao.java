/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author enzoappi
 */
public class Batalhao {
    private String nome;
    private String regimento;
    private String subdivisao;
    
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList();
    private List<Viatura> viaturas = new ArrayList();
    private List<Policial> policiais = new ArrayList();

    public Batalhao(String nome, String regimento, String subdivisao, Endereco endereco) {
        this.nome = nome;
        this.regimento = regimento;
        this.subdivisao = subdivisao;
        this.endereco = endereco;
    }

    public Batalhao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegimento() {
        return regimento;
    }

    /*public void setRegimento(String regimento) {
        this.regimento = regimento;
    }*/

    public String getSubdivisao() {
        return subdivisao;
    }

    /*public void setSubdivisao(String subdivisao) {
        this.subdivisao = subdivisao;
    }*/

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    
    public void removerTelefone(Telefone telefone) {
        this.telefones.remove(telefone);
    }
    
    public List<Telefone> getTelefones() {
        return this.telefones;
    }
    
    public void adicionarViatura(Viatura viatura) {
        this.viaturas.add(viatura);
    }
    
    public void removerViatura(Viatura viatura) {
        this.viaturas.remove(viatura);
    }
    
    public List<Viatura> getViaturas() {
        return this.viaturas;
    }
    
    public void adicionarPolicial(Policial policial) {
        this.policiais.add(policial);
    }
    
    public void removerPolicial(Policial policial) {
        this.policiais.remove(policial);
    }
    
    public List<Policial> getPoliciais() {
        return this.policiais;
    }

    @Override
    public String toString() {
        return "" + nome;
    }
    
    public void mostraPoliciais() {
        for(Policial p : this.policiais) {
            System.out.println(p + "" );
        }
    }
    
    public void mostraViaturas() {
        for(Viatura v : this.viaturas) {
            System.out.println(v.mostraViatura() + "" );
        }
    }
    
    public void mostraTelefoneBatalhao() {
        for(Telefone t : this.telefones) {
            System.out.println("telefone(s): (" + t.getDdd() + ")" + t.getNumero());
        }
    }
}
