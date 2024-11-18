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

public class HiloContador implements Runnable {
    
    private ContadorSincronizado contador;

    public HiloContador(ContadorSincronizado contador) {
        this.contador = contador;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            contador.incrementar();
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }
    }
}

