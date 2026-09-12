import java.util.Scanner;

public class RangoVariable {
    static void main() {
        System.out.println("*** Rango dentro de un Variable ***");
        final var MINIMO = 0;
        final var MAXIMO = 10;

        //Se solicita el número al usuario
        System.out.print("Proporciona un número de 1 a 10: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());

        //Revisamos si está afuera del rango dentro de 1 y 10
        var rango = dato < MINIMO || dato > MAXIMO;

        //Se imprime
        System.out.println("Esta afuera del rango (1-10)? " + rango);

        //Otra forma lógica a la inversa
        var dentro = dato >= MINIMO && dato <= MAXIMO;
        var afuera = !(dato >= MINIMO && dato <= MAXIMO);
        System.out.println("\n*** De forma lógica a la inversa ***");
        System.out.println("Está dentro del rango? " + dentro);
        System.out.println("Está afuera del rango? " + afuera);
    }
}
