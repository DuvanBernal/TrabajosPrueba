/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ContadorModelo;
import Vista.ContadorVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorControlador {

    private ContadorModelo modelo1;
    private ContadorModelo modelo2;
    private ContadorVista vista;

    public ContadorControlador(ContadorModelo modelo1, ContadorModelo modelo2, ContadorVista vista) {
        this.modelo1 = modelo1;
        this.modelo2 = modelo2;
        this.vista = vista;

        this.vista.agregarBoton(new EscucharContador1());
        this.vista.agregarBoton2(new EscucharContador2());
    }

    class EscucharContador1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vista.deshabilitar();
            Thread hiloContador1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        modelo1.incrementar();
                        vista.establecerTexto("Contador 1: " + modelo1.obtenerContador());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            hiloContador1.start();
        }
    }

    class EscucharContador2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vista.deshabilitar2();
            Thread hiloContador2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 500; i++) {
                        modelo2.incrementar();
                        vista.establecerTexto2("Contador 2: " + modelo2.obtenerContador());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            hiloContador2.start();
        }
    }
}
