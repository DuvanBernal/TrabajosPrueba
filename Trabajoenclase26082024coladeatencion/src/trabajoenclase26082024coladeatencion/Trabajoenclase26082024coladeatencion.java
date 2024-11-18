/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase26082024coladeatencion;

import Controlador.Controlador;
import Modelo.Lista;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class Trabajoenclase26082024coladeatencion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listaespera= new Lista();
        Vista vista = new Vista();
        Controlador controlador= new Controlador(listaespera,vista);
        controlador.iniciar();
    }
    
}
