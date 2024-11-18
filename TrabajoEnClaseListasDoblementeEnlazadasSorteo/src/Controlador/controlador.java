/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Alumno;
import Modelo.ListaDoble;
import Modelo.ListaNumeros;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class controlador {
    
    
    private ListaNumeros listan;
    private Vista vistaSorteo;
    private ListaDoble listaalumno;
    
    
    public controlador(Vista vistaSorteo, ListaDoble listad, ListaNumeros listan){
        this.listaalumno=listad;
        this.listan=listan;
        this.vistaSorteo=vistaSorteo;
    }
    
    public void iniciar(){
        //Asignar un numero a cada persona 
        Alumno actual=listaalumno.obtenerCabeza();
        while(actual!=null){
            int numeroAsignado=listan.sacarAleatorio();
            actual.setNumeroAsignado(numeroAsignado);
            
            vistaSorteo.mostrarAsignacionNumero(actual.getNombre(),actual.getNumeroAsignado());
            actual=actual.getSiguiente();
        }
        actual=listaalumno.obtenerCabeza();
        while(actual!=null){
            Alumno amigosecreto=listaalumno.obtenerAlumnoPosicion(actual.getNumeroAsignado());
            actual=actual.getSiguiente();
        }
    }
}
