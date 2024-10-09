package IUDigital;

// Clase que representa a un empleado temporal, hereda de la clase Empleado
public class EmpleadoTemporal extends Empleado {
    private int duracionContrato; // Atributo para almacenar la duración del contrato en meses

    // Constructor de la clase EmpleadoTemporal
    public EmpleadoTemporal(String id, String nombre, String apellido, int duracionContrato) {
        super(id, nombre, apellido); // Llama al constructor de la clase base (Empleado)
        this.duracionContrato = duracionContrato; // Inicializa la duración del contrato
    }

    // Método para obtener la duración del contrato
    public int getDuracionContrato() {
        return duracionContrato; // Retorna la duración del contrato
    }

    // Método para representar al empleado como una cadena de texto
    @Override
    public String toString() {
        // Llama al método toString de la clase base y añade información específica
        return super.toString() + String.format("Duración del contrato: %d meses\nTipo de empleado: Temporal\n", duracionContrato);
    }
}
