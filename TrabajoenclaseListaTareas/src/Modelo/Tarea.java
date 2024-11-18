/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public abstract class Tarea {

    protected String nombre;
    protected String descripcion;
    protected Tarea siguiente;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.siguiente = null;
    }

    public abstract String obtenerTipoTarea();

    public String getnombre() {
        return nombre;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public Tarea getsiguiente() {
        return siguiente;
    }

    public void setsiguiente(Tarea siguiente) {
        this.siguiente = siguiente;
    }
}
