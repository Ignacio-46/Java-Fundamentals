import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    static void main() {
        System.out.println("*** Sistema de Generador de ID Único ***");
        //Input
        var consola = new Scanner(System.in);
        //Número aleatorio
        var random = new Random();

        //Datos del usuario
        System.out.print("Ingrese su nombre: ");
        var nombre1 = consola.nextLine();
        var nombre2 = nombre1.substring(0,2).toUpperCase().trim();
        System.out.print("Ingrese su apellido: ");
        var apellido = consola.nextLine().substring(0,2).toUpperCase().trim();
        System.out.print("Fecha de nacimiento: ");
        var nacimiento = consola.nextLine().substring(2);

        //Número aleatorio del 1 hasta 9999
        var numeroAleatorio = random.nextInt(9999) + 1;

        //Se genera el ID único
        System.out.printf("""
                ----------------------------------------------------------------
                Hola %s,
                \tTu número de identificación (ID) generado por el sistema es: \n%s%s%s%04d
                Felicidades!!""", nombre1, nombre2, apellido, nacimiento, numeroAleatorio);
    }
}
