/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author duvan
 */
public class ListaNumeros {

    private Numero cabeza;

    public ListaNumeros() {
        this.cabeza = null;
    }
    
    public void agregarNumero(int valor){
        Numero nuevo = new Numero(valor);
        if(cabeza==null){
            cabeza=nuevo;
            
        }else{
            Numero actual=cabeza;
            while(actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    
    public int sacarAleatorio(){
        if(cabeza==null){
            throw new IllegalStateException("No hay numeros disponibles");
        }
        Random ramdom = new Random ();
        int indiceAleatorio=ramdom.nextInt(contarNumeros());
        Numero actual=cabeza;
        Numero anterior=null;
        
        for(int i=0; i<indiceAleatorio;i++){
            anterior=actual;
            actual=actual.getSiguiente();
        }
        
        int valor = actual.getValor();
        if (anterior==null){
            cabeza=actual.getSiguiente();
        }else{
            anterior.setSiguiente(actual.getSiguiente());
        }
        return valor;
    }
    
    public int contarNumeros(){
        int conteo=0;
        Numero actual=cabeza;
        while(actual!=null){
            conteo++;
            actual=actual.getSiguiente();
        }
        return conteo;
    }
    
}
