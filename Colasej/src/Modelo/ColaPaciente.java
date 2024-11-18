/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ColaPaciente {

    private Nodo primero, ultimo;

    public ColaPaciente() {
        this.primero = null;
        this.ultimo = null;
    }

    public void encolar(String nombre, int nivel) {
        Nodo nuevoNodo = new Nodo(nombre, nivel);
        if (ultimo == null) {
            primero = ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }

    }

    public Nodo desencolar() {
        if (ultimo == null) {
            return null;
        }
        Nodo auxiliar = primero;
        if (primero == null) {
            ultimo = null;
        }
        return auxiliar;
    }

    //Principio de las colas FIFO
    public Nodo verPrimero() {
        return primero;
    }

    public boolean esVacia() {
        return primero == null;
    }

    public int contar() {
        int contador = 0;
        Nodo auxiliar = primero;
        while (auxiliar != null) {
            contador++;
            auxiliar = auxiliar.siguiente;
        }
        return contador;
    }
}
