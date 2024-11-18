/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ListaCircular;

/**
 *
 * @author duvan
 */
public class Vista {
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void mostrarLista(ListaCircular lista){
        lista.imprimir();
    }
}
