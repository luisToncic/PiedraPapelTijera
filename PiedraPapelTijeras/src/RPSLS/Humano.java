/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPSLS;

import javax.swing.JLabel;

/**
 *
 * @author Luis Toncic - luisalfredotoncic@gmail.com
 */
public class Humano extends Jugador{
    
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTORs">
    
    public Humano (int contador, JLabel lbl_img, String ruta){
    
        super(contador,lbl_img,ruta);
    }    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="METHODs">
    
    @Override 
    public void incrementarContador(){
        this.contador=this.contador+1;
    }
    // </editor-fold>
}
