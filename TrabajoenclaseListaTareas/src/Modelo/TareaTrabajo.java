/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class TareaTrabajo extends Tarea implements Prioridad {
    private int prioridad;
    private String ProyectoAsociado;
    
    public TareaTrabajo(String nombre, String descripcion, String proyectoasociado){
        super(nombre,descripcion);
        this.ProyectoAsociado=proyectoasociado;
        
    }
    
    public void establecerPrioridad(int prioridad){
        this.prioridad=prioridad;
    }
    
    @Override
    public int obtenerPrioridad(){
        return prioridad;
    }
    
    public String obtenerTipoTarea(){
        return "Tarea de trabajo: "+ProyectoAsociado;
    }
    
    
}

