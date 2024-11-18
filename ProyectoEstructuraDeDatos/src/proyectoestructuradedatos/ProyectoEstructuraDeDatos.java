/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoestructuradedatos;

import Controlador.ControladorNotas;
import Modelo.ModeloNotas;
import Vista.VistaNotas;

/**
 * Universidad: Juan de Castellanos
 * Estudiantes: Heiner Duvan Bernal Garcia - Fredy Alejandro Martinez Gonzalez
 * Materia: Estructura de Datos
 * Fecha:
 * Motivo: Proyecto Final
 * Descripcion: Planilla de notas interactiva
 */

public class ProyectoEstructuraDeDatos {
    public static void main(String[] args) {
        ModeloNotas modelo = new ModeloNotas();
        VistaNotas vista = new VistaNotas();

        ControladorNotas controlador = new ControladorNotas(modelo, vista);

        vista.setVisible(true);
        controlador.agregarAsignatura("Ecuaciones Diferenciales");
        controlador.agregarAsignatura("Redes de Computacion");
        controlador.agregarAsignatura("Estructura de Datos");
        controlador.agregarAsignatura("Estadistica");
        controlador.agregarAsignatura("Electronica Digital");
    }
}

