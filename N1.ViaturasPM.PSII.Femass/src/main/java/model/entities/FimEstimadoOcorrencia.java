/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author enzoappi
 */
public class FimEstimadoOcorrencia {
    private LocalTime horaFimEstimado;

    public FimEstimadoOcorrencia(LocalTime horaFimEstimado) {
        this.horaFimEstimado = horaFimEstimado;
    }

    public FimEstimadoOcorrencia() {
    }

    public LocalTime getHoraFimEstimadoO() {
        return horaFimEstimado;
    }

    public void setHoraFimEstimado(LocalTime horaFimEstimado) {
        this.horaFimEstimado = horaFimEstimado;
    }
}
