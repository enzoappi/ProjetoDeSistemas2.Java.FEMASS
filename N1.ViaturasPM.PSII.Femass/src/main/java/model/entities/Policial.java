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
public class Policial {
    private String nome;
    private String matricula;
    private String rg;
    private String patente;
    
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList();
//    private List<Ocorrencia> ocorrencias = new ArrayList();
    private Viatura viatura;

    public Policial(String nome, String matricula, String rg, String patente, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.rg = rg;
        this.patente = patente;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    /*public void setMatricula(String matricula) {
        this.matricula = matricula;
    }*/

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

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
    
//    public void adicionarOcorrencia(Ocorrencia ocorrencia) {
//        this.ocorrencias.add(ocorrencia);
//    }
//    
//    public void removerOcorrencia(Ocorrencia ocorrencia) {
//        this.ocorrencias.remove(ocorrencia);
//    }
//    
//    public List<Ocorrencia> getOcorrencias() {
//        return this.ocorrencias;
//    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }
}
