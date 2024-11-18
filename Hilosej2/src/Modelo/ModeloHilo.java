/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ModeloHilo {

    public void ejecutarHilo(int duracion, String nombreHilo, Runnable actualizar) {
        new Thread(() -> {
            try {
                for (int i = 0; i < duracion; i++) {
                    Thread.sleep(1000);
                    actualizar.run();
                }

                System.out.print(nombreHilo + "finalizado");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
