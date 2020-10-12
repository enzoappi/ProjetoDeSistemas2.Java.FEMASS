/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.List;
import model.services.EstadoViatura;


/**
 *
 * @author enzoappi
 */
public class Viatura {
    private String codPatrimonio;
    private String placa;
    private String renavam;
    private String marca;
    private String modelo;
    private String anoFabricacao;
    private String cor;
    
    private EstadoViatura estadoViatura;
    private List<Utilizacao> utilizacoes = new ArrayList();
    private List<Policial> policiais = new ArrayList();

    public Viatura(String codPatrimonio, String placa, String renavam, String marca, String modelo, String anoFabricacao, String cor) {
        this.codPatrimonio = codPatrimonio;
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.estadoViatura = new DispUso();
    }

    public String getCodPatrimonio() {
        return codPatrimonio;
    }

    public void setCodPatrimonio(String codPatrimonio) {
        this.codPatrimonio = codPatrimonio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEstadoViatura(EstadoViatura estadoViatura) {
        this.estadoViatura = estadoViatura;
    }
    
    public EstadoViatura getEstadoViatura() {
        return estadoViatura;
    }
    
    public void acusarProblema() {
        this.estadoViatura.acusarProblema(this);
    }
    
    public void acionarManutencao(){
        this.estadoViatura.acionarManutencao(this);
    }
    
    public void retornoManutencao(){
        this.estadoViatura.retornoManutencao(this);
    }
    
    public void adicionarUtilizacao(Utilizacao utilizacao) {
        this.utilizacoes.add(utilizacao);
    }
    
    public void removerUtilizacao(Utilizacao utilizacao) {
        this.utilizacoes.remove(utilizacao);
    }
    
    public List<Utilizacao> getUtilizacoes() {
        return this.utilizacoes;
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
        return "" + estadoViatura + ".";
    }
    
    
}
