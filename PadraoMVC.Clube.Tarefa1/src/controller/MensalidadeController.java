/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import model.Mensalidade;
import view.MensalidadeView;

/**
 *
 * @author enzoappi
 */
public class MensalidadeController {
    
    private Mensalidade modelMensalidade;
    private MensalidadeView viewMensalidade;

    public MensalidadeController(Mensalidade modelMensalidade, MensalidadeView viewMensalidade) {
        this.modelMensalidade = modelMensalidade;
        this.viewMensalidade = viewMensalidade;
    }

    public LocalDate getDataMensalidadeCtrl() {
        return this.modelMensalidade.getDataMensalidade();
    }

    public void setDataMensalidadeCtrl(LocalDate dataMensalidade) {
        this.modelMensalidade.setDataMensalidade(dataMensalidade);
    }

    public Double getValorMensalidadeCtrl() {
        return this.modelMensalidade.getValorMensalidade();
    }

    public void setValorMensalidadeCtrl(Double valorMensalidade) {
        this.modelMensalidade.setValorMensalidade(valorMensalidade);
    }

    public LocalDate getDataPgtoMensalidadeCtrl() {
        return this.modelMensalidade.getDataPgtoMensalidade();
    }

    public void setDataPgtoMensalidadeCtrl(LocalDate dataPgtoMensalidade) {
        this.modelMensalidade.setDataPgtoMensalidade(dataPgtoMensalidade);
    }

    public Double getJurosMensalidadeCtrl() {
        return this.modelMensalidade.getJurosMensalidade();
    }

    public Double getValorPgtoCtrl() {
        return this.modelMensalidade.getValorPgto();
    }

    public void setValorPgtoCtrl(Double valorPgto) {
        this.modelMensalidade.setValorPgto(valorPgto);
    }

    public void setQuitacaoMensalidadeCTRL(boolean quitacaoMensalidade) {
        this.modelMensalidade.setQuitacaoMensalidade(quitacaoMensalidade);
    }
    
    public boolean isQuitacaoMensalidadeCtrl() {
        return this.modelMensalidade.isQuitacaoMensalidade();
    }
    
    public void calcJurosCtrl() {
        this.modelMensalidade.calcJuros();
    }
    
    public void atualizarViewMensalidade() {
        this.viewMensalidade.imprimeDetalhesMensalidade(this.modelMensalidade.getDataMensalidade(), this.modelMensalidade.getValorMensalidade(), this.modelMensalidade.getDataPgtoMensalidade(), this.modelMensalidade.getJurosMensalidade(), this.modelMensalidade.getValorMensCorrigida(),this.modelMensalidade.getValorPgto(), this.modelMensalidade.isQuitacaoMensalidade());
    }
}
