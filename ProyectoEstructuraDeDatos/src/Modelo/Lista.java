/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * Universidad: Juan de Castellanos
 * Estudiantes: Heiner Duvan Bernal Garcia - Fredy Alejandro Martinez Gonzalez
 * Materia: Estructura de Datos
 * Fecha:
 * Motivo: Proyecto Final
 * Descripcion: Planilla de notas interactiva
 */

public class Lista<T> {

    private Nodo<T> cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    public void eliminar(T dato) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.getDato().equals(dato)) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo<T> temp = cabeza;
        while (temp.getSiguiente() != null && !temp.getSiguiente().getDato().equals(dato)) {
            temp = temp.getSiguiente();
        }

        if (temp.getSiguiente() != null) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
        }
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public T buscar(T dato) {
        Nodo<T> temp = cabeza;
        while (temp != null) {
            if (temp.getDato().equals(dato)) {
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }

    public void mostrarLista() {
        Nodo<T> temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }
}
