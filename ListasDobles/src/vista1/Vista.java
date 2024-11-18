/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista1;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Vista {
    
    private Scanner scanner;
    
    public Vista(){
        this.scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu(){
        System.out.println("Menu");
        System.out.println("1.Agregar un elemento al final");
        System.out.println("2.Agregar un elemento al inicio");
        System.out.println("3.Eliminar un elemento");
        System.out.println("4.Buscar un elemento");
        System.out.println("5.Invertir Lista");
        System.out.println("6.Mostrar Lista");
        System.out.println("0.Salir");
        System.out.println("Selecciona una opcion");
    }
    
    public int obtenerOpcion(int opcion){
        return scanner.nextInt();
    }
    
    public int obtenerNumero(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.print(mensaje);
    }
}
