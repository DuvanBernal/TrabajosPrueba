/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Lista {

    //llamamos al nodo y definimos la cabeza
    private Nodo cabeza;

    //inicializamos la cabeza
    public Lista() {
        this.cabeza = null;
    }

    public void añadirCliente(String nombre, String documento, String servicio) {
        //se llena con los parametros que se colocaron en la anterior linea
        Nodo nuevoNodo = new Nodo(nombre, documento, servicio); 
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getsiguiente() != null) {

                actual = actual.getsiguiente();
            }
            actual.setsiguiente(nuevoNodo);
        }
    }

    public Nodo atenderCliente() {
        if (cabeza == null) {
            return null;
        }
        Nodo clienteAtendido = cabeza;
        cabeza = cabeza.getsiguiente();
        return clienteAtendido;
    }
    
    // retorna cual es la cabeza
    public Nodo getCabeza() {
        return cabeza;
    }

}
