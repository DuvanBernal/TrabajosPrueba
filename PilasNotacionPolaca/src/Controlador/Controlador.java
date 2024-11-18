/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pila;
import Vista.Vista;

/**
 *Estudiante: Heiner Duvan Bernal Garcia
 *Universidad: Juan de Castellanos
 *Asignatura: Estructura de Datos
 *Fecha: 7/10/2024
 *Descripcion corta del archivo: Solucionar problema de notacion polaca
 */
public class Controlador {

    private Pila modelo;
    private Vista vista;

    public Controlador(Pila modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Método para procesar la expresión
    public void procesarExpresion() {
        try {
            String[] expresion = vista.obtenerExpresion();
            int resultado = modelo.evaluarRPN(expresion);
            vista.mostrarResultado(resultado);
        } catch (Exception e) {
            vista.mostrarError(e.getMessage());
        }
    }
}
