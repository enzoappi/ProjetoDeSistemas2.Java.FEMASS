/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import model.entities.Utilizacao;

/**
 *
 * @author enzoappi
 */
public abstract class EstadoUtilizacao {
    
    public abstract void iniciar(Utilizacao utilizacao);
    public abstract void finalizar(Utilizacao utilizacao);
    public abstract void aguardarProxima(Utilizacao utilizacao);
    
}
