import java.util.Scanner;

public class ValorDentroRango {
    static void main() {
        System.out.println("*** Valor dentro del Rango ***");
        //Definimos los límites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        //Pedir el número al usuario entre 0 y 5
        System.out.print("Solicita un número (0-5): ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());

        //Verificar si está dentro del Rango
        var dentroDelRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Está dentro del Rango? " + dentroDelRango);
    }
}
