import java.util.Scanner;

public class LeerTiposDatos {
    static void main() {
        //Leer distintos tipos de datos
        System.out.println("*** Tipos de Datos ***");

        //Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        //consumimos el carácter de salto de línea
        consola.nextLine();
        //Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //Conversión de datos
        //Tipo entero
        System.out.print("Proporciona un valor entero: ");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        //Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        //Double.parseDouble();

        //Tipo Booleano
        System.out.print("Conversiona un booleano: ");
        var booleano = Boolean.parseBoolean(consola.nextLine());
        System.out.println("booleano = " + booleano);
    }
}
