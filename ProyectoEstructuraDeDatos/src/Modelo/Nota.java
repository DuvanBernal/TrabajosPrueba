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

public class Nota {
    private double calificacion;
    private double porcentaje;

    public Nota(double calificacion, double porcentaje) {
        this.calificacion = calificacion;
        this.porcentaje = porcentaje;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularNotaPonderada() {
        return calificacion * (porcentaje / 100.0);
    }

    @Override
    public String toString() {
        return "Calificación: " + calificacion + ", Porcentaje: " + porcentaje;
    }
}



