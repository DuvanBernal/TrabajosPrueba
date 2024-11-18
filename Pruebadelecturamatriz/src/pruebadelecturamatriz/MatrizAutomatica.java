/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebadelecturamatriz;

import java.util.Random;

/**
 *
 * @author duvan
 */

public class MatrizAutomatica {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Matriz 3x3
        
        // Llenar la matriz automáticamente
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100); // Valores entre 0 y 99
            }
        }
        
        // Imprimir la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

