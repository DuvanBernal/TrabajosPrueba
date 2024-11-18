/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaCircularDoble {

    private Nodo cabeza = null;
    private Nodo cola = null;//si se inicializan aca no se hace constructor

    public boolean esVacia() {
        return cabeza == null;
    }

    //metodo para agregar nodo al inicio de la lista
    public void agregarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (esVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.siguiente = nuevoNodo;
            cola.anterior = nuevoNodo;
        } else {
            cabeza.anterior = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
            nuevoNodo = cabeza;
            cola.siguiente = cabeza;
        }
    }

    //metodo para agregar al final
    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (esVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.siguiente = nuevoNodo;
            cola.anterior = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            nuevoNodo = cola;
            cola.siguiente = cabeza;

        }

    }

    public void mostrarListainicio() {
        if (!esVacia()) {
            Nodo actual = cabeza;
            do {
                System.out.println(actual.dato + " ");
                actual = actual.siguiente;
            } while (actual != null);
            System.out.println();
        }
    }

    public void mostrarListaDesdeCola() {
        if (!esVacia()) {
            Nodo actual = cola;
            do {
                System.out.print(actual.dato + " ");
                actual = actual.anterior;
            } while (actual != cola);
            System.out.println();
        }
    }
}
