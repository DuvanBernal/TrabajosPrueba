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
    String nombre;
    Nodo siguiente;
    int nivel;
    
    
    public Nodo(String nombre, int nivel){
        this.nombre=nombre;
        this.siguiente=null;
        this.nivel=nivel;
    }
}
