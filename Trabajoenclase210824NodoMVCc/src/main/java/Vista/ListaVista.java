/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Nodo;

/**
 *
 * @author duvan
 */
public class ListaVista {
    
    public void mostrarLista(Nodo cabeza){
        Nodo temp=cabeza;
        while(temp!=null){
            System.out.println(temp.getDato()+"->");
            temp=temp.getsiguiente();
        }
        System.out.println("null");
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
