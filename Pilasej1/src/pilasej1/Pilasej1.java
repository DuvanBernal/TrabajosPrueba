 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasej1;

import Controlador.PilaControlador;
import Modelo.Pila;
import Vista.VistaPila;

/**
 *
 * @author duvan
 */
public class Pilasej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Pila modelo=new Pila();
            VistaPila vista= new VistaPila();
            PilaControlador controlador = new PilaControlador(vista,modelo);
            controlador.iniciar();
    }
    
}
