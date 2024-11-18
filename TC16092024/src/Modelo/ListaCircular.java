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

    //metodo para agregar un jugador al final 
    public void agregarJugador(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public String mostrarJugadores() {
        if (cabeza == null) {
            return "La lista esta vacia";
        } else {
            StringBuilder resultado = new StringBuilder();
            Nodo actual = cabeza;
            do {
                resultado.append(actual.nombre).append("->");
                actual = actual.siguiente;
            } while (actual != cabeza);
            resultado.append("Volver al principio");
            return resultado.toString();
        }

    }

    //metodo para eliminar un jugador
    public boolean eliminarJugador(String nombre) {
        if (cabeza == null) {
            return false;
        } else {
            Nodo actual = cabeza;
            Nodo anterior = null;

            do {
                //.equals dependiente de caracter String se usa para igualar cadenas de texto
                if (actual.nombre.equals(nombre)) {
                    if (anterior != null) {
                        anterior.siguiente = actual.siguiente;
                        if (actual == cabeza) {
                            cabeza = anterior;
                        }
                    } else {
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
    
    //metodo para jugar 
    public String Jugar(){
        if (cabeza==null){
            return "La lista esta vacia";
        }
        String jugadorActual=cabeza.nombre;
        cabeza=cabeza.siguiente;
        cola=cola.siguiente;
        return "Turno del jugador" + jugadorActual;
    }

}
