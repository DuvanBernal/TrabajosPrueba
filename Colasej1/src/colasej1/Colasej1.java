/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasej1;

import Controlador.Controlador;
import Modelo.Cola;
import Vista.Vista;


/**
 *
 * @author duvan
 */
public class Colasej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola(); // Primero crea la cola
        Controlador miControlador = new Controlador(cola); // Luego crea el controlador
        Vista vista = new Vista(miControlador); // Finalmente crea la vista con el controlador
        vista.miMenu();
        
       
    }
    
}
