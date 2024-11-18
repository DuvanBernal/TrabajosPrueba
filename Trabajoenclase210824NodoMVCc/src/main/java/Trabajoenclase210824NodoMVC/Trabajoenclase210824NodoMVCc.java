/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Trabajoenclase210824NodoMVC;

import Controlador.ListaControlador;
import Modelo.ListaSimple;
import Vista.ListaVista;

/**
 *
 * @author duvan
 */
public class Trabajoenclase210824NodoMVCc {

    public static void main(String[] args) {
        ListaSimple modelo = new ListaSimple();
        ListaVista vista = new ListaVista();
        ListaControlador controlador = new ListaControlador(modelo, vista);
        
        /*insertar datos*/
        controlador.agregarelemento(1);
        controlador.agregarelemento(7);
        controlador.agregarelemento(5);
        controlador.agregarelemento(9);
        
        /*mostrar la lista*/
        vista.mostrarMensaje("Lista despues de agregar elementos");
        controlador.mostrarLista();
        
        /*eliminar elemento*/
        controlador.eliminarelemento();
        vista.mostrarMensaje("Lista despues de eliminar un elemento");
        controlador.mostrarLista();
       
    }
}
