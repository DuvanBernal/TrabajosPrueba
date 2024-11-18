/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclaselistatareas;

import Controlador.Controlador;
import Modelo.ListaEnlazada;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class TrabajoenclaseListaTareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada miLista = new ListaEnlazada();
        Vista miVista= new Vista();
        Controlador controlador = new Controlador(miLista,miVista);
        controlador.iniciar();
    }
    
}
