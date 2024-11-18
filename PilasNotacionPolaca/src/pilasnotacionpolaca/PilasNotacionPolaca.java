/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilasnotacionpolaca;

import Controlador.Controlador;
import Modelo.Pila;
import Vista.Vista;

/**
 *Estudiante: Heiner Duvan Bernal Garcia
 *Universidad: Juan de Castellanos
 *Asignatura: Estructura de Datos
 *Fecha: 7/10/2024
 *Descripcion corta del archivo: Solucionar problema de notacion polaca
 */
public class PilasNotacionPolaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila modelo = new Pila();
        Vista miVista = new Vista();
        Controlador controlador = new Controlador(modelo, miVista);

        controlador.procesarExpresion();
    }
}
