/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalTime;
//import model.enums.TipoOcorrencia;

/**
 *
 * @author enzoappi
 */
public class OcorrenciaIniciada /*extends OcorrenciaPendente*/{
    
    private Integer codOcorrencia;
    private LocalTime horaChamadaOcorrencia;

    public OcorrenciaIniciada(Integer codOcorrencia, LocalTime horaChamadaOcorrencia) {
        this.codOcorrencia = codOcorrencia;
        this.horaChamadaOcorrencia = horaChamadaOcorrencia;
    }

    public OcorrenciaIniciada() {
    }

    public String getCodOcorrencia() {
        return codOcorrencia.toString();
    }

    public void setCodOcorrencia(Integer codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    public LocalTime getHoraChamadaOcorrencia() {
        return horaChamadaOcorrencia;
    }

    public void setHoraChamadaOcorrencia(LocalTime horaChamadaOcorrencia) {
        this.horaChamadaOcorrencia = horaChamadaOcorrencia;
    }
}
