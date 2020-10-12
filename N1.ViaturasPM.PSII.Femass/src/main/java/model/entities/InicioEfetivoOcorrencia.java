/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalTime;

/**
 *
 * @author enzoappi
 */
public class InicioEfetivoOcorrencia {
    private LocalTime horaInicioEfetivoOcorrencia;

    public InicioEfetivoOcorrencia(LocalTime horaInicioEfetivoOcorrencia) {
        this.horaInicioEfetivoOcorrencia = horaInicioEfetivoOcorrencia;
    }
    
    public InicioEfetivoOcorrencia() {
    }

    public LocalTime getHoraInicioEfetivoOcorrencia() {
        return horaInicioEfetivoOcorrencia;
    }

    public void setHoraInicioEfetivoOcorrencia(LocalTime horaInicioEfetivoOcorrencia) {
        this.horaInicioEfetivoOcorrencia = horaInicioEfetivoOcorrencia;
    }
}
