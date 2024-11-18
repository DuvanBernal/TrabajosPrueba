/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ListaDoble {
    private Alumno cabeza;
    private Alumno cola;
    
    public ListaDoble(){
        this.cabeza=null;
        this.cola=null;
    }
    
    public void agregarAlumno(String nombre){
        Alumno nuevo =new Alumno(nombre);
        if(cabeza==null){
            cabeza=nuevo;
            cola=nuevo;
        }else{
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola=nuevo;
        }
    }
    
    public Alumno obtenerCabeza(){
        return cabeza;
    }
    
    public Alumno obtenerAlumnoPosicion(int posicion){
        Alumno actual=cabeza;
        int index=1;
        while(actual!=null&&index<posicion){
            actual= actual.getSiguiente();
            index++;
        }
        return actual;
    }
    
    public void mostrarLista(){
        Alumno actual = cabeza;
        while(actual!=null){
            System.out.print(actual.getNombre());
            actual = actual.getSiguiente();
        }
    }
    
}
