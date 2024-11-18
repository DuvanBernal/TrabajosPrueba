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

public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fondo;

    public Cola() {
        this.frente = this.fondo = null;
    }

    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (fondo == null) {
            frente = fondo = nuevoNodo;
            return;
        }
        fondo.setSiguiente(nuevoNodo);
        fondo = nuevoNodo;
    }

    public T desencolar() {
        if (frente == null) return null;

        T dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null) {
            fondo = null;
        }
        return dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }
}
