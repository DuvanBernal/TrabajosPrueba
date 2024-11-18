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
public class VistaJuego {
    private Scanner scanner;
    
    public VistaJuego(){
        scanner=new Scanner(System.in);
    }
    
    //menu principal
    public int mostrarMenu(){
        System.out.println("--menu parque juego de diversion--");
        System.out.println("1. agregar un jugador a la lista");
        System.out.println("2. Mostra jugadores en la lista");
        System.out.println("3. eliminar un jugador de la lista");
        System.out.println("4. Jugar un turno");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opcion");
        return scanner.nextInt();
    }
    
    //metodo para leer la opcion ingresada
    
    public int leerOpcion(){
        return scanner.nextInt();
    }
    
    //metodo para ingresar o leer el nombre del jugador
    
    public String leerNombre(){
        System.out.println("Ingrese el nombre del jugador");
        scanner.nextLine();
        return scanner.nextLine();
         
    }
    public void mostrarMensaje(String mensaje){
        System.out.print("mensaje");
    }
}
