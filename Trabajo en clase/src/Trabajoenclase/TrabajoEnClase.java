/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajoenclase;

import Modelo.Modelo;
import Controlador.Controlador;
import Modelo.Modelo2;
import Vista.Vista;
import Vista.Vista2;

/**
 *
 * @author 57313
 */
public class TrabajoEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo mod = new Modelo();
       Vista view = new Vista();
       Modelo2 mod2 = new Modelo2();
       Vista2 view2 = new Vista2();
       Controlador cont = new Controlador(view,mod);
       Controlador cont2 = new Controlador(view2,mod2);
       cont.iniciar();
       view.setVisible(true);
    }
    
}
