/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ArbolBinario;
import Vista.VistaArbol;

/**
 *
 * @author duvan
 */
public class Controlador {

    private ArbolBinario modelo;
    private VistaArbol vista;

    public Controlador(ArbolBinario modelo, VistaArbol vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    //metodo para agregar un valor
    public void agregar(int valor) {
        modelo.agregar(valor);
        vista.mostrarMensaje("valor " + valor + " agregado al arbol");

    }

    public void eliminar(int valor) {
        modelo.eliminar(valor);
        vista.mostrarMensaje("valor " + valor + " eliminado del arbol");
    }

    public void mostrar() {
        StringBuilder pre = new StringBuilder();
        modelo.imprimirPreorden();
    }
}
