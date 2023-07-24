/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPSLS;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Toncic - luisalfredotoncic@gmail.com
 */
public class Arbitro {
        
    // <editor-fold defaultstate="collapsed" desc="METHODs">
    
    public static void arbitrar(Humano h, Maquina m, JLabel resultadoJugada){
        
        if (!(m.isEasterEgg())){
            
            if(h.getEleccion()==m.getEleccion()){
                
                resultadoJugada.setText("Has Empatado");    
            
            }else if((h.getEleccion()==1 && m.getEleccion()==2) || //papel>piedra
                    (h.getEleccion()==2 && m.getEleccion()==3) || //piedra>tijera
                    (h.getEleccion()==3 && m.getEleccion()==1)){ //tijera>papel
                
                //incremento el contador y muestro el msj correspondiente
                h.incrementarContador();
                resultadoJugada.setText("¡Has Ganado!");        
            }else{
                //incremento el contador y muestro el msj correspondiente
                m.incrementarContador();
                resultadoJugada.setText("¡Has Perdido!");        
            } 
        }else{
            if(h.getEleccion()==m.getEleccion()){

                resultadoJugada.setText("Has Empatado");        
            
            }else if((h.getEleccion()==1 && m.getEleccion()==2) || //papel>piedra
                    (h.getEleccion()==3 && m.getEleccion()==1) || //tijeras>papel
                    (h.getEleccion()==2 && m.getEleccion()==4) || //piedra>lagarto
                    (h.getEleccion()==4 && m.getEleccion()==5) || //lagarto>spock
                    (h.getEleccion()==5 && m.getEleccion()==3) || //spock>tijeras
                    (h.getEleccion()==3 && m.getEleccion()==4) || //tijeras>lagarto
                    (h.getEleccion()==4 && m.getEleccion()==1) || //lagarto>papel
                    (h.getEleccion()==1 && m.getEleccion()==5) || //papel>spock
                    (h.getEleccion()==5 && m.getEleccion()==2) || //spock>piedra
                    (h.getEleccion()==2 && m.getEleccion()==3) ){ //piedra>tijeras 
                    
                //incremento el contador y muestro el msj correspondiente
                h.incrementarContador();
                resultadoJugada.setText("¡Has Ganado!");     
            }else{
                //incremento el contador y muestro el msj correspondiente
                m.incrementarContador();
                resultadoJugada.setText("¡Has Perdido!");        
            }
        }        
    }
    // </editor-fold>
}
