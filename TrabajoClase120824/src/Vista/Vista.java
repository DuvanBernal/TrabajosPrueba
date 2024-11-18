/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int solicitarNumero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarCalificaciones(int[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarPromedioEstudiante(int estudiante, double promedio) {
        System.out.println("Promedio del estudiante " + (estudiante + 1) + ": " + promedio);
    }

    public void mostrarPromedioMateria(int materia, double promedio) {
        System.out.println("Promedio en la materia " + (materia + 1) + ": " + promedio);
    }

    public void mostrarReporte(String reporte) {
        System.out.println(reporte);
    }
}

