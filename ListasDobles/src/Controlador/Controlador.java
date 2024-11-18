/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaDoble;
import vista1.Vista;

/**
 *
 * @author duvan
 */
public class Controlador<T> {

    private ListaDoble<T> modelo;
    private Vista vista;

    public Controlador(ListaDoble<T> lista, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion = 0;
        do {
            vista.mostrarMenu();
            opcion=vista.obtenerOpcion(opcion);
            vista.obtenerOpcion(opcion);
        } while (opcion != 0);
    }

    public void procesar(int opcion) {
        switch (opcion) {
            case 1:
                agregarAlFinal();
                break;
            case 2:
                agregarAlInicio();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                buscar();
                break;
            default:
                vista.mostrarMensaje("opcion Invalida");
        }
    }

    private void agregarAlFinal() {
        T elemento = (T) Integer.valueOf(vista.obtenerNumero("Ingrese el elemento a agregar al final de la lista "));
        modelo.agregarAlFinal(elemento);
        vista.mostrarMensaje("Elemento agregado al final");
    }

    private void agregarAlInicio() {
        T elemento = (T) Integer.valueOf(vista.obtenerNumero("Ingrese el elemento a agregar al inicio"));
        modelo.agregarAlInicio(elemento);
        vista.mostrarMensaje("Elemento agregado al inicio");
    }
    
    private void eliminar() {
        T elemento = (T) Integer.valueOf(vista.obtenerNumero("Ingrese el dato a eliminar"));
        modelo.eliminar(elemento);
        vista.mostrarMensaje("Elemento eliminado");
    }
    
    private void buscar(){
        T elemento = (T) Integer.valueOf(vista.obtenerNumero("Ingrese el dato a buscar"));
        modelo.buscar(elemento);
        vista.mostrarMensaje("buscando elemento");
    }
    
    private void mostrar(){
        modelo.MostrarLista();
    }

}
