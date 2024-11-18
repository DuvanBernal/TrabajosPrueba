/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Nodo {

    int dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}
