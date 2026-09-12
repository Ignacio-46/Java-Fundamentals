import java.util.Scanner;

public class ManejoConsola {
    static void main() {
        //Introducir valores por consola
        System.out.println("*** Valores por Consola ***");
        var consola = new Scanner(System.in); // in - input - entrada de datos
        System.out.print("Escribe tu Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
