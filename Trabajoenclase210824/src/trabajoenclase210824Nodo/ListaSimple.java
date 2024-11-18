/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase210824Nodo;

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
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void eliminar() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.print("La lista esta vacia");
        }
    }

    public void mostrarLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.print("null");
    }
}
