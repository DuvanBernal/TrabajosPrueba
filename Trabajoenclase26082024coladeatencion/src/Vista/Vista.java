/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Nodo;
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
        System.out.println("\nCentro de servicio");
        System.out.println("\n1. Registra cliente");
        System.out.println("\n2. Atender cliente");
        System.out.println("\n3. Mostrar Lista espera");
        System.out.println("\n4. Salir");
        System.out.println("\nSeleccione una opcion:");

        return scanner.nextInt();  // Devuelve la opción seleccionada
    }

    public String pedirNombre() {
        System.out.println("Ingrese el nombre del cliente");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String pedirDocumento() {
        System.out.println("Ingrese el documento del cliente");
        return scanner.nextLine();
    }

    public int seleccionaServicio() {
        System.out.println("Seleccione un servicio");
        System.out.println("\n1.atencion al cliente cliente");
        System.out.println("\n2. Pago servicios");
        System.out.println("\n3. Registro PQRS");
        System.out.println("\n4. Seleccione una opcion:");
        return scanner.nextInt();
    }

    public void mostrarClienteAtendido(Nodo cliente) {
        if (cliente != null) {
            System.out.print("Atendiendo a: " + cliente.getnombreCliente() + "-servicio-" + cliente.getservicio());
        } else {
            System.out.print("No hay clientes en espera");
        }

    }

    public void mostrarListaEspera(Nodo cabeza) {
        if (cabeza == null) {
            System.out.println("La lista de espera esta vacia");
        } else {
            Nodo actual = cabeza;
            System.out.println("Lista de espera");
            while(actual != null){
                System.out.println("Nombre"+actual.getnombreCliente()+"Documento"+actual.getdocumentoCliente()+"Servicio"+actual.getservicio());
                actual=actual.getsiguiente();
            }
        }
    }
}
