package Vista;

/**
 * Universidad: Juan de Castellanos
 * Estudiantes: Heiner Duvan Bernal Garcia - Fredy Alejandro Martinez Gonzalez
 * Materia: Estructura de Datos
 * Fecha:
 * Motivo: Proyecto Final
 * Descripcion: Planilla de notas interactiva
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class VistaNotas extends JFrame {
    private JComboBox<String> comboAsignaturas;
    private JButton botonAgregarEstudiante;
    private JButton botonCalcularPromedio;
    private JButton botonVerListado;
    private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;

    public VistaNotas() {
        setTitle("Gestión de Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Crear el panel con la imagen de fondo
        JPanel panelConFondo = new JPanel() {
            private Image backgroundImage = new ImageIcon("C:\\Users\\duvan\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoEstructuraDeDatos\\src\\Imagenes\\pixelcut-export.jpeg").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelConFondo.setLayout(new BorderLayout());

        // Panel superior
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.setOpaque(false); // Hacer transparente para ver el fondo

        comboAsignaturas = new JComboBox<>();
        panelSuperior.add(comboAsignaturas);

        botonAgregarEstudiante = new JButton("Agregar Estudiante");
        panelSuperior.add(botonAgregarEstudiante);

        botonCalcularPromedio = new JButton("Calcular Promedio");
        panelSuperior.add(botonCalcularPromedio);

        botonVerListado = new JButton("Ver Listado de Estudiantes");
        panelSuperior.add(botonVerListado);

        panelConFondo.add(panelSuperior, BorderLayout.NORTH);

        // Tabla de estudiantes
        String[] columnNames = {"Nombre", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Promedio", "Aprobado"};
        modeloTabla = new DefaultTableModel(columnNames, 0);
        tablaEstudiantes = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaEstudiantes);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false); // Hacer el área de la tabla transparente

        panelConFondo.add(scrollPane, BorderLayout.CENTER);

        // Añadir el panel con fondo a la ventana
        setContentPane(panelConFondo);
    }

    public void agregarAsignaturaCombo(String nombreAsignatura) {
        comboAsignaturas.addItem(nombreAsignatura);
    }

    public String obtenerAsignaturaSeleccionada() {
        return (String) comboAsignaturas.getSelectedItem();
    }

    public void agregarListenerBotonAgregarEstudiante(ActionListener listener) {
        botonAgregarEstudiante.addActionListener(listener);
    }

    public void agregarListenerBotonCalcularPromedio(ActionListener listener) {
        botonCalcularPromedio.addActionListener(listener);
    }

    public void agregarListenerBotonVerListado(ActionListener listener) {
        botonVerListado.addActionListener(listener);
    }

    public void actualizarTablaEstudiantes(Object[][] data) {
        modeloTabla.setRowCount(0); // Limpiar la tabla
        for (Object[] row : data) {
            modeloTabla.addRow(row);
        }
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
