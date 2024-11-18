/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Alumno {

    private String nombre;
    private int numeroAsignado;
    private Alumno anterior;
    private Alumno siguiente;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.numeroAsignado = -1;
        this.anterior = null;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAsignado() {
        return numeroAsignado;
    }

    public void setNumeroAsignado(int numeroasignado) {
        this.numeroAsignado = numeroasignado;
    }

    public Alumno getAnterior() {
        return anterior;
    }

    public void setAnterior(Alumno anterior) {
        this.anterior = anterior;
    }

    public Alumno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Alumno siguiente) {
        this.siguiente = siguiente;
    }

}
