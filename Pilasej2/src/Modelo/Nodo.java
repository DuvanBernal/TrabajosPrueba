/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Nodo {
    
    Nodo siguiente;
    char dato;
    
    public Nodo(char dato){
        this.siguiente=null;
        this.dato=dato;
    }
}
