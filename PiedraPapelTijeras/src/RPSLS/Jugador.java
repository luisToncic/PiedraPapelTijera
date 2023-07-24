/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPSLS;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Luis Toncic - luisalfredotoncic@gmail.com
 */
public abstract class Jugador {
    
    // <editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    
    protected int contador;
    protected int eleccion;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTORs">
    
    public Jugador (int contador, JLabel lbl_img, String ruta){
        
        this.contador=contador;
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        lbl_img.setIcon(icon);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GETTERs n SETTERs">
    
    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getEleccion() {
        return this.eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="METHODs">
    
    public abstract void incrementarContador();
    
    // </editor-fold>
    
    
        
}
