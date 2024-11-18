/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Buscaminas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Digite el tamaño de las columnas: ");
        int c = leer.nextInt();
        System.out.print("Digite el tamaño de las filas: ");
        int f = leer.nextInt();
        System.out.print("Digite el número de minas: ");
        int numMinas = leer.nextInt();
        
        // Validación del número de minas
        if (numMinas > f * c) {
            System.out.println("El número de minas no puede ser mayor que el número total de celdas.");
            leer.close();
            return;
        }
        
        // Inicializar el tablero
        char[][] tablero = new char[f][c];
        boolean[][] minas = new boolean[f][c];
        
        // Inicializar el tablero y las minas
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tablero[i][j] = '.';
                minas[i][j] = false;
            }
        }
        
        // Colocar minas aleatoriamente
        Random rand = new Random();
        int minasColocadas = 0;
        while (minasColocadas < numMinas) {
            int fila = rand.nextInt(f);
            int col = rand.nextInt(c);
            if (!minas[fila][col]) {
                minas[fila][col] = true;
                minasColocadas++;
            }
        }
        
        // Crear el personaje en la posición inicial (0, 0)
        Personaje personaje = new Personaje(0, 0);
        
        // Mostrar el tablero con minas
        System.out.println("Tablero con minas (para verificación):");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i == personaje.getFila() && j == personaje.getCol()) {
                    System.out.print("P "); // Mostrar el personaje en el tablero
                } else if (minas[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        
        // Ejemplo de mover al personaje
        System.out.println("Ingrese nueva posición del personaje:");
        System.out.print("Fila: ");
        int nuevaFila = leer.nextInt();
        System.out.print("Columna: ");
        int nuevaCol = leer.nextInt();
        
        // Validar los límites
        if (nuevaFila >= 0 && nuevaFila < f && nuevaCol >= 0 && nuevaCol < c) {
            personaje.mover(nuevaFila, nuevaCol);
        } else {
            System.out.println("La nueva posición está fuera del tablero.");
        }
        
        // Mostrar la nueva posición del personaje
        personaje.mostrar();
        
        // Mostrar el tablero con la nueva posición del personaje
        System.out.println("Tablero actualizado:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i == personaje.getFila() && j == personaje.getCol()) {
                    System.out.print("P "); // Mostrar el personaje en el tablero
                } else if (minas[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        leer.close();
    }
}


    
