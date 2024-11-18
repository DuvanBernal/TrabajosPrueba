/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.*;
import vista.*;
/**
 *Estudiante: Duvan Bernal
 *Universidad: Juan de Castellanos
 *Asignatura: Estructura de datos
 *Descripcion: Hallar el area de dos objetos diferentes
 */
public class ControladorPrincipal {
    
    private final VistaPrincipal vistaPrincipal;

    public ControladorPrincipal(VistaPrincipal vistaPrincipal, ModeloPrincipal modeloPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }
    
    public void iniciar(){
        vistaPrincipal.setTitle("Area");
        vistaPrincipal.setLocation(null);
    }
    

}
