/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author enzoappi
 */
public class MensalidadeView {
    
    public void imprimeDetalhesMensalidade(LocalDate dataMensalidade, Double valorMensalidade, LocalDate dataPgtoMensalidade, Double jurosMensalidade, Double valorMensalidadeCorrigida, Double valorPgto, boolean quitacaoMensalidade) {
        JOptionPane.showMessageDialog(null, "Dados da Mensalidade:" 
                + "\n\nVencimento da mensalidade: " + dataMensalidade 
                + "\nValor da Mensalidade ate o vencimento: R$" + valorMensalidade 
                + "\nMensalidade paga: " + quitacaoMensalidade  
                + "\nData do Pagamento da Mensalidade: " + dataPgtoMensalidade 
                + "\nJuros: " + jurosMensalidade + "%" 
                + "\n\nValor final da mensalidade: R$"+ valorMensalidadeCorrigida 
                + "\n\nValor pago: R$" + valorPgto);
    }
}
