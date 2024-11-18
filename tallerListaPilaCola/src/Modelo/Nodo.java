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
    Tarea tarea;
    Nodo siguiente;

    public Nodo(Tarea tarea) {
        this.tarea = tarea;
        this.siguiente = null;
    }
}

