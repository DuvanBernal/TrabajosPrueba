/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ContadorModelo {
    private int contador;
    
    public void ContadorModelo(){
        this.contador = 0;
    }
    public int obtenerContador (){
        return contador;
    }
    
    public void incrementar(){
        contador++;
    }
    
    public void reiniciar(){
        contador = 0;
    }
    
    
}
