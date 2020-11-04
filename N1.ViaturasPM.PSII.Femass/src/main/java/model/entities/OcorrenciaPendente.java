/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalTime;
import model.enums.TipoOcorrencia;

/**
 *
 * @author enzoappi
 */
public class OcorrenciaPendente {
    
    private TipoOcorrencia tipoOcorrencia;
    
    private OcorrenciaIniciada ocorrenciaIniciada;

    public OcorrenciaPendente() {
        this.tipoOcorrencia = TipoOcorrencia.NENHUMA;
        this.ocorrenciaIniciada = null;
    }

    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    
    public OcorrenciaIniciada getOcorrenciaIniciada() {
        if(this.ocorrenciaIniciada == null) {
            throw new NullPointerException("\nAlgo inseperado aconteceu!\nNão constam ocorrências cadastradas no Sistema, para a viatura!\n");
        }
        return this.ocorrenciaIniciada;
    }

//    public void setOcorrenciaIniciada(OcorrenciaIniciada ocorrenciaIniciada) {
//        if(!(this.tipoOcorrencia.equals(TipoOcorrencia.Nenhuma))) {
//            this.ocorrenciaIniciada = ocorrenciaIniciada;
//        }
//    }
    
    public void setOcorrenciaIniciada(Integer codOcorrencia, LocalTime horaChamadaOcorrencia) {
        if(!(this.tipoOcorrencia.equals(TipoOcorrencia.NENHUMA))) {
            this.ocorrenciaIniciada = new OcorrenciaIniciada(codOcorrencia, horaChamadaOcorrencia);
        }
    }
    
    @Override
    public String toString() {
        return tipoOcorrencia + ".";
    }
}
