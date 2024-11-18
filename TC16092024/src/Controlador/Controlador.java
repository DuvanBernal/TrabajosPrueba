/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaCircular;
import Vista.VistaJuego;

/**
 *
 * @author duvan
 */
public class Controlador {

    private ListaCircular Lista;
    private VistaJuego Vista;

    public Controlador(ListaCircular Lista, VistaJuego Vista) {
        this.Lista = Lista;
        this.Vista = Vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = Vista.mostrarMenu();
            procesarOpcion(opcion);
        } while (opcion != 5);
    }

    public void procesarOpcion(int opcion) {
        switch(opcion){
            case 1: 
                agregarJugador();
                break;
            case 2:
                mostrarJugadores();
                break;
            case 3: 
                eliminarJugador();
                break;
            case 4: 
                Jugar();
                break;
            case 5:
                System.out.println("Saliendo");
                
            default:
                Vista.mostrarMensaje("Opcion invalida");
        }

    }
    
    public void agregarJugador(){
        Lista.agregarJugador(Vista.leerNombre());
    }
    
     public void mostrarJugadores(){
        Lista.mostrarJugadores();// Llama al método de lista para mostrar jugadores
    }
    
    public void eliminarJugador(){
        String nombre = Vista.leerNombre();  // Pide el nombre del jugador a eliminar
        Lista.eliminarJugador(nombre);       // Elimina el jugador especificado
    }
    
    public void Jugar(){
        Lista.Jugar();                    // Inicia el juego
    }
}
