/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.program;

import model.entities.Carro;
import model.entities.Moto;
import model.entities.Utilizacao;
import model.enums.TipoOcorrencia;


/**
 *
 * @author enzoappi
 */
public class ClienteSistemaViaturasPM {
    public static void main(String[] args) {
        Carro viatura1 = new Carro("20201009", "LUT-5685", "325468751", "Wolksvagem", "Gol", "2010", "branco", 4, 2, "1.0", "4");
        Moto viatura2 = new Moto("20201010", "RIP-0666", "456879562", "Honda", "Cg", "2013", "branca", "500", "500c");
        Utilizacao utilizacao = new Utilizacao();
        utilizacao.adicionarViatura(viatura1);
        utilizacao.adicionarViatura(viatura2);
        
        System.out.println("\n\n\nDados da viatura:\nPatrimonio: " + viatura1.getCodPatrimonio() 
                + "\nPlaca: " + viatura1.getPlaca());
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Central, a viatura sofreu uma colisao, durante a perseguicao ao elemento, copiado?!");
        viatura1.acusarProblema();
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura1.acionarManutencao();
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura1.retornoManutencao();
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Situacao atual: " + utilizacao.getEstadoUtilizacao().toString().toUpperCase());
        System.out.println("Central diz: [Recebemos um chamado, unidade(s) " + utilizacao.toStringViaturas() + ", copiado? (câmbio)]");
        System.out.println("Viatura(s) " + utilizacao.toStringViaturas() + " diz(em): [Copiado, Central! Estamos nos deslocando para o local do atendimento! (câmbio)]");
        utilizacao.iniciar();
        utilizacao.finalizar();
        utilizacao.aguardarProxima();
        System.out.println("Situacao: " + utilizacao.getEstadoUtilizacao().toString());
           
           
    }
}
