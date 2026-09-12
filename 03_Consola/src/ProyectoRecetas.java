import java.util.Scanner;

public class ProyectoRecetas {
    static void main() {
        //Ejercicio de Recetas
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        //Nombre de la receta
        System.out.print("Ingresa el nombre: ");
        var nombre = consola.nextLine();

        //Ingredientes
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();

        //Tiempo de Preparación
        System.out.print("Ingresa el tiempo de Preparación (min): ");
        var preparacion = Integer.parseInt(consola.nextLine());

        //Dificultad
        System.out.print("Ingresa la dificultad (Facil/Medio/Dificil): ");
        var dificultad = consola.nextLine();

        //Se imprime
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre de Receta: " + nombre);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de Preparación = " + preparacion + " minutos");
        System.out.println("\tDificultad = " + dificultad);
    }
}
