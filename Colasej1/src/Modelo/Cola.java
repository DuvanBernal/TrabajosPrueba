/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Cola {
    private Nodo frente;
    private Nodo fondo;// esta es la misma cola
    
    public Cola(){
        this.fondo=null;
        this.frente=null;
    }
    
    public boolean esVacia(){
        return frente == null;
    }
    //metodo para encolar 
    public void encolar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(esVacia()){
            frente=fondo=nuevoNodo;
        }else{
            fondo.siguiente=nuevoNodo;
            fondo=nuevoNodo;
        }
    }
    
    //metodo para desencolar
    public int desencolar(){
        if(esVacia()){
            System.out.println("La cola esta vacia");
            return -1;
        }else{
            //variable para guardar el dato que se encuentra en la frente 
            int dato = frente.dato;
            frente=frente.siguiente;
            if(frente == null){
                fondo=null;
            }
            return dato;
        }
    }
    
    //metodo para mostrar la cola
    public void mostrarLaCola(){
        if(esVacia()){
            System.out.println("La cola esta vacia");
        }else{
            Nodo actual = frente;
            System.out.println("Cola completa");
            while(actual != null){
                System.out.println(actual.dato + " ");
                actual=actual.siguiente;
            }
            System.out.println();
        }
    }
}

        