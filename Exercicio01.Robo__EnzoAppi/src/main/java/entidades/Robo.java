/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author enzoappi
 */
public class Robo implements Controle{
    
    public void andar() {
        System.out.println("\nROBO ANDANDO!");
    }
    
    public void virar() {
        System.out.println("\nROBO VIRANDO!");
    }
    
    public void falar() {
        System.out.println("\nROBO FALANDO!");
    }
}
