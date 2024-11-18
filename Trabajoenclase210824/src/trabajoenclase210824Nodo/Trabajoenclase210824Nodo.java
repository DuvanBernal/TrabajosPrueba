/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase210824Nodo;

/**
 *
 * @author duvan
 */
public class Trabajoenclase210824Nodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple Lista=new ListaSimple();
        Lista.agregar(2);
        Lista.agregar(5);
        Lista.agregar(10);
        
        System.out.println("Lista despues de agregar elementos:");
        Lista.mostrarLista();
        Lista.eliminar();
        
        System.out.println("\nLista despues de eliminar elementos:");
        Lista.mostrarLista();
    }
    
}
