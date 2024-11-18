/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohilos;

/**
 * Universidad: Juan de Castellanos
 * Estudiante: Heiner Duvan Bernal Garcia
 * Materia: Estructura de Datos
 * Fecha: 31/10/2024
 */

public class EjemploHilos {

    public static void main(String[] args) {
        
        ContadorSincronizado contador = new ContadorSincronizado();

        Thread hilo1 = new Thread(new HiloContador(contador), "Hilo 1");
        Thread hilo2 = new Thread(new HiloContador(contador), "Hilo 2");

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }

        System.out.println("Contador final: " + contador.getContador());
    }
}
