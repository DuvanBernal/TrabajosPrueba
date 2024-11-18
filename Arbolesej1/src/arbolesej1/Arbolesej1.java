/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesej1;

import Controlador.Controlador;
import Modelo.ArbolBinario;
import Vista.VistaArbol;

/**
 *
 * @author duvan
 */
public class Arbolesej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaArbol vista = new VistaArbol();
        ArbolBinario modelo = new ArbolBinario();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.agregar(23);
        controlador.agregar(65);
        controlador.agregar(76);
        controlador.agregar(1);
        controlador.eliminar(76);

    }

}
