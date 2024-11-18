/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircular12092024;

import Controlador.Controlador;
import Modelo.ListaCircular;
import Vista.Vista;

/**
 *
 * @author duvan
 */
public class ListaCircular12092024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular Lista=new ListaCircular();
        Vista vista=new Vista();
        Controlador controlador= new Controlador(Lista, vista);
        
        controlador.agregarElemento(10);
        controlador.agregarElemento(4);
        controlador.agregarElemento(5);
        controlador.imprimirLista();
        controlador.eliminarElemento(5);
        controlador.imprimirLista();
      
    }
    
}
