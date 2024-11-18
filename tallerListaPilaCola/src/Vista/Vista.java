/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author duvan
 */
import Controlador.Controlador;
import Modelo.Tarea;
import java.util.Scanner;

public class Vista {
    public Controlador controlador;
    public Scanner scanner;

    public Vista() {
        controlador = new Controlador();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n1. Agregar Tarea General");
            System.out.println("2. Agregar Tarea Urgente");
            System.out.println("3. Agregar Tarea Comun");
            System.out.println("4. Mostrar Todas las Tareas");
            System.out.println("5. Atender Tarea Urgente");
            System.out.println("6. Atender Tarea Comun");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarTareaGeneral();
                    break;
                case 2:
                    agregarTareaUrgente();
                    break;
                case 3:
                    agregarTareaComun();
                    break;
                case 4:
                    mostrarTareas();
                    break;
                case 5:
                    atenderTareaUrgente();
                    break;
                case 6:
                    atenderTareaComun();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    private void agregarTareaGeneral() {
        System.out.print("Ingrese la descripción de la tarea general: ");
        String descripcion = scanner.nextLine();
        controlador.agregarTareaGeneral(descripcion);
    }

    private void agregarTareaUrgente() {
        System.out.print("Ingrese la descripción de la tarea urgente: ");
        String descripcion = scanner.nextLine();
        controlador.agregarTareaUrgente(descripcion);
    }

    private void agregarTareaComun() {
        System.out.print("Ingrese la descripción de la tarea común: ");
        String descripcion = scanner.nextLine();
        controlador.agregarTareaComun(descripcion);
    }

    private void mostrarTareas() {
        controlador.mostrarTareas();
    }

    private void atenderTareaUrgente() {
        Tarea tarea = controlador.atenderTareaUrgente();
        if (tarea != null) {
            System.out.println("Tarea Urgente atendida: " + tarea);
        }
    }

    private void atenderTareaComun() {
        Tarea tarea = controlador.atenderTareaComun();
        if (tarea != null) {
            System.out.println("Tarea Común atendida: " + tarea);
        }
    }
}

