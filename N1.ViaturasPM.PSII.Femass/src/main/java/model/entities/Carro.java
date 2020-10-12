/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author enzoappi
 */
public class Carro extends Viatura{
    private Integer numPortas;
    private Integer numEixos;
    private String versaoModelo;
    private String valvulas;

    public Carro(String codPatrimonio, String placa, String renavam, String marca, String modelo, String anoFabricacao, String cor, Integer numPortas, Integer numEixos, String versaoModelo, String valvulas) {
        super(codPatrimonio, placa, renavam, marca, modelo, anoFabricacao, cor);
        this.numPortas = numPortas;
        this.numEixos = numEixos;
        this.versaoModelo = versaoModelo;
        this.valvulas = valvulas;
    }

    public Integer getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    public Integer getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(Integer numEixos) {
        this.numEixos = numEixos;
    }

    public String getVersaoModelo() {
        return versaoModelo;
    }

    public void setVersaoModelo(String versaoModelo) {
        this.versaoModelo = versaoModelo;
    }

    public String getValvulas() {
        return valvulas;
    }

    public void setValvulas(String valvulas) {
        this.valvulas = valvulas;
    }
}
