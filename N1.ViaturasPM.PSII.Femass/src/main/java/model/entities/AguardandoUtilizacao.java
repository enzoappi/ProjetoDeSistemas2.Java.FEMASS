/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.enums.TipoOcorrencia;
import model.services.EstadoUtilizacao;

/**
 *
 * @author enzoappi
 */
public class AguardandoUtilizacao extends EstadoUtilizacao{
    
    private LocalTime horaInicio;
    
    private FimEstimadoOcorrencia fimEstimadoOcorrencia = new FimEstimadoOcorrencia();

    public AguardandoUtilizacao(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public AguardandoUtilizacao() {
        this.horaInicio = LocalTime.now();
        this.fimEstimadoOcorrencia.setHoraFimEstimado(LocalTime.parse("23:59:59", DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void iniciar(Utilizacao utilizacao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQual a ocorrência do chamado? ");
        String tpOcorrTemp = sc.next();
        System.out.println("");
        TipoOcorrencia tpOcorr = TipoOcorrencia.valueOf(tpOcorrTemp.toUpperCase());
        utilizacao.getOcorrencia().setTipoOcorrencia((TipoOcorrencia) tpOcorr);
        try {
//            utilizacao.getOcorrencia().setOcorrenciaIniciada(new OcorrenciaIniciada(((int) (Math.random()*998999999)+100000000), this.horaInicio));
            utilizacao.getOcorrencia().setOcorrenciaIniciada(((int) (Math.random()*998999999)+100000000), this.horaInicio);
            System.out.println("Tipo da ocorrencia: " + utilizacao.getOcorrencia().toString() 
                + "\nData da chamada: " + (utilizacao.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))) 
                + " as: " + utilizacao.getOcorrencia().getOcorrenciaIniciada().getHoraChamadaOcorrencia().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            System.out.println("----------------------------------------------------------------------------------------------------------");
            utilizacao.setEstadoUtilizacao(new EmUtilizacao(this.fimEstimadoOcorrencia));
        } catch(NullPointerException npe) {
            System.out.println(npe.getMessage());
            System.out.println("Situação de momento: " + toString().toUpperCase());
            return;
        }
    }
    public void finalizar(Utilizacao utilizacao) {
        utilizacao.setEstadoUtilizacao(new UtilizacaoConcluida(this.fimEstimadoOcorrencia.getHoraFimEstimadoO()));
//        System.out.println("Fim da utilizacao da viatura, sem atendimento de ocorrencia.");
    }
    
    public void aguardarProxima(Utilizacao utilizacao) {
        utilizacao.setEstadoUtilizacao(this);
    }

    @Override
    public String toString() {
        return "Aguardando";
    }
}
