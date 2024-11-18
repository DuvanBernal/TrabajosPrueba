/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasej2;

import Controlador.ControladorPila;
import Modelo.Validar;
import Vista.VistaPila;

/**
 *
 * @author duvan
 */
public class Pilasej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPila miVista= new VistaPila();
        Validar validar = new Validar();
        ControladorPila controlador = new ControladorPila(miVista, validar);
        controlador.iniciar();
    }
    
}
