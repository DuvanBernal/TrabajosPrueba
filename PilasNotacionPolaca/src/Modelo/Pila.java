/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *Estudiante: Heiner Duvan Bernal Garcia
 *Universidad: Juan de Castellanos
 *Asignatura: Estructura de Datos
 *Fecha: 7/10/2024
 *Descripcion corta del archivo: Solucionar problema de notacion polaca
 */
public class Pila {

    private Nodo cima;

    public Pila() {
        cima = null;
    }

    // Método para evaluar la expresión en notación polaca inversa (RPN)
    public int evaluarRPN(String[] tokens) throws IllegalArgumentException {
        for (String token : tokens) {
            if (esOperador(token)) {
                // Extraer los dos operandos superiores
                int b = desapilar();
                int a = desapilar();

                // Realizar la operación y empujar el resultado de vuelta a la pila
                int resultado = aplicarOperador(a, b, token);
                empujar(String.valueOf(resultado));
            } else {
                // Si es un operando, empujarlo a la pila
                empujar(token);
            }
        }

        // El resultado final debe estar en la cima de la pila
        return desapilar();
    }

    // Método para empujar un nodo a la pila
    public void empujar(String valor) {
        Nodo nuevoNodo = new Nodo(Integer.parseInt(valor));
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Método para desapilar
    public int desapilar() {
        if (cima == null) {
            throw new IllegalArgumentException("La pila está vacía.");
        }
        int valor = cima.dato;
        cima = cima.siguiente;
        return valor;
    }

    // Verifica si el token es un operador
    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // Operar dos digitos
    private int aplicarOperador(int a, int b, String operador) throws IllegalArgumentException {
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("División por cero no permitida.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
