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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModeloNotas {
    private List<Asignatura> asignaturas;

    public ModeloNotas() {
        this.asignaturas = new ArrayList<>();
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public Asignatura buscarAsignatura(String nombreAsignatura) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                return asignatura;
            }
        }
        return null;
    }

    public void cargarDatosAsignaturas() {
        for (Asignatura asignatura : asignaturas) {
            try {
                asignatura.cargarDatosDesdeArchivo();
            } catch (IOException e) {
                System.out.println("Error al cargar datos para la asignatura " + asignatura.getNombre() + ": " + e.getMessage());
            }
        }
    }

    public void guardarDatosAsignaturas() {
        for (Asignatura asignatura : asignaturas) {
            try {
                asignatura.guardarDatosEnArchivo();
            } catch (IOException e) {
                System.out.println("Error al guardar datos para la asignatura " + asignatura.getNombre() + ": " + e.getMessage());
            }
        }
    }
}
