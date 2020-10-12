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
public class EmUtilizacao extends EstadoUtilizacao{
    
    private FimEstimadoOcorrencia fimEstimadoOcorrencia;
    private InicioEfetivoOcorrencia inicioEfetivoOcorrencia = new InicioEfetivoOcorrencia();

    public EmUtilizacao() {
        this.inicioEfetivoOcorrencia.setHoraInicioEfetivoOcorrencia(LocalTime.now().plusMinutes(13));
        this.fimEstimadoOcorrencia.setHoraFimEstimado(LocalTime.parse("23:59:59", DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
    public EmUtilizacao(FimEstimadoOcorrencia fimEstimadoOcorrencia) {
        this.inicioEfetivoOcorrencia.setHoraInicioEfetivoOcorrencia(LocalTime.now().plusMinutes(13));
        this.fimEstimadoOcorrencia = fimEstimadoOcorrencia;
    }

    public void iniciar(Utilizacao utilizacao) {
        utilizacao.setEstadoUtilizacao(this);
    }
    
    public void finalizar(Utilizacao utilizacao) {
        System.out.println("O atendimento da ocorrencia num: " + utilizacao.getOcorrencia().getOcorrenciaIniciada().getCodOcorrencia() + " do tipo: " + utilizacao.getOcorrencia().getTipoOcorrencia()
                + ", foi iniciada em " + (utilizacao.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))) 
                + " as: " + this.inicioEfetivoOcorrencia.getHoraInicioEfetivoOcorrencia().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("A previsao de conclusao eh: " + utilizacao.getDataFim().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
                + " as: " + this.fimEstimadoOcorrencia.getHoraFimEstimadoO().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Situacao atual: " + utilizacao.getEstadoUtilizacao().toString().toUpperCase());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        utilizacao.setEstadoUtilizacao(new UtilizacaoConcluida(this.inicioEfetivoOcorrencia));
    }
    
    public void aguardarProxima(Utilizacao utilizacao) {
        utilizacao.setEstadoUtilizacao(this);
    }

    @Override
    public String toString() {
        return "Atendendo";
    }
}
