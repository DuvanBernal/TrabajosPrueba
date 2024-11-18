/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclase120824;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class TrabajoClase120824 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo model=new Modelo(0,0);
        Vista vista=new Vista();
        Controlador controlador=new Controlador(model,vista);
        controlador.iniciar();
    }
    
}
