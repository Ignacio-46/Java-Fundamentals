import java.util.Scanner;

public class IntroducirValores {
    static void main() {
        System.out.println("*** Introducir Valores de un Arreglo ***");

        //Introducir valores y declarar un arreglo
        System.out.print("Proporciona el largo de un arreglo: ");
        var largoArreglo = Integer.parseInt(new Scanner(System.in).nextLine());

        //Creamos de manera dinámica el arreglo
        var entero = new int[largoArreglo];

        //Solicita valores del arreglo
        System.out.println("\nSolicitar los enteros: ");
        for (var i = 0; i < largoArreglo; i++) {
            System.out.print("Proporciona entero[" + i + "] = ");
            entero[i] = Integer.parseInt(new Scanner(System.in).nextLine());
        }

        //Se imprime los valores del arreglo
        System.out.println("\nImpresión del Arreglo: ");
        for (var i = 0; i < largoArreglo; i++) {
            System.out.println("Entero[" + i + "]: " + entero[i]);
        }
    }
}
