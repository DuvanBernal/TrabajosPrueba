/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pila;
import Vista.VistaPila;

/**
 *
 * @author duvan
 */
public class PilaControlador {

    private Pila modelo;
    private VistaPila miVista;

    public PilaControlador(VistaPila miVista, Pila modelo) {
        this.miVista = miVista;
        this.modelo = modelo;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = miVista.mostraMenu();

            switch (opcion) {

                case 1:
                    int numero = miVista.pedirNumero();
                    modelo.apilar(numero);
                    miVista.mostrarMensaje("Numero apilado correctamente");
                    break;

                case 2:
                    int quitar = modelo.desapilar();
                    miVista.mostrarMensaje("Numero Desapilado " + quitar);
                    break;

                case 3:
                    int cima = modelo.ultimo();
                    miVista.mostrarMensaje("Ultimo dato de la pila " + cima);
                    break;

                case 4:
                    modelo.mostrarPila();
                    break;

                case 5:
                    continuar = false;
                    miVista.mostrarMensaje("Saliendo ....");
                    break;

                default:
                    miVista.mostrarMensaje("Opcion no valida");
                    break;

            }
        }
    }
}
