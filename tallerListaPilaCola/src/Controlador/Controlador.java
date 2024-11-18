/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ColaTareas;
import Modelo.ListaTareas;
import Modelo.PilaTareas;
import Modelo.Tarea;

/**
 *
 * @author duvan
 */
public class Controlador {
    private ListaTareas listaTareas;
    private PilaTareas pilaTareas;
    private ColaTareas colaTareas;

    public Controlador() {
        this.listaTareas = new ListaTareas();
        this.pilaTareas = new PilaTareas();
        this.colaTareas = new ColaTareas();
    }

    public void agregarTareaGeneral(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        listaTareas.agregarTarea(tarea);
    }

    public void agregarTareaUrgente(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        pilaTareas.agregarTarea(tarea);
    }

    public void agregarTareaComun(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        colaTareas.agregarTarea(tarea);
    }

    public void mostrarTareas() {
        System.out.println("Tareas Generales:");
        listaTareas.mostrarTareas();
        System.out.println("Tareas Urgentes:");
        pilaTareas.mostrarTareas();
        System.out.println("Tareas Comunes:");
        colaTareas.mostrarTareas();
    }

    public Tarea atenderTareaUrgente() {
        return pilaTareas.atenderTarea();
    }

    public Tarea atenderTareaComun() {
        return colaTareas.atenderTarea();
    }
}

