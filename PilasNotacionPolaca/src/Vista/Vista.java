/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *Estudiante: Heiner Duvan Bernal Garcia
 *Universidad: Juan de Castellanos
 *Asignatura: Estructura de Datos
 *Fecha: 7/10/2024
 *Descripcion corta del archivo: Solucionar problema de notacion polaca
 */

public class Vista {

    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    // Método para solicitar al usuario que introduzca la expresión RPN
    public String[] obtenerExpresion() {
        System.out.println("Introduce una expresión en notación polaca inversa que se encuentre cada digito separado por espacios (por ejemplo: 3 4 + 5 *):");
        String entrada = scanner.nextLine();
        return entrada.split(" ");
    }

    // Método para mostrar el resultado al usuario
    public void mostrarResultado(int resultado) {
        System.out.println("El resultado de la expresión es: " + resultado);
    }

    // Método para mostrar un mensaje de error
    public void mostrarError(String mensajeError) {
        System.out.println("Error: " + mensajeError);
    }
}
