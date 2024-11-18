/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author duvan
 */
public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    //metodo para agregar un nodo 
    public void agregar(int valor) {
        raiz = agregarR(raiz, valor);
    }

    public Nodo agregarR(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.derecho = agregarR(actual.derecho, valor);
        }
        return actual;
    }

    //metodo para eliminar un Nodo
    public void eliminar(int valor) {
        raiz = eliminarR(raiz, valor);
    }

    public Nodo eliminarR(Nodo actual, int valor) {
        if (actual == null) {
            return null;
        }
        if (valor == actual.valor) {
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }
            //arbol solo con un hijo
            if (actual.izquierdo == null) {
                return actual.derecho;
            }
            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            //validacion nodo con dos hijos
            int valorMenor = encontrarValor(actual.derecho);
            actual.valor = valorMenor;
            actual.derecho = eliminarR(actual.derecho, valorMenor);
            return actual;

        }
        if (valor < actual.valor) {
            actual.izquierdo = eliminarR(actual.izquierdo, valor);
            return actual;
        }

        actual.derecho = eliminarR(actual.derecho, valor);
        return actual;
    }

    private int encontrarValor(Nodo raiz) {
        return raiz.izquierdo == null ? raiz.valor : encontrarValor(raiz.izquierdo);
    }

    public void imprimirPreorden() {
        imprimirR(raiz);
    }

    public void imprimirR(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            imprimirR(nodo.izquierdo);
            imprimirR(nodo.derecho);
        }
    }
}
