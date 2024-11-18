/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaEnlazada {

    private Tarea cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void añadirTarea(Tarea tarea) {
        if (cabeza == null) {
            cabeza = tarea;
        } else {
            Tarea actual = cabeza;
            while (actual.getsiguiente() != null) {
                actual = actual.getsiguiente();
            }
            actual.setsiguiente(tarea);
        }
    }
    public Tarea getCabeza(){
        return cabeza;
    }

}
