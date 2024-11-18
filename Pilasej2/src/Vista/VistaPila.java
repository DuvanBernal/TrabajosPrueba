/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author duvan
 */
public class VistaPila {
    private Scanner scanner;
    
    public VistaPila(){
        scanner=new Scanner(System.in);
    }
    
    public String pedirExpresion(){
        System.out.println("Ingrese la expresion a validar");
        return scanner.nextLine();
    }
    
    public void resultados(boolean balanceado){
        if (balanceado){
            System.out.println("la expresion esta balanceada");
        }else{
            System.out.println("La expresion no esta balanceada");
        }
    }
}
