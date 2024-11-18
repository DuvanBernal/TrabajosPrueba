/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContadorVista {

    private JFrame marco;
    private JButton botonIniciar1;
    private JButton botonIniciar2;
    private JLabel etiqueta1;
    private JLabel etiqueta2;

    public ContadorVista() {
        marco = new JFrame("Contador con Hilos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(300, 200);
        marco.setLayout(new FlowLayout());

        etiqueta1 = new JLabel("Contador 1: 0");
        etiqueta2 = new JLabel("Contador 2: 0");
        botonIniciar1 = new JButton("Iniciar 1");
        botonIniciar2 = new JButton("Iniciar  2");

        marco.add(etiqueta1);
        marco.add(botonIniciar1);
        marco.add(etiqueta2);
        marco.add(botonIniciar2);

        marco.setVisible(true);
    }

    public void establecerTexto(String texto) {
        etiqueta1.setText(texto);
    }

    public void establecerTexto2(String texto) {
        etiqueta2.setText(texto);
    }

    public void agregarBoton(ActionListener escuchar1) {
        botonIniciar1.addActionListener(escuchar1);
    }

    public void agregarBoton2(ActionListener escuchar2) {
        botonIniciar2.addActionListener(escuchar2);
    }

    public void deshabilitar() {
        botonIniciar1.setEnabled(false);
    }

    public void deshabilitar2() {
        botonIniciar2.setEnabled(false);
    }
}