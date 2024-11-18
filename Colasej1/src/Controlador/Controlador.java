/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cola;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class Controlador {
 
    private Cola cola;
    
    public Controlador(Cola cola){
        this.cola=cola;
    }
    
    public void encolar(int dato){
        cola.encolar(dato);
    }
    
    public void desencolar(){
        cola.desencolar();
    }
    
    public void mostrarCola(){
        cola.mostrarLaCola();
    }
    
}
