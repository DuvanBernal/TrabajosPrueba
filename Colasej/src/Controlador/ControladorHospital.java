/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ColaPaciente;
import Modelo.Nodo;

/**
 *
 * @author duvan
 */
public class ControladorHospital {

    private ColaPaciente colaurgencias, colaemergencias, colanourgente;

    public ControladorHospital() {
        colaurgencias = new ColaPaciente();
        colaemergencias = new ColaPaciente();
        colanourgente = new ColaPaciente();
    }

    public void registrarpaciente(String nombre, int nivel) {
        switch (nivel) {
            case 1:
                colaemergencias.encolar(nombre, nivel);
                System.out.println("Paciente " + nombre + " registrado");
                break;
            case 2:
                colaurgencias.encolar(nombre, nivel);
                System.out.println("Paciente " + nombre + " registrado");
                break;
            case 3:
                colanourgente.encolar(nombre, nivel);
                System.out.println("Paciente " + nombre + " registrado");
                break;

            default:
                System.out.println("nivel incorrecto");
        }
    }

    public void atenderPaciente() {
        if (colanourgente.esVacia()) {
            if (colaurgencias.esVacia()) {
                Nodo paciente = colaemergencias.desencolar();
                System.out.println("Paciente atendido");
            }
            Nodo paciente = colaurgencias.desencolar();
            System.out.println("Paciente atendido");
        }
        Nodo paciente = colanourgente.desencolar();
        System.out.println("Paciente atendido");

    }
    /*codigo corregido
    public void atenderPaciente() {
    Nodo paciente = null;

    // Atender de la cola de emergencias (con mayor prioridad)
    if (!colaemergencias.esVacia()) {
        paciente = colaemergencias.desencolar();
    } 
    // Si la cola de emergencias está vacía, atender de la cola de urgencias
    else if (!colaurgencias.esVacia()) {
        paciente = colaurgencias.desencolar();
    } 
    // Si la cola de emergencias y urgencias están vacías, atender de la cola no urgente
    else if (!colanourgente.esVacia()) {
        paciente = colanourgente.desencolar();
    }

    // Verificar si se atendió a un paciente
    if (paciente != null) {
        System.out.println("Paciente atendido");
    } else {
        System.out.println("No hay pacientes para atender");
    }
}
    */
}
