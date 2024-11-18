/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaCircular {

    private Nodo cabeza = null;
    private Nodo cola = null;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        }
    }

    public boolean eliminar(int valor) {
        if (cabeza == null) {
            return false;
        } else {
            Nodo actual = cabeza;
            Nodo anterior = null;

            do {
                if (actual.dato == valor) {
                    if (anterior != null) {
                        anterior.siguiente = actual.siguiente;
                        if (actual == cabeza) {
                            cabeza = anterior;
                        }
                    }else {
                            //si el nodo a eliminar es la cabeza
                            if (cabeza == cola) {
                                cabeza = null;
                            } else {
                                cabeza = cabeza.siguiente;
                                cola.siguiente = cabeza;
                            }
                        }
                    return true;
                }
                anterior = actual;
                    actual = actual.siguiente;

            } while (actual != cabeza);
            return false;
            //nodo no encontrado
        }
    }

    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo actual = cabeza;
        do {
            System.out.println(actual.dato + "->");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("");
    }
    //metodo para verificar si la lista esta vacia
    public boolean esVacia(){
        return cabeza==null;
    }

}
