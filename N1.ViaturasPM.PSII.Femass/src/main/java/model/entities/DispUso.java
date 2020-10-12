/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.services.EstadoViatura;

/**
 *
 * @author enzoappi
 */
public class DispUso implements EstadoViatura{
    
    @Override
    public void acusarProblema(Viatura viatura) {
        viatura.setEstadoViatura(new Defeituoso());
        System.out.println("Defeito na viatura, acusado!");
    }
    
    @Override
    public void acionarManutencao(Viatura viatura) {
        System.out.println("Nao ha defeitos acusados para iniciar manutencao.");
    }
    
    @Override
    public void retornoManutencao(Viatura viarura) {
        System.out.println("O veiculo ainda nao sofreu os reparos necessarios.");
    }
    
    @Override
    public String toString() {
        return "Disponível para uso";
    }
}
