/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclaselistasdoblementeenlazadassorteo;

import Controlador.controlador;
import Modelo.ListaDoble;
import Modelo.ListaNumeros;
import Vista.Vista;
import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class TrabajoEnClaseListasDoblementeEnlazadasSorteo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        
        System.out.println("Ingrese el numero de alumnos: ");
        int numAlumnos =scanner.nextInt();
        scanner.nextLine();
        
        
        ListaDoble ListaAlumnos = new ListaDoble();
        for(int i=1 ; i<=numAlumnos; i++){
            System.out.println("Ingrese el nombre del alumno "+i+": ");
            String nombre = scanner.nextLine();
            ListaAlumnos.agregarAlumno(nombre);
        }
        ListaNumeros listaNumeros = new ListaNumeros();
        for (int i=1; i<=numAlumnos;i++){
            listaNumeros.agregarNumero(i);
        }
        Vista vista=new Vista();
        
        controlador Controlador = new controlador( vista, ListaAlumnos, listaNumeros);

        Controlador.iniciar();
        
        scanner.close();
    }
    
}
