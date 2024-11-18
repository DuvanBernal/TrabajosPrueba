/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaSimple {

    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getsiguiente() != null) {

                temp = temp.getsiguiente();
            }
            temp.setsiguiente(nuevoNodo);
        }

    }
    
    public int buscar(int elemento){
        Nodo Actual=cabeza;
        while(Actual!=null){
            if(Actual.dato==elemento){
                return Actual.dato;
            }
            Actual=Actual.siguiente;
        }
        return -1;
        
    }

    public void eliminar() {

        if (cabeza != null) {
            cabeza = cabeza.getsiguiente();
        } else {
            System.out.print("Lista vacia");
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}
