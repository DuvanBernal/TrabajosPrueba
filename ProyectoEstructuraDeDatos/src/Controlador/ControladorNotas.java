
package Controlador;

/**
 * Universidad: Juan de Castellanos
 * Estudiantes: Heiner Duvan Bernal Garcia - Fredy Alejandro Martinez Gonzalez
 * Materia: Estructura de Datos
 * Fecha:
 * Motivo: Proyecto Final
 * Descripcion: Planilla de notas interactiva
 */

import Modelo.Asignatura;
import Modelo.ModeloNotas;
import Modelo.Estudiante;
import Vista.VistaNotas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControladorNotas {
    private ModeloNotas modelo;
    private VistaNotas vista;

    public ControladorNotas(ModeloNotas modelo, VistaNotas vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Cargar asignaturas y estudiantes desde archivo
        modelo.cargarDatosAsignaturas();

        // Llenar el comboBox de asignaturas en la vista
        for (Asignatura asignatura : modelo.getAsignaturas()) {
            vista.agregarAsignaturaCombo(asignatura.getNombre());
        }

        Object[][] data = new Object[0][3];
        vista.actualizarTablaEstudiantes(data);

        // Configurar los listeners
        vista.agregarListenerBotonCalcularPromedio(new CalcularPromedioListener());
        vista.agregarListenerBotonAgregarEstudiante(new AgregarEstudianteListener());
        vista.agregarListenerBotonVerListado(new VerListadoEstudiantesListener());

        // Guardar datos al cerrar la aplicación
        vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                modelo.guardarDatosAsignaturas();
            }
        });
    }

    public void agregarAsignatura(String nombreAsignatura) {
        Asignatura asignatura = new Asignatura(nombreAsignatura);
        modelo.agregarAsignatura(asignatura);
        vista.agregarAsignaturaCombo(nombreAsignatura);
    }

    class AgregarEstudianteListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        if (nombreEstudiante != null && !nombreEstudiante.trim().isEmpty()) {
            double[] notas = new double[4];
            boolean notasValidas = true;
            for (int i = 0; i < 4; i++) {
                int cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas notas desea ingresar para la nota " + (i + 1) + "?"));
                List<Double> notasPeriodo = new ArrayList<>();
                for (int j = 0; j < cantidadNotas; j++) {
                    String notaStr = JOptionPane.showInputDialog("Ingrese la nota " + (j + 1) + " del período " + (i + 1) + " (0.0 - 5.0):");
                    if (notaStr == null) {
                        notasValidas = false;
                        break;
                    }
                    try {
                        double nota = Double.parseDouble(notaStr);
                        if (nota < 0.0 || nota > 5.0) {
                            JOptionPane.showMessageDialog(null, "La nota debe estar entre 0.0 y 5.0.");
                            notasValidas = false;
                            break;
                        }
                        notasPeriodo.add(nota);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido para la nota.");
                        notasValidas = false;
                        break;
                    }
                }
                if (notasValidas) {
                    double promedioPeriodo = notasPeriodo.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
                    notas[i] = promedioPeriodo;
                } else {
                    break;
                }
            }
            if (notasValidas) {
                String nombreAsignatura = vista.obtenerAsignaturaSeleccionada();
                Asignatura asignatura = modelo.buscarAsignatura(nombreAsignatura);
                if (asignatura != null) {
                    Estudiante estudiante = new Estudiante(nombreEstudiante);
                    for (double nota : notas) {
                        estudiante.agregarNota(nota);
                    }
                    asignatura.agregarEstudiante(estudiante);
                    try {
                        asignatura.guardarDatosEnArchivo();
                        JOptionPane.showMessageDialog(null, "Estudiante y notas guardadas exitosamente.");
                    } catch (IOException ioEx) {
                        JOptionPane.showMessageDialog(null, "Error al guardar los datos en el archivo: " + ioEx.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Asignatura no encontrada.");
                }
            } else {
                vista.mostrarMensaje("El nombre del estudiante no puede estar vacío.");
            }
        }
    }
}


    class CalcularPromedioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreAsignatura = vista.obtenerAsignaturaSeleccionada();
            Asignatura asignatura = modelo.buscarAsignatura(nombreAsignatura);

            if (asignatura != null) {
                Object[][] data = new Object[asignatura.getEstudiantes().size()][7];

                for (int i = 0; i < asignatura.getEstudiantes().size(); i++) {
                    Estudiante estudiante = asignatura.getEstudiantes().get(i);
                    data[i][0] = estudiante.getNombre();
                    for (int j = 0; j < 4; j++) {
                        data[i][j + 1] = j < estudiante.getNotas().size() ? estudiante.getNotas().get(j) : 0.0;
                    }
                    data[i][5] = estudiante.calcularPromedio();
                    data[i][6] = estudiante.aprobo() ? "Sí" : "No";
                }

                vista.actualizarTablaEstudiantes(data);
                vista.mostrarMensaje("Promedios calculados para todos los estudiantes en " + nombreAsignatura);
            } else {
                vista.mostrarMensaje("Asignatura no encontrada.");
            }
        }
    }

    class VerListadoEstudiantesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreAsignatura = vista.obtenerAsignaturaSeleccionada();
            Asignatura asignatura = modelo.buscarAsignatura(nombreAsignatura);

            if (asignatura != null) {
                try {
                    asignatura.cargarDatosDesdeArchivo(); // Carga los datos desde el archivo .txt
                    Object[][] data = new Object[asignatura.getEstudiantes().size()][7];

                    for (int i = 0; i < asignatura.getEstudiantes().size(); i++) {
                        Estudiante estudiante = asignatura.getEstudiantes().get(i);
                        data[i][0] = estudiante.getNombre();
                        for (int j = 0; j < 4; j++) {
                            data[i][j + 1] = j < estudiante.getNotas().size() ? estudiante.getNotas().get(j) : 0.0;
                        }
                        data[i][5] = estudiante.calcularPromedio();
                        data[i][6] = estudiante.aprobo() ? "Sí" : "No";
                    }

                    vista.actualizarTablaEstudiantes(data); // Actualiza la tabla en la vista
                    vista.mostrarMensaje("Listado de estudiantes cargado para " + nombreAsignatura);
                } catch (IOException ioEx) {
                    vista.mostrarMensaje("Error al cargar los datos desde el archivo: " + ioEx.getMessage());
                }
            } else {
                vista.mostrarMensaje("Asignatura no encontrada.");
            }
        }
    }
}

