/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaCircularDoble;
import Vista.VistaLista;

/**
 *
 * @author duvan
 */
public class Controlador {
    private ListaCircularDoble modelo;
    private VistaLista miVista;
    
    public Controlador(ListaCircularDoble lista, VistaLista miVista){
        this.modelo=lista;
    }
    
    public void agregarInicio(int valor){
        modelo.agregarInicio(valor);
    }
    
    public void agregarFinal(int valor){
        modelo.agregarAlFinal(valor);
    }
    
    public void mostrarInicioAFinal(){
        modelo.mostrarListainicio();
    }
    
    public void mostrarFinalAInicio(){
        modelo.mostrarListaDesdeCola();
    }
    
    public void mostrarFinal(){
        miVista.mostrarListaDesdeCola();
    }
    public void mostrarInicio(){
        miVista.mostrarListaInicio();
    }
}
