package IUDigital;

// Clase que representa un empleado
public class Empleado {
    private String id; // Atributo para almacenar el ID del empleado
    private String nombre; // Atributo para almacenar el nombre del empleado
    private String apellido; // Atributo para almacenar el apellido del empleado

    // Constructor de la clase Empleado
    public Empleado(String id, String nombre, String apellido) {
        this.id = id; // Inicializa el ID del empleado
        this.nombre = nombre; // Inicializa el nombre del empleado
        this.apellido = apellido; // Inicializa el apellido del empleado
    }

    // Método para obtener el ID del empleado
    public String getId() {
        return id; // Retorna el ID
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Método para obtener el apellido del empleado
    public String getApellido() {
        return apellido; // Retorna el apellido
    }

    // Método para establecer un nuevo nombre para el empleado
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualiza el nombre
    }

    // Método para establecer un nuevo apellido para el empleado
    public void setApellido(String apellido) {
        this.apellido = apellido; // Actualiza el apellido
    }

    // Método para representar al empleado como una cadena de texto
    @Override
    public String toString() {
        // Formatea y retorna la información del empleado
        return String.format("ID: %s\nNombre: %s %s\n", id, nombre, apellido);
    }
}
