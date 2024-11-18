/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Validar;
import Vista.VistaPila;

/**
 *
 * @author duvan
 */
public class ControladorPila {
    
    Validar validar =new Validar();
    VistaPila miVista = new VistaPila();
    
    public ControladorPila(VistaPila miVista,Validar validar){
        this.miVista=miVista;
        this.validar=validar;
    }
    
    public void iniciar(){
        String expresion= miVista.pedirExpresion();
        boolean balanceado = validar.esBalanceado(expresion);
        miVista.resultados(balanceado);
    }
}
