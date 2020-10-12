/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.enums.TipoOcorrencia;

/**
 *
 * @author enzoappi
 */
public class OcorrenciaPendente {
    
    private TipoOcorrencia tipoOcorrencia;
    
    private OcorrenciaIniciada ocorrenciaIniciada = new OcorrenciaIniciada();

    public OcorrenciaPendente(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public OcorrenciaPendente() {
        this.tipoOcorrencia = TipoOcorrencia.Nenhuma;
    }

    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public OcorrenciaIniciada getOcorrenciaIniciada() {
        if(!(this.tipoOcorrencia.equals(TipoOcorrencia.Nenhuma))) {
            return this.ocorrenciaIniciada;
        }
        return null;
    }

    public void setOcorrenciaIniciada(OcorrenciaIniciada ocorrenciaIniciada) {
        if(!(this.tipoOcorrencia.equals(TipoOcorrencia.Nenhuma))) {
            this.ocorrenciaIniciada = ocorrenciaIniciada;
        }
    }
    
    @Override
    public String toString() {
        return tipoOcorrencia + ".";
    }
}
