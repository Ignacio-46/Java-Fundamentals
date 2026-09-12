import java.util.Scanner;

public class SistemaPrestamoLibros {
    static void main() {
        System.out.println("*** Sistema de Préstamos de Libros ***");
        var zona = 3;

        //Solicita los datos al usuario
        System.out.print("Tiene credencial de la biblioteca (true/false)? ");
        var credencial = Boolean.parseBoolean(new Scanner(System.in).nextLine());
        System.out.print("Vive a no más de 3km? ");
        var redonda = Integer.parseInt(new Scanner(System.in).nextLine());

        //Se verifica los datos
        var isCredencial = credencial == true;
        var isVive = zona >= redonda;
        var prestarLibro = isCredencial || isVive;

        //Se imprime
        System.out.printf("""
                %nPréstamos de Libro
                -------------------------------
                Credencial del Estudiante: %s
                Distancia del Lugar; %s
                Se prestó Libro: %s""", isCredencial, isVive, prestarLibro);
    }
}
