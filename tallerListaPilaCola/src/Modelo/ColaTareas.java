/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ColaTareas {
    private Nodo frente, finalCola;

    public ColaTareas() {
        this.frente=null;
        this.finalCola = null;
    }

    public void agregarTarea(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (finalCola == null) {
            frente = finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    public Tarea atenderTarea() {
        if (frente == null) {
            System.out.println("No hay tareas comunes.");
            return null;
        }
        Tarea tareaAtendida = frente.tarea;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        return tareaAtendida;
    }

    public void mostrarTareas() {
        if (frente == null) {
            System.out.println("No hay tareas comunes.");
            return;
        }

        Nodo temp = frente;
        while (temp != null) {
            System.out.println(temp.tarea);
            temp = temp.siguiente;
        }
    }
}

