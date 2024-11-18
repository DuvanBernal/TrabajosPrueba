/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int numeroEstudiantes = vista.solicitarNumero("Ingrese el número de estudiantes:");
        int numeroMaterias = vista.solicitarNumero("Ingrese el número de materias:");
        modelo = new Modelo(numeroEstudiantes, numeroMaterias);

        for (int i = 0; i < numeroEstudiantes; i++) {
            for (int j = 0; j < numeroMaterias; j++) {
                int calificacion = vista.solicitarNumero("Ingrese la calificación del estudiante " + (i + 1) + " en la materia " + (j + 1) + ":");
                modelo.setCalificaciones(i, j, calificacion);
            }
        }

        vista.mostrarCalificaciones(modelo.getCalificaciones());

        for (int i = 0; i < numeroEstudiantes; i++) {
            double promedioEstudiante = modelo.calcularPromedioEstudiante(i);
            vista.mostrarPromedioEstudiante(i, promedioEstudiante);
        }

        for (int i = 0; i < numeroMaterias; i++) {
            double promedioMateria = modelo.calcularPromedioMateria(i);
            vista.mostrarPromedioMateria(i, promedioMateria);
        }

        int[] mejorEstudiante = modelo.obtenerEstudianteConMejorPromedio();
        int[] menorEstudiante = modelo.obtenerEstudianteConMenorPromedio();
        int[] mejorMateria = modelo.obtenerMateriaConMejorPromedio();
        int[] menorMateria = modelo.obtenerMateriaConMenorPromedio();

        StringBuilder reporte = new StringBuilder();
        reporte.append("Estudiante con el mayor promedio: Estudiante ")
                .append(mejorEstudiante[0] + 1)
                .append(" con promedio ")
                .append(mejorEstudiante[1])
                .append("\nEstudiante con el menor promedio: Estudiante ")
                .append(menorEstudiante[0] + 1)
                .append(" con promedio ")
                .append(menorEstudiante[1])
                .append("\nMateria con el mejor promedio: Materia ")
                .append(mejorMateria[0] + 1)
                .append(" con promedio ")
                .append(mejorMateria[1])
                .append("\nMateria con el menor promedio: Materia ")
                .append(menorMateria[0] + 1)
                .append(" con promedio ")
                .append(menorMateria[1]);

        vista.mostrarReporte(reporte.toString());

        // Actualización de calificaciones
        int estudianteActualizar = vista.solicitarNumero("Ingrese el número del estudiante cuya calificación desea actualizar:");
        int materiaActualizar = vista.solicitarNumero("Ingrese el número de la materia que desea actualizar:");
        int nuevaCalificacion = vista.solicitarNumero("Ingrese la nueva calificación:");
        modelo.actualizarCalificacion(estudianteActualizar - 1, materiaActualizar - 1, nuevaCalificacion);

        // Mostrar reporte después de la actualización
        vista.mostrarCalificaciones(modelo.getCalificaciones());
    }
}

