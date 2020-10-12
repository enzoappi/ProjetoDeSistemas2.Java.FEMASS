/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import model.services.EstadoUtilizacao;

/**
 *
 * @author enzoappi
 */
public class UtilizacaoConcluida extends EstadoUtilizacao{
    
    private LocalTime horaFimEfetivo;
    
    private InicioEfetivoOcorrencia inicioEfetivoOcorrencia;

    public UtilizacaoConcluida(InicioEfetivoOcorrencia inicioEfetivoOcorrencia) {
        this.horaFimEfetivo = LocalTime.now().plusHours(3);
        this.inicioEfetivoOcorrencia = inicioEfetivoOcorrencia;
    }
    
    public void iniciar(Utilizacao utilizacao) {
        utilizacao.setEstadoUtilizacao(this);
    }
    public void finalizar(Utilizacao utilizacao) {
        utilizacao.setEstadoUtilizacao(this);
    }
    public void aguardarProxima(Utilizacao utilizacao) {
        System.out.println("A ocorrencia iniciada em " + (utilizacao.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))) 
                + " as " + (this.inicioEfetivoOcorrencia.getHoraInicioEfetivoOcorrencia().format(DateTimeFormatter.ofPattern("HH:mm:ss"))) 
                +" foi finalizada em " + (utilizacao.getDataFim().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))) 
                + " as: " + this.horaFimEfetivo.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Situacao atual: " + utilizacao.getEstadoUtilizacao().toString().toUpperCase());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        utilizacao.setEstadoUtilizacao(new AguardandoUtilizacao());
    }
    
    @Override
    public String toString() {
        return "Concluido";
    }
}
