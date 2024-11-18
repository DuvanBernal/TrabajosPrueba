/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionListener;
import Vista.Vista;
import Modelo.Modelo;
import java.awt.event.ActionEvent;
import Modelo.Modelo2;
import Vista.Vista2;


public class Controlador implements ActionListener {
    private Vista view;
    private Modelo model;
    private Vista2 view2;
    private Modelo2 model2;
    
    public Controlador(Vista view, Modelo model){
        this.view=view;
        this.model=model;
        this.view.JB_pasajeros.addActionListener(this);
        this.view.JB_Carga.addActionListener(this);
    }
    public Controlador(Vista2 view2, Modelo2 model2){
        this.view2=view2;
        this.model2=model2;
        this.view2.JB_continuarv2.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC - CapturaDatos ");
        view.setLocationRelativeTo(null);
   
    }
    public void actionPerformed(ActionEvent e){
        model.setColor(view.JTF_color.getText());
        model.setMarca(view.JTF_marca.getText());
        model.setTamaño(view.JTF_tamaño.getText());
        
    }
    public void actionPerformed2(ActionEvent e){
        model2.setCantidadasientos(view2.JTF_cantidadasientos.getText());
        model2.setCantidadmascaras(view2.JTF_mascarasoxigeno.getText());
        model2.imprimirInfo();
        view2.JTF_cantidadasientos.setText(model2.getcantidadasientosR());
        view2.JTF_mascarasoxigeno.setText(model2.getmascarasoxigenoR());
    }
    
    
}
