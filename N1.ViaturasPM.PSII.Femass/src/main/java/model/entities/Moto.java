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
public class Moto extends Viatura{
    private String versaoModelo;
    private String potenciaCilindradas;

    public Moto(String codPatrimonio, String placa, String renavam, String marca, String modelo, String anoFabricacao, String cor, String versaoModelo, String potenciaCilindradas) {
        super(codPatrimonio, placa, renavam, marca, modelo, anoFabricacao, cor);
        this.versaoModelo = versaoModelo;
        this.potenciaCilindradas = potenciaCilindradas;
    }
    
    public String getVersaoModelo() {
        return versaoModelo;
    }

    public void setVersaoModelo(String versaoModelo) {
        this.versaoModelo = versaoModelo;
    }

    public String getPotenciaCilindradas() {
        return potenciaCilindradas;
    }

    public void setPotenciaCilindradas(String potenciaCilindradas) {
        this.potenciaCilindradas = potenciaCilindradas;
    }
}
