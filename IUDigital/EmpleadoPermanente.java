package IUDigital;

// Clase que representa a un empleado permanente, hereda de la clase Empleado
public class EmpleadoPermanente extends Empleado {
    private double salario; // Atributo para almacenar el salario del empleado

    // Constructor de la clase EmpleadoPermanente
    public EmpleadoPermanente(String id, String nombre, String apellido, double salario) {
        super(id, nombre, apellido); // Llamar al constructor de la clase base (Empleado)
        this.salario = salario; // Inicializar el salario
    }

    // Método para obtener el salario del empleado
    public double getSalario() {
        return salario; // Retorna el salario
    }

    // Método para representar al empleado como una cadena de texto
    @Override
    public String toString() {
        // Llama al método toString de la clase base y añade información específica
        return super.toString() + String.format("Salario: %.2f\nTipo de empleado: Permanente\n", salario);
    }
}
