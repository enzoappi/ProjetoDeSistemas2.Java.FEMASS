/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;
import hotel.model.entities.Hotel;
import florista.model.entities.Florista;
import alimentacao.model.entities.Alimentacao;
import javax.swing.JOptionPane;
import musica.model.entities.Musica;

/**
 *
 * @author enzoappi
 */
public class Facade {
    
    public Hotel hotel;
    public Florista florista;
    public Alimentacao alimentacao;
    public Musica musica;
    
    
    public Facade() {
        this.hotel = new Hotel();
        this.florista = new Florista();
        this.alimentacao = new Alimentacao();
        this.musica = new Musica();
    }
    
    public void organizar() {
        JOptionPane.showMessageDialog(null, "Evento de fim de ano Femass" 
                + "\n\nDados: " 
                + "\n\nLocal: " + hotel.agendamentoHotel() 
                + " em " + hotel.agendamentoHotel() 
                + "\nDecoracao prevista: " + florista.reservaDeFlores() 
                + " que serao entregues no dia " + florista.diaHorarioEntrega() 
                + "\nBuffet: " + alimentacao.reservaBuffet() 
                + " --> cardapio: " + alimentacao.cardapio() 
                + " que serao entregues em " + alimentacao.agendamentoDiaHorario() 
                + "\nMusica: " + musica.musicos() 
                + " --> agendado para " + musica.diaHorarioEntrega());
    }
}
