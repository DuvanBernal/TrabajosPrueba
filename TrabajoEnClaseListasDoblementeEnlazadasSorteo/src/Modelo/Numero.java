/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Numero {
    private int valor;
    private Numero siguiente;
    
    public Numero(int valor){
        this.valor=valor;
        this.siguiente=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Numero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Numero siguiente) {
        this.siguiente = siguiente;
    }
}
