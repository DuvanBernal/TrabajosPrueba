/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobles;

import Controlador.Controlador;
import Modelo.ListaDoble;
import vista1.Vista;

/**
 *
 * @author duvan
 */
public class ListasDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListaDoble modelo=new ListaDoble();
        Vista vista=new Vista();
        Controlador micontrolador=new Controlador(modelo, vista);
        micontrolador.iniciar();
        
    }
    
}
