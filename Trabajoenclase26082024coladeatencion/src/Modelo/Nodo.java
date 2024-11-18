/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class Nodo {

    private String nombreCliente;
    private String documentoCliente;
    private String servicio;
    private Nodo siguiente;

    public Nodo(String nombre, String documento, String servicio) {
        this.nombreCliente = nombre;
        this.documentoCliente = documento;
        this.servicio = servicio;
        this.siguiente = null;
    }
    
    public String getnombreCliente(){
        return nombreCliente;
    }
    
    public void setnombreClient(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }

    public String getdocumentoCliente() {
        return documentoCliente;
    }

    public void setdocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }
    
    public String getservicio(){
        return servicio;
    }
    
    public void setservicio(String servicio){
        this.servicio=servicio;
    }
    
    public Nodo getsiguiente(){
        return siguiente;
    }
    
    //public void setsiguiente(Nodo siguiente){La parte dentro del parentesis se llama parametro
    public void setsiguiente(Nodo siguiente){ 
        this.siguiente=siguiente;
    }
    
}
