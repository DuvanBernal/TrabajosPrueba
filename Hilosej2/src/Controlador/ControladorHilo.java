/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Modelo.ModeloHilo;
import Vista.VistaEjecucion;
import Vista.VistaHilo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author duvan
 */
public class ControladorHilo {

    private  VistaHilo vistaHilo;
    private ModeloHilo modeloHilo;
    private VistaEjecucion vistaEjecucion;

    public ControladorHilo(VistaHilo vistaHilo, ModeloHilo modeloHilo) {
        this.vistaHilo = vistaHilo;
        this.modeloHilo = modeloHilo;

        // Configurar el botón de iniciar simulación
        this.vistaHilo.getBotonIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSimulacion();
            }
        });
    }

    private void iniciarSimulacion() {
        try {
            // Obtener duraciones de cada hilo
            int duracionHilo1 = Integer.parseInt(vistaHilo.getCampoHilo1().getText());
            int duracionHilo2 = Integer.parseInt(vistaHilo.getCampoHilo2().getText());
            int duracionHilo3 = Integer.parseInt(vistaHilo.getCampoHilo3().getText());

            // Crear la vista de ejecución para mostrar la animación
            vistaEjecucion = new VistaEjecucion();

            // Iniciar cada hilo con su duración y actualización correspondiente
            modeloHilo.ejecutarHilo(duracionHilo1, "Hilo 1", () -> actualizarVista(1));
            modeloHilo.ejecutarHilo(duracionHilo2, "Hilo 2", () -> actualizarVista(2));
            modeloHilo.ejecutarHilo(duracionHilo3, "Hilo 3", () -> actualizarVista(3));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vistaHilo, "Por favor ingrese valores válidos para la duración de los hilos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarVista(int hilo) {
        SwingUtilities.invokeLater(() -> {
            // Actualizar el contador y la posición de animación
            if (vistaEjecucion != null) {
                vistaEjecucion.actualizarContador(hilo);
            }
        });
    }
}
