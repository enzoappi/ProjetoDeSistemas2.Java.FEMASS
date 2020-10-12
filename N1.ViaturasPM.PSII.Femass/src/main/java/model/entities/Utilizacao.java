/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.services.EstadoUtilizacao;

/**
 *
 * @author enzoappi
 */
public class Utilizacao {
    
    private LocalDate dataInicio;
    private LocalDate dataFim;
    
    private EstadoUtilizacao estadoUtilizacao;
    
    private List<Endereco> enderecos = new ArrayList();
    private List<Viatura> viaturas = new ArrayList();
    
    private OcorrenciaPendente ocorrencia = new OcorrenciaPendente();

    public Utilizacao(LocalDate dataInicio, LocalDate dataFim, EstadoUtilizacao estadoUtilizacao) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.estadoUtilizacao = estadoUtilizacao;
    }

    public Utilizacao() {
        this.dataInicio = LocalDate.now();
        this.dataFim = this.dataInicio;
        this.estadoUtilizacao = new AguardandoUtilizacao();
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public EstadoUtilizacao getEstadoUtilizacao() {
        return estadoUtilizacao;
    }

    public void setEstadoUtilizacao(EstadoUtilizacao estadoUtilizacao) {
        this.estadoUtilizacao = estadoUtilizacao;
    }
    
    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }
    
    public void removerEndereco(Endereco endereco) {
        this.enderecos.remove(endereco);
    }
    
    public List<Endereco> getEnderecos() {
        return this.enderecos;
    }
    
    public void adicionarViatura(Viatura viatura) {
        this.viaturas.add(viatura);
    }
    
    public void removerViatura(Viatura viatura) {
        this.viaturas.remove(viatura);
    }
    
    public List<Viatura> getViaturas() {
        return this.viaturas;
    }

    public OcorrenciaPendente getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(OcorrenciaPendente ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String toStringViaturas() {
        String viaturasArmazenadasTemp = "";
        for(Viatura v : this.viaturas) {
            viaturasArmazenadasTemp += v.getCodPatrimonio() + ", ";
        }
        String viaturasArmazenadas = "";
        for(int i = 0; i < viaturasArmazenadasTemp.length() - 2; i++) {
            viaturasArmazenadas = viaturasArmazenadas + viaturasArmazenadasTemp.charAt(i);
        }
        return viaturasArmazenadas;
    }
    
    public void iniciar() {
        this.estadoUtilizacao.iniciar(this);
    }
    
    public void finalizar() {
        this.estadoUtilizacao.finalizar(this);
    }
    
    public void aguardarProxima() {
        this.estadoUtilizacao.aguardarProxima(this);
    }
}
