/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;



/**
 *
 * @author enzoappi
 */
public class Mensalidade {
    private LocalDate dataMensalidade;
    private Double valorMensalidade;
    private LocalDate dataPgtoMensalidade;
    private Double jurosMensalidade;
    private Double valorMensCorrigida;
    private Double valorPgto;
    private boolean quitacaoMensalidade = false;
    
    //explicitacao dos relacionamentos entre as classes
    public Socio socio;

    public LocalDate getDataMensalidade() {
        return dataMensalidade;
    }

    public void setDataMensalidade(LocalDate dataMensalidade) {
        this.dataMensalidade = dataMensalidade;
    }

    public Double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public LocalDate getDataPgtoMensalidade() {
        return dataPgtoMensalidade;
    }

    public void setDataPgtoMensalidade(LocalDate dataPgtoMensalidade) {
        this.dataPgtoMensalidade = dataPgtoMensalidade;
    }

    public Double getJurosMensalidade() {
        return jurosMensalidade;
    }

    public Double getValorMensCorrigida() {
        return valorMensCorrigida;
    }
    
    public Double getValorPgto() {
        return valorPgto;
    }

    public void setValorPgto(Double valorPgto) {
        this.valorPgto = valorPgto;
    }

    public boolean isQuitacaoMensalidade() {
        return quitacaoMensalidade;
    }

    public void setQuitacaoMensalidade(boolean quitacaoMensalidade) {
        this.quitacaoMensalidade = quitacaoMensalidade;
    }
    
    public String consMens() {
        return "Mensalidade de " + this.dataMensalidade + "\nValor: " + this.valorMensalidade 
                + "\nData do Pagamento: " + this.dataPgtoMensalidade + "\nJuros da mensalidade: " 
                + this.jurosMensalidade + ", valorPgto=" + valorPgto + "\nQuitacao da mensalidade: " 
                + this.quitacaoMensalidade;
    }
    
    public void calcJuros() {
        if(this.dataPgtoMensalidade.isAfter(this.dataMensalidade)) {
            int periodoTEMP = (int)Math.pow(Period.between(this.dataPgtoMensalidade, this.dataMensalidade).getDays(), 2);
            int periodo = (int)Math.sqrt(periodoTEMP);
            System.out.println("PERIODO: " + periodo);
            this.jurosMensalidade = 0.33 * periodo;
            this.valorMensCorrigida = this.valorMensalidade * (1 + (this.jurosMensalidade / 100));
        } else {
            this.valorMensCorrigida = this.valorMensalidade;
            this.jurosMensalidade = 0.0;
        }
    }
}
