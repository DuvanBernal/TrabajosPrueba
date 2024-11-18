/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaSimple;
import Vista.ListaVista;

/**
 *
 * @author duvan
 */
public class ListaControlador {

    private ListaSimple modelo;
    private ListaVista vista;

    public ListaControlador(ListaSimple modelo, ListaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarelemento(int valor) {
        modelo.agregar(valor);
    }

    public void eliminarelemento() {
        modelo.eliminar();
    }
    
    public int buscarelemento(int elemento){
        modelo.buscar(elemento);
        return -1;
    }

    public void mostrarLista() {
        vista.mostrarLista(modelo.getCabeza());
    }
}
