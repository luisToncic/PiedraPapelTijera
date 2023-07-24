/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPSLS;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Luis Toncic - luisalfredotoncic@gmail.com
 */
public class Maquina extends Jugador{
    
    // <editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    
    private boolean easterEgg =false;
    private boolean easterEggChallenge = false;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTORs">
    
    public Maquina (int contador, JLabel lbl_img, String ruta){
    
        super(contador,lbl_img,ruta);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GETTERs n SETTERs">
    
    public boolean isEasterEgg() {
        return this.easterEgg;
    }

    public void setEasterEgg(boolean easterEgg) {
        this.easterEgg = easterEgg;
    }
    
    public boolean isEasterEggChallenge() {
        return this.easterEggChallenge;
    }

    public void setEasterEggChallenge(boolean easterEggChallenge) {
        this.easterEggChallenge = easterEggChallenge;
    }
    
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="METHODs">
    
    @Override 
    public void incrementarContador(){
        this.contador= this.contador+1;
    }
    
    public void jugar() {
        
        if(!(this.easterEgg)){
            Random rand = new Random();
            this.eleccion = rand.nextInt(3) + 1; // aleatorio entre 1 y 3
        }else{
            Random rand = new Random();
            this.eleccion = rand.nextInt(5) + 1; // aleatorio entre 1 y 5
        }
    }
    // </editor-fold>
}
