/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalDateTime;
import model.enums.TipoVeiculo;
import model.services.CalculoValor;

/**
 *
 * @author enzoappi
 */
public class ContaEstacionamento {
    
    protected String veiculo;
    protected String placa;
    protected LocalDateTime inicio;
    protected LocalDateTime fim;
    
    protected TipoVeiculo tipoVeiculo;
    
    private CalculoValor calculoValor;

    public ContaEstacionamento(String veiculo, String placa, LocalDateTime inicio) {
        this.veiculo = veiculo;
        this.placa = placa;
        this.inicio = inicio;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setCalculoValor(CalculoValor calculoValor) {
        this.calculoValor = calculoValor;
    }
    
    public String valorConta() {
        return this.calculoValor.calcular(this);
    }
    
}
