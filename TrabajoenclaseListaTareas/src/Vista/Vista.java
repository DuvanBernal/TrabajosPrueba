/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Prioridad;
import Modelo.Tarea;
import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class Vista {

    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\nGestion de tareas");
        System.out.println("Añadir tarea");
        System.out.println("1. Añadir tarea personal");
        System.out.println("2. Añadir tarea de trabajo");
        System.out.println("3. Asignar priodridad");
        System.out.println("4. Mostrar Lista de Tareas");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion");

        return scanner.nextInt();
    }

    public String pedirNombre() {
        System.out.println("Ingrese el nombre de la tarea: ");
        scanner.nextLine();

        return scanner.nextLine();
    }

    public String pedirDescripcion() {
        System.out.println("Ingrese la descripcion de la tarea: ");

        return scanner.nextLine();
    }

    public int pedirPrioridad() {
        System.out.println("Ingrese la prioridad de (1-5)");

        return scanner.nextInt();
    }

    public String pedirProyectoAsociado() {
        System.out.println("Ingrese el nombre del proyecto");

        return scanner.nextLine();
    }

    public void mostrarListaDeTareas(Tarea cabeza) {
        if (cabeza == null) {
            System.out.println("Lista de tareas vacia");
        } else {
            Tarea Actual = cabeza;
            System.out.println("Lista de Tareas");
            while (Actual != null) {
                String tipoTarea = Actual.obtenerTipoTarea();
                System.out.println("Nombre: " + Actual.getnombre() + "\nDescripcion: " + Actual.getdescripcion() + "\nTipo de Tarea: " + tipoTarea);
                if (Actual instanceof Prioridad) {
                    System.out.println("Prioridad: " + ((Prioridad) Actual).obtenerPrioridad());
                }
                 Actual = Actual.getsiguiente();
            }
           
        }
    }
    public int pedirPosicionTarea(){
        System.out.println("Ingrese la prioridad de la tarea que desea asignar");
        
        return scanner.nextInt();
    }
}
