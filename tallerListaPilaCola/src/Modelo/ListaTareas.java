/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaTareas {
    private Nodo cabeza;

    public ListaTareas() {
        this.cabeza = null;
    }


    public void agregarTarea(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void mostrarTareas() {
        if (cabeza == null) {
            System.out.println("No hay tareas generales.");
            return;
        }

        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.tarea);
            temp = temp.siguiente;
        }
    }
}

