package IUDigital;

// Clase personalizada de excepción para la gestión de empleados
public class GestionException extends Exception {
    // Constructor de la clase GestionException
    public GestionException(String message) {
        super(message); // Llama al constructor de la clase base (Exception) con el mensaje proporcionado
    }
}
