/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaEnlazada;
import Modelo.Prioridad;
import Modelo.Tarea;
import Modelo.TareaPersonal;
import Modelo.TareaTrabajo;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class Controlador {

    private ListaEnlazada listaTareas;
    private Vista vista;

    public Controlador(ListaEnlazada lista, Vista mivista) {
        this.listaTareas = lista;
        this.vista = mivista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String nombre = vista.pedirNombre();
                    String descripcion = vista.pedirDescripcion();
                    TareaPersonal tareap = new TareaPersonal(nombre, descripcion);
                    listaTareas.añadirTarea(tareap);
                    System.out.println("Tarea personal añadida");
                    break;
                case 2:
                    String nombret = vista.pedirNombre();
                    String descripciont = vista.pedirDescripcion();
                    String proyecto = vista.pedirProyectoAsociado();
                    TareaTrabajo tareat = new TareaTrabajo(nombret, descripciont, proyecto);
                    listaTareas.añadirTarea(tareat);
                    System.out.println("Tarea personal añadida");
                    break;
                case 3:
                    vista.mostrarListaDeTareas(listaTareas.getCabeza());
                    int posicion = vista.pedirPosicionTarea();
                    Tarea actual = listaTareas.getCabeza();
                    for (int i = 1; i < posicion && actual != null; i++) {
                        actual = actual.getsiguiente();
                    }
                    if (actual instanceof Prioridad) {
                        int prioridad = vista.pedirPrioridad();
                        ((Prioridad) actual).establecerPrioridad(prioridad);
                        System.out.println("Prioridad asignada");
                    } else {
                        System.out.println("La tarea seleccionada no tiene prioridad asignable");
                    }
                    break;

                case 4:
                    vista.mostrarListaDeTareas(listaTareas.getCabeza());
                    break;

                case 5:
                    System.out.println("Saliendo del sistema......");
                default:
                    System.out.println("Opcion invalida intente nuevamente");
            }
        } while (opcion != 5);
    }
}
