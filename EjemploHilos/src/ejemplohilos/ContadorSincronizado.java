/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos;

/**
 * Universidad: Juan de Castellanos
 * Estudiante: Heiner Duvan Bernal Garcia
 * Materia: Estructura de Datos
 * Fecha: 31/10/2024
 */

public class ContadorSincronizado {
    private int contador = 0;

    // Método para incrementar el contador
    public synchronized void incrementar() {
        contador++;
        System.out.println(Thread.currentThread().getName() + " - Contador: " + contador);
    }

    public int getContador() {
        return contador;
    }
}

