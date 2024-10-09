package IUDigital;

// Clase que representa un reporte de desempeño para un empleado
public class ReporteDesempenio {
    private Empleado empleado; // Atributo para almacenar el empleado asociado al reporte
    private String evaluacion; // Atributo para almacenar la evaluación del desempeño
    private String comentarios; // Atributo para almacenar comentarios adicionales

    // Constructor de la clase ReporteDesempenio
    public ReporteDesempenio(Empleado empleado, String evaluacion, String comentarios) {
        this.empleado = empleado; // Inicializa el empleado
        this.evaluacion = evaluacion; // Inicializa la evaluación
        this.comentarios = comentarios; // Inicializa los comentarios
    }

    // Método para obtener el empleado asociado al reporte
    public Empleado getEmpleado() {
        return empleado; // Retorna el empleado
    }

    // Método para obtener la evaluación del desempeño
    public String getEvaluacion() {
        return evaluacion; // Retorna la evaluación
    }

    // Método para obtener los comentarios adicionales
    public String getComentarios() {
        return comentarios; // Retorna los comentarios
    }

    // Método para representar el reporte como una cadena de texto
    @Override
    public String toString() {
        // Formatea y retorna la información del reporte de desempeño
        return String.format(
                "------------------------------------\n" +
                "Reporte de Desempeño del Empleado:\n" +
                "Nombre: %s %s\n" +
                "ID: %s\n" +
                "Evaluación: %s\n" +
                "Comentarios: %s\n" +
                "------------------------------------\n",
                empleado.getNombre(), // Nombre del empleado
                empleado.getApellido(), // Apellido del empleado
                empleado.getId(), // ID del empleado
                evaluacion, // Evaluación del desempeño
                comentarios // Comentarios adicionales
        );
    }
}
