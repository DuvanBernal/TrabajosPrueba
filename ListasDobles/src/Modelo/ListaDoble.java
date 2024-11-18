/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaDoble<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;

        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;

        }
        tamanio++;

    }

    public void agregarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
        tamanio++;
    }

    public void eliminar(T dato) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (actual.anterior == null) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    } else if (actual.siguiente == null) {
                        cola = actual.anterior;
                        cola.siguiente = null;
                    } else {
                        actual.anterior.siguiente = actual.siguiente;
                        actual.siguiente.anterior = actual = actual.anterior;
                    }
                    tamanio--;
                    return;
                }
                actual = actual.siguiente;
            }
        }

    }

    public boolean buscar(T dato) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            } else {
                actual = actual.siguiente;
            }
        }
        return false;
    }

    public void MostrarLista() {
        if (cabeza==null){
            System.out.println("La lista esta vacia ");
            
        }else{
            Nodo actual= cabeza;
            do{
                System.out.println(actual.dato + "--");
                actual=actual.siguiente;
             
                    
                }while(actual!=cabeza);
            System.out.println("");
            }
        }

    public void InvertirLista() {
        Nodo<T> Temp = null;
        Nodo<T> Actual = cabeza;
        while (Actual != null) {
            Temp =Actual.anterior;
            Actual.anterior = Temp.siguiente;
            Temp.anterior=Actual.siguiente;
            Actual.siguiente=Actual.anterior;
            if (Temp!=null){
                cabeza=Actual.siguiente;
            }
        }

    }

}
