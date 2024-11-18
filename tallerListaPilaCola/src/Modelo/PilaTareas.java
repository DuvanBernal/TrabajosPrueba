/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class PilaTareas {
    private Nodo cima;

    public PilaTareas() {
        this.cima = null;
    }

    public void agregarTarea(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
    }

    public Tarea atenderTarea() {
        if (cima == null) {
            System.out.println("No hay tareas urgentes.");
            return null;
        }
        Tarea tareaAtendida = cima.tarea;
        cima = cima.siguiente;
        return tareaAtendida;
    }

    public void mostrarTareas() {
        if (cima == null) {
            System.out.println("No hay tareas urgentes.");
            return;
        }

        Nodo temp = cima;
        while (temp != null) {
            System.out.println(temp.tarea);
            temp = temp.siguiente;
        }
    }
}

