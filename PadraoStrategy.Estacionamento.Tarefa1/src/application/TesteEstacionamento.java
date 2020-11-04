/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import model.entities.Calculo15Minutos;
import model.entities.CalculoCarga;
import model.entities.CalculoDiaria;
import model.entities.CalculoHora;
import model.entities.CalculoMensalidade;
import model.entities.ContaEstacionamento;
import model.enums.TipoVeiculo;

/**
 *
 * @author enzoappi
 */
public class TesteEstacionamento {
    public static void main(String[] args) {
        String tipoVeiculo = JOptionPane.showInputDialog(null, "Tipo do Veiculo: ");
        String veiculo = JOptionPane.showInputDialog(null, "Modelo Veiculo: ");
        String placa = JOptionPane.showInputDialog(null, "Placa: ");
        String mensalista = JOptionPane.showInputDialog(null, "Mensalista? ");
        
        ContaEstacionamento contaEstacionamento1 = new ContaEstacionamento(veiculo, placa, LocalDateTime.now());
        contaEstacionamento1.setTipoVeiculo(TipoVeiculo.valueOf(tipoVeiculo));
        contaEstacionamento1.setFim(LocalDateTime.now().plusDays(2).plusHours(3).plusMinutes(37));
        
        String mensalistaEDT = mensalista.toUpperCase();
        
        String dadosEstacionamento = "Extrato do Servico:";
        Double valorTotalFinal = 0.0;
        if(mensalistaEDT.equals("SIM")) {
            contaEstacionamento1.setCalculoValor(new CalculoMensalidade());
            dadosEstacionamento += "\n\nValor da mensalidade: R$" + contaEstacionamento1.valorConta();
            valorTotalFinal += Double.parseDouble(contaEstacionamento1.valorConta());
            if(contaEstacionamento1.getTipoVeiculo().equals(TipoVeiculo.Caminhao)) {
                contaEstacionamento1.setCalculoValor(new CalculoCarga());
                dadosEstacionamento += "\nValor da carga: R$" + contaEstacionamento1.valorConta();
                valorTotalFinal += Double.parseDouble(contaEstacionamento1.valorConta());
            }
        } else {
            contaEstacionamento1.setCalculoValor(new CalculoDiaria());
            dadosEstacionamento += "\n\nValor total das diarias: R$" + contaEstacionamento1.valorConta();
            valorTotalFinal += Double.parseDouble(contaEstacionamento1.valorConta());
            
            contaEstacionamento1.setInicio(LocalDateTime.now().plusDays(2));
            contaEstacionamento1.setCalculoValor(new CalculoHora());
            dadosEstacionamento += "\nValor total das horas excedentes: R$" + contaEstacionamento1.valorConta();
            valorTotalFinal += Double.parseDouble(contaEstacionamento1.valorConta());
            
            contaEstacionamento1.setInicio(LocalDateTime.now().plusDays(2).plusHours(3));
            contaEstacionamento1.setCalculoValor(new Calculo15Minutos());
            dadosEstacionamento += "\nValor total dos minutos excedentes: R$" + contaEstacionamento1.valorConta();
            valorTotalFinal += Double.parseDouble(contaEstacionamento1.valorConta());
            
            if(contaEstacionamento1.getTipoVeiculo().equals(TipoVeiculo.Caminhao)) {
                contaEstacionamento1.setCalculoValor(new CalculoCarga());
                dadosEstacionamento += "\nValor da carga: R$" + contaEstacionamento1.valorConta();
                valorTotalFinal += Double.parseDouble(contaEstacionamento1.valorConta());
            }
        }
        
        BigDecimal bdValTotFin = new BigDecimal(valorTotalFinal).setScale(2, RoundingMode.HALF_EVEN);
        JOptionPane.showMessageDialog(null, dadosEstacionamento + "\n\nValor final: R$" + bdValTotFin);
        
    }
}
