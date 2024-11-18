/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaCircular;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class Controlador {

    private ListaCircular lista;
    private Vista miVista;

    public Controlador(ListaCircular lista, Vista miVista) {
        this.lista = lista;
        this.miVista = miVista;
    }

    public void agregarElemento(int valor) {
        lista.agregar(valor);
    }
    
    public void eliminarElemento(int valor){
        lista.eliminar(valor);
    }
    
    public void imprimirLista(){
        miVista.mostrarLista(lista);
    }
    
    public void esVacia(){
        if(lista.esVacia()){
            miVista.mostrarMensaje("La lista esta vacia");
        }
    }
}
