/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Modelo {

    private int[][] calificaciones;
    private int numeroEstudiantes;
    private int numeroMaterias;

    public Modelo(int numeroEstudiantes, int numeroMaterias) {
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroMaterias = numeroMaterias;
        calificaciones = new int[numeroEstudiantes][numeroMaterias];
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int estudiante, int materia, int calificacion) {
        calificaciones[estudiante][materia] = calificacion;
    }

    public double calcularPromedioEstudiante(int estudiante) {
        int suma = 0;
        for (int calificacion : calificaciones[estudiante]) {
            suma += calificacion;
        }
        return (double) suma / numeroMaterias;
    }

    public double calcularPromedioMateria(int materia) {
        int suma = 0;
        for (int i = 0; i < numeroEstudiantes; i++) {
            suma += calificaciones[i][materia];
        }
        return (double) suma / numeroEstudiantes;
    }

    public int[] obtenerEstudianteConMejorPromedio() {
        int mejorEstudiante = 0;
        double mejorPromedio = calcularPromedioEstudiante(0);
        for (int i = 1; i < numeroEstudiantes; i++) {
            double promedio = calcularPromedioEstudiante(i);
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = i;
            }
        }
        return new int[]{mejorEstudiante, (int) mejorPromedio};
    }

    public int[] obtenerEstudianteConMenorPromedio() {
        int menorEstudiante = 0;
        double menorPromedio = calcularPromedioEstudiante(0);
        for (int i = 1; i < numeroEstudiantes; i++) {
            double promedio = calcularPromedioEstudiante(i);
            if (promedio < menorPromedio) {
                menorPromedio = promedio;
                menorEstudiante = i;
            }
        }
        return new int[]{menorEstudiante, (int) menorPromedio};
    }

    public int[] obtenerMateriaConMejorPromedio() {
        int mejorMateria = 0;
        double mejorPromedio = calcularPromedioMateria(0);
        for (int i = 1; i < numeroMaterias; i++) {
            double promedio = calcularPromedioMateria(i);
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorMateria = i;
            }
        }
        return new int[]{mejorMateria, (int) mejorPromedio};
    }

    public int[] obtenerMateriaConMenorPromedio() {
        int menorMateria = 0;
        double menorPromedio = calcularPromedioMateria(0);
        for (int i = 1; i < numeroMaterias; i++) {
            double promedio = calcularPromedioMateria(i);
            if (promedio < menorPromedio) {
                menorPromedio = promedio;
                menorMateria = i;
            }
        }
        return new int[]{menorMateria, (int) menorPromedio};
    }

    public void actualizarCalificacion(int estudiante, int materia, int nuevaCalificacion) {
        setCalificaciones(estudiante, materia, nuevaCalificacion);
    }
}
