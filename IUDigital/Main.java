package IUDigital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Listas estáticas para almacenar departamentos y reportes
    private static List<Departamento> departamentos = new ArrayList<>();
    private static List<ReporteDesempenio> reportes = new ArrayList<>();

    public static void main(String[] args) {
        // Crear el marco principal de la aplicación
        JFrame frame = new JFrame("Gestión de Empleados y Departamentos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        frame.setSize(600, 500); // Establecer el tamaño de la ventana

        // Ventana emergente con aviso inicial
        JOptionPane.showMessageDialog(null,
                "Asegúrese de crear el departamento antes de agregar un empleado para poder asociarlo.",
                "Aviso",
                JOptionPane.INFORMATION_MESSAGE);

        // Crear un panel con un diseño de cuadrícula
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); // Configuración de restricciones para el diseño
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre componentes

        // Etiqueta de título
        JLabel label = new JLabel("Seleccione una acción:");
        label.setHorizontalAlignment(SwingConstants.CENTER); // Centrar la etiqueta
        label.setFont(new Font("Arial", Font.BOLD, 20)); // Establecer fuente y tamaño
        gbc.gridx = 0; // Columna en la cuadrícula
        gbc.gridy = 0; // Fila en la cuadrícula
        gbc.gridwidth = 2; // Ocupa dos columnas
        gbc.anchor = GridBagConstraints.CENTER; // Centrar el componente en su celda
        panel.add(label, gbc); // Añadir la etiqueta al panel

        // Botones de acción
        // Botón para agregar empleado
        JButton botonAgregarEmpleado = new JButton("Agregar Empleado");
        botonAgregarEmpleado.setFont(new Font("Arial", Font.BOLD, 16)); // Establecer fuente y tamaño
        gbc.gridx = 0; // Columna
        gbc.gridy = 1; // Fila
        gbc.gridwidth = 2; // Ocupa dos columnas
        panel.add(botonAgregarEmpleado, gbc); // Añadir botón al panel

        // Botón para crear departamento
        JButton botonCrearDepartamento = new JButton("Crear Departamento");
        botonCrearDepartamento.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 2; // Fila
        panel.add(botonCrearDepartamento, gbc); // Añadir botón al panel

        // Botón para eliminar departamento
        JButton botonEliminarDepartamento = new JButton("Eliminar Departamento");
        botonEliminarDepartamento.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 3; // Fila
        panel.add(botonEliminarDepartamento, gbc); // Añadir botón al panel

        // Botón para actualizar departamento
        JButton botonActualizarDepartamento = new JButton("Actualizar Departamento");
        botonActualizarDepartamento.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 4; // Fila
        panel.add(botonActualizarDepartamento, gbc); // Añadir botón al panel

        // Botón para generar reporte
        JButton botonGenerarReporte = new JButton("Generar Reporte");
        botonGenerarReporte.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 5; // Fila
        panel.add(botonGenerarReporte, gbc); // Añadir botón al panel

        // Botón para eliminar empleado
        JButton botonEliminarEmpleado = new JButton("Eliminar Empleado");
        botonEliminarEmpleado.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 6; // Fila
        panel.add(botonEliminarEmpleado, gbc); // Añadir botón al panel

        // Botón para actualizar empleado
        JButton botonActualizarEmpleado = new JButton("Actualizar Empleado");
        botonActualizarEmpleado.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 7; // Fila
        panel.add(botonActualizarEmpleado, gbc); // Añadir botón al panel

        // Área de texto para mostrar información y resultados
        JTextArea areaTexto = new JTextArea(10, 30); // Crear área de texto
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 14)); // Establecer fuente y tamaño
        JScrollPane scrollPane = new JScrollPane(areaTexto); // Añadir barra de desplazamiento
        gbc.gridx = 0; // Columna
        gbc.gridy = 8; // Fila
        gbc.gridwidth = 2; // Ocupa dos columnas
        gbc.fill = GridBagConstraints.BOTH; // Llenar el espacio disponible
        gbc.weightx = 1; // Peso horizontal
        gbc.weighty = 1; // Peso vertical
        panel.add(scrollPane, gbc); // Añadir área de texto al panel

        // Añadir el panel al marco y hacerlo visible
        frame.add(panel);
        frame.setVisible(true);

        // Lógica para agregar empleados
        botonAgregarEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado(areaTexto); // Llamar al método para agregar empleado
            }
        });

        // Lógica para crear departamentos
        botonCrearDepartamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearDepartamento(); // Llamar al método para crear departamento
            }
        });

        // Lógica para eliminar departamentos
        botonEliminarDepartamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarDepartamento(); // Llamar al método para eliminar departamento
            }
        });

        // Lógica para actualizar departamentos
        botonActualizarDepartamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarDepartamento(); // Llamar al método para actualizar departamento
            }
        });

        // Lógica para generar reportes
        botonGenerarReporte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarReporte(areaTexto); // Llamar al método para generar reporte
            }
        });

        // Lógica para eliminar empleados
        botonEliminarEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarEmpleado(areaTexto); // Llamar al método para eliminar empleado
            }
        });

        // Lógica para actualizar empleados
        botonActualizarEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarEmpleado(); // Llamar al método para actualizar empleado
            }
        });
    }

    // Método para agregar un empleado
    public static void agregarEmpleado(JTextArea areaTexto) {
        // Solicitar al usuario seleccionar un departamento
        String departamentoNombre = (String) JOptionPane.showInputDialog(null,
                "Seleccione el departamento al que desea agregar un empleado:",
                "Agregar Empleado",
                JOptionPane.PLAIN_MESSAGE,
                null,
                departamentos.stream().map(Departamento::getNombre).toArray(String[]::new),
                null);

        // Si se seleccionó un departamento
        if (departamentoNombre != null) {
            // Solicitar datos del empleado
            String id = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");

            // Solicitar tipo de empleado
            String[] opciones = {"Temporal", "Permanente"};
            String tipoEmpleado = (String) JOptionPane.showInputDialog(null,
                    "Seleccione el tipo de empleado:",
                    "Tipo de Empleado",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            Empleado nuevoEmpleado = null; // Inicializar el nuevo empleado

            // Crear empleado según el tipo seleccionado
            if ("Temporal".equals(tipoEmpleado)) {
                int duracionContrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración del contrato (en meses):"));
                nuevoEmpleado = new EmpleadoTemporal(id, nombre, apellido, duracionContrato);
            } else if ("Permanente".equals(tipoEmpleado)) {
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
                nuevoEmpleado = new EmpleadoPermanente(id, nombre, apellido, salario);
            }

            // Busca el departamento seleccionado y agrega el empleado
            for (Departamento dep : departamentos) {
                if (dep.getNombre().equals(departamentoNombre)) {
                    try {
                        dep.agregarEmpleado(nuevoEmpleado); // Agregar el nuevo empleado al departamento
                        areaTexto.append("Empleado agregado: " + nuevoEmpleado + "\n"); // Mostrar mensaje en área de texto
                    } catch (GestionException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage()); // Mostrar error si ocurre
                    }
                    break; // Salir del bucle
                }
            }
        }
    }

    // Método para crear un nuevo departamento
    public static void crearDepartamento() {
        // Solicitar datos del nuevo departamento
        String id = JOptionPane.showInputDialog("Ingrese el ID del departamento:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del departamento:");
        int capacidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima de empleados:"));

        Departamento nuevoDepartamento = new Departamento(id, nombre, capacidadMaxima); // Crear el departamento
        departamentos.add(nuevoDepartamento); // Agregar a la lista de departamentos

        // Mostrar detalles del nuevo departamento
        String detallesDepartamento = String.format("ID: %s\nNombre: %s\nCapacidad máxima: %d",
                id, nombre, capacidadMaxima);

        JOptionPane.showMessageDialog(null, "Departamento creado con éxito:\n" + detallesDepartamento); // Mensaje de éxito
    }

    // Método para eliminar un departamento
    public static void eliminarDepartamento() {
        // Obtener nombres de todos los departamentos
        String[] departamentoNombres = departamentos.stream().map(Departamento::getNombre).toArray(String[]::new);
        // Solicitar al usuario seleccionar un departamento a eliminar
        String departamentoSeleccionado = (String) JOptionPane.showInputDialog(null,
                "Seleccione un departamento a eliminar:",
                "Eliminar Departamento",
                JOptionPane.PLAIN_MESSAGE,
                null,
                departamentoNombres,
                departamentoNombres[0]);

        // Si se seleccionó un departamento
        if (departamentoSeleccionado != null) {
            // Eliminar el departamento seleccionado de la lista
            departamentos.removeIf(departamento -> departamento.getNombre().equals(departamentoSeleccionado));
            JOptionPane.showMessageDialog(null, "Departamento eliminado con éxito: " + departamentoSeleccionado); // Mensaje de éxito
        }
    }

    // Método para actualizar un departamento
    public static void actualizarDepartamento() {
        // Obtener nombres de todos los departamentos
        String[] departamentoNombres = departamentos.stream().map(Departamento::getNombre).toArray(String[]::new);
        // Solicitar al usuario seleccionar un departamento a actualizar
        String departamentoSeleccionado = (String) JOptionPane.showInputDialog(null,
                "Seleccione un departamento a actualizar:",
                "Actualizar Departamento",
                JOptionPane.PLAIN_MESSAGE,
                null,
                departamentoNombres,
                departamentoNombres[0]);

        // Si se seleccionó un departamento
        if (departamentoSeleccionado != null) {
            // Buscar el departamento seleccionado
            Departamento departamento = departamentos.stream()
                    .filter(dep -> dep.getNombre().equals(departamentoSeleccionado))
                    .findFirst()
                    .orElse(null);

            // Si el departamento existe
            if (departamento != null) {
                // Solicitar nuevos datos
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del departamento:", departamento.getNombre());
                int nuevaCapacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva capacidad máxima:", departamento.getCapacidadMaxima()));

                // Actualizar los datos del departamento
                departamento.setNombre(nuevoNombre);
                departamento.setCapacidadMaxima(nuevaCapacidad);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Departamento actualizado con éxito:\nNombre: " + nuevoNombre + "\nCapacidad: " + nuevaCapacidad);
            }
        }
    }

    // Método para generar un reporte
    public static void generarReporte(JTextArea areaTexto) {
        // Implementar la lógica para generar el reporte de desempeño aquí
        // Por ahora solo se mostrará un mensaje
        JOptionPane.showMessageDialog(null, "Funcionalidad de generación de reportes no implementada aún.");
    }

    // Método para eliminar un empleado
    public static void eliminarEmpleado(JTextArea areaTexto) {
        // Solicitar al usuario seleccionar un departamento
        String departamentoNombre = (String) JOptionPane.showInputDialog(null,
                "Seleccione el departamento del empleado a eliminar:",
                "Eliminar Empleado",
                JOptionPane.PLAIN_MESSAGE,
                null,
                departamentos.stream().map(Departamento::getNombre).toArray(String[]::new),
                null);

        // Si se seleccionó un departamento
        if (departamentoNombre != null) {
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado a eliminar:"); // Solicitar ID del empleado

            // Busca el departamento correspondiente
            for (Departamento dep : departamentos) {
                if (dep.getNombre().equals(departamentoNombre)) {
                    try {
                        dep.eliminarEmpleado(idEmpleado); // Eliminar el empleado del departamento
                        areaTexto.append("Empleado eliminado con ID: " + idEmpleado + "\n"); // Mostrar mensaje en área de texto
                    } catch (GestionException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage()); // Mostrar error si ocurre
                    }
                    break; // Salir del bucle
                }
            }
        }
    }

    // Método para actualizar un empleado (no implementado)
    public static void actualizarEmpleado() {
        // Implementar la lógica para actualizar empleados aquí
        JOptionPane.showMessageDialog(null, "Funcionalidad de actualización de empleados no implementada aún.");
    }
}
