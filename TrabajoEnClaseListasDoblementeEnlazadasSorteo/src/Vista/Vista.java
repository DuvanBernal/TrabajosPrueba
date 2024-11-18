/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ListaDoble;

/**
 *
 * @author duvan
 */
public class Vista {

    public void mostrarListaAlumnos(ListaDoble listaAlumnos) {
        System.out.println("Listado de Alumnos:");
        listaAlumnos.mostrarLista();
    }

    public void mostrarAsignacionNumero(String nombre, int numeroasignado) {
        System.out.println(nombre + " su numero asignado es: " + numeroasignado);
    }

}
