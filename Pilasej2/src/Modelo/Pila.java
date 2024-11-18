/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    //metodo para apilar o agregar datos a la pila
    public void apilar(char valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    //metodo para validar si la pila esta vacia
    public boolean esVacia() {
        return cima == null;
    }

    //metodo para desapilar
    public char desapilar() {
        if (esVacia()) {
            System.out.println("La pila esta vacia");
        }
        char valor = cima.dato;
        cima = cima.siguiente;
        return valor;

    }

    //metodo para ver la cima
    public char verCima() {
        if (esVacia()) {
            System.out.println("La pila esta vacia");
        }
        return cima.dato;
    }

}
