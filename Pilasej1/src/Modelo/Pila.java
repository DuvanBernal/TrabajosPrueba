package Modelo;

public class Pila {

    private Nodo cima; // Apunta al nodo en la cima de la pila
    private int size;  // Tamaño de la pila

    public Pila() {
        cima = null;
        this.size = 0;
    }

    // Método para verificar si la pila está vacía
    public boolean pilaVacia() {
        return cima == null;
    }

    // Método para ingresar nodos a la pila
    public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);  // Crear un nuevo nodo
        if (pilaVacia()) {
            cima=nuevoNodo;
        } else {
            if(dato==cima.dato+1){
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
            }else{
                System.out.println("El dato no cumple con la condicion");
                return;
            }
        }
        size++;
    }

    // Método para desapilar o eliminar un nodo de la pila
    public int desapilar() {
        if (pilaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        int valor = cima.dato;  // Obtener el valor del nodo en la cima
        cima = cima.siguiente;  // La cima ahora es el siguiente nodo
        size--;  // Reducir el tamaño de la pila
        return valor;  // Devolver el valor desapilado
    }

    // Método para imprimir los elementos de la pila
    public void mostrarPila() {
        if (pilaVacia()) {
            System.out.println("La pila está vacía");
        } else {
            Nodo actual = cima;  // Empezar desde la cima
            System.out.println("Pila completa");
            while (actual != null) {
                System.out.println(actual.dato);  // Imprimir el dato del nodo actual
                actual = actual.siguiente;  // Avanzar al siguiente nodo
            }
        }
    }

    // Método para mostrar el último elemento (la cima) de la pila
    public int ultimo() {
        if (pilaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        System.out.println("Ultimo dato de la Pila");
        return cima.dato;  // Devolver el dato del nodo en la cima
    }

    // Método para obtener el tamaño de la pila
    public int obtenerTamaño() {
        return size;
    }
}
