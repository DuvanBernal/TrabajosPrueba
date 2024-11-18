/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class VistaPila {

    private Scanner entrada;

    public VistaPila() {
        entrada = new Scanner(System.in);
    }

    //metodo mostrar menu
    public int mostraMenu() {
        System.out.println("Menu Pila");
        System.out.println("1. apilar");
        System.out.println("2.Desapilar");
        System.out.println("3. Ver cima ");
        System.out.println("4.Ver pila");
        System.out.println("5.Salir");
        System.out.println("Ingrese una opcion valida");
        return entrada.nextInt();
    }

    public int pedirNumero() {
        System.out.println("Ingrese el dato");
        return entrada.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarNumero(int numero) {
        System.out.println("El numero es: " + numero);
    }
}
