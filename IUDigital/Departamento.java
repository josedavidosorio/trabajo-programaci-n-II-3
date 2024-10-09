package IUDigital;

import java.util.ArrayList;
import java.util.List;

// Clase que representa un departamento en la gestión de empleados
public class Departamento {
    private String id; // Atributo para almacenar el ID del departamento
    private String nombre; // Atributo para almacenar el nombre del departamento
    private int capacidadMaxima; // Atributo para almacenar la capacidad máxima de empleados
    private List<Empleado> empleados; // Lista para almacenar los empleados del departamento

    // Constructor de la clase Departamento
    public Departamento(String id, String nombre, int capacidadMaxima) {
        this.id = id; // Inicializa el ID del departamento
        this.nombre = nombre; // Inicializa el nombre del departamento
        this.capacidadMaxima = capacidadMaxima; // Inicializa la capacidad máxima
        this.empleados = new ArrayList<>(); // Inicializa la lista de empleados
    }

    // Método para obtener el ID del departamento
    public String getId() {
        return id; // Retorna el ID
    }

    // Método para obtener el nombre del departamento
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Método para obtener la capacidad máxima de empleados
    public int getCapacidadMaxima() {
        return capacidadMaxima; // Retorna la capacidad máxima
    }

    // Método para establecer un nuevo nombre para el departamento
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualiza el nombre
    }

    // Método para establecer una nueva capacidad máxima para el departamento
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima; // Actualiza la capacidad máxima
    }

    // Método para agregar un empleado al departamento
    public void agregarEmpleado(Empleado empleado) throws GestionException {
        // Verifica si se ha alcanzado la capacidad máxima
        if (empleados.size() >= capacidadMaxima) {
            throw new GestionException("Capacidad máxima alcanzada. No se puede agregar más empleados."); // Lanza excepción si la capacidad está llena
        }
        empleados.add(empleado); // Agrega el empleado a la lista
    }

    // Método para eliminar un empleado del departamento por su ID
    public void eliminarEmpleado(String id) throws GestionException {
        boolean encontrado = false; // Variable para verificar si se encontró el empleado
        for (Empleado empleado : empleados) {
            // Busca el empleado por su ID
            if (empleado.getId().equals(id)) {
                empleados.remove(empleado); // Elimina el empleado de la lista
                encontrado = true; // Marca que se encontró el empleado
                break; // Sale del bucle
            }
        }
        // Si no se encontró el empleado, lanza una excepción
        if (!encontrado) {
            throw new GestionException("Empleado con ID " + id + " no encontrado.");
        }
    }

    // Método para obtener la lista de empleados del departamento
    public List<Empleado> getEmpleados() {
        return empleados; // Retorna la lista de empleados
    }
}
