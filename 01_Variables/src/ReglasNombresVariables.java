public class ReglasNombresVariables {
    static void main() {
        // reglas nombres variables
        String nombreCompleto = "Ignacio Roldán"; // correcto y buena práctica
        System.out.println("Nombre completo = " + nombreCompleto);
        String NombreCompleto = "Matias Torres"; // correcto, pero no es bueno para la práctica
        System.out.println("Nombre Completo = " + NombreCompleto);
        // String nombre-cliente = "Nahuelito"; // Incorrecto
        String nombre_cliente = "Santi"; //correcto, no aplica buenas prácticas
        String _apellido = "Roldán"; // Correcto y aceptable
        String $apellido = "Roldán"; // Correcto y aceptable
        int totPsz = 10; // correcto, no aplica buenas prácticas
        int totalPiezas = 10; // correcto, y buena práctica
        boolean casado = true; // correcto, aún puede mejorar
        boolean esCasado = true; // correcto y buena práctica
        boolean isCasado = true; // correcto y buena práctica
        boolean tieneSaldo = true; // correcto y buena práctica
        boolean hasSaldo = true; // correcto y buena práctica
    }
}
