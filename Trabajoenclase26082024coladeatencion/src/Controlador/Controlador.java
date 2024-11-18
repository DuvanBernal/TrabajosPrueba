/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Lista;
import Modelo.Nodo;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class Controlador {

    private Lista lista;
    private Vista vista;

    public Controlador(Lista milista, Vista mivista) {
        this.vista = mivista;
        this.lista = milista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String nombre = vista.pedirNombre();
                    String documento = vista.pedirDocumento();
                    int servicioOpcion = vista.seleccionaServicio();

                    String servicio = "";

                    switch (servicioOpcion) {
                        case 1:
                            servicio = "Servicio al cliente";
                            break;
                        case 2:
                            servicio = "Pago de servicios";
                            break;
                        case 3:
                            servicio = "Registro PQRS";
                            break;
                        default:
                            System.out.print("Opcion invalida");
                            servicio = "servicio al cliente";
                            break;
                    }
                    lista.añadirCliente(nombre, documento, servicio);
                    System.out.print("cliente añadido a la lista de espera");

                    break;

                case 2:
                    Nodo clienteAtendido = lista.atenderCliente();
                    vista.mostrarClienteAtendido(clienteAtendido);
                    break;
                case 3:
                    vista.mostrarListaEspera(lista.getCabeza());
                    break;
                case 4:
                    System.out.print("saliendo del sistema");
                    break;

                default:
                    System.out.println("opcion invalida, intente nuevamente ");
            }

        } while (opcion != 4);
    }
}
