/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tc16092024;

import Controlador.Controlador;
import Modelo.ListaCircular;
import Vista.VistaJuego;

/**
 *
 * @author duvan
 */
public class TC16092024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaCircular Lista = new ListaCircular();
        VistaJuego Vista = new VistaJuego();
        Controlador controlador= new Controlador(Lista, Vista);
        controlador.iniciar()
    }
    
}
