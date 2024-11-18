/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilosej1;

import Controlador.ContadorControlador;
import Modelo.ContadorModelo;
import Vista.ContadorVista;

/**
 *
 * @author duvan
 */
public class Hilosej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                ContadorModelo modelo1 = new ContadorModelo();
                ContadorModelo modelo2 = new ContadorModelo();

                ContadorVista vista = new ContadorVista();

                new ContadorControlador(modelo1, modelo2, vista);
            }
        });
    }
}
