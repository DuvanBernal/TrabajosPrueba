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

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void guardarDatosEnArchivo() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\duvan\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoEstructuraDeDatos\\src\\Texto\\" +nombre + ".txt"))) {
            for (Estudiante estudiante : estudiantes) {
                writer.println(estudiante.getNombre() + "," + estudiante.getNotas().toString().replace("[", "").replace("]", ""));
            }
        }
    }

    public void cargarDatosDesdeArchivo() throws IOException {
        estudiantes.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\duvan\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoEstructuraDeDatos\\src\\Texto\\" +nombre + ".txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombreEstudiante = partes[0];
                Estudiante estudiante = new Estudiante(nombreEstudiante);

                for (int i = 1; i < partes.length; i++) {
                    estudiante.agregarNota(Double.parseDouble(partes[i].trim()));
                }
                estudiantes.add(estudiante);
            }
        }
    }
}
