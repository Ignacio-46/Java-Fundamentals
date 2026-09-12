import java.util.Scanner;

public class NumeroPar {

    static boolean esPar (int numero) { //Esto es una funcion que tiene una decisión
        return  (numero % 2 == 0) ? true : false; //operador ternario
    }
    static void main() {
        System.out.println("*** Números Pares ***");

        //Se solicita el número par
        System.out.print("proporciona un valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());

        //se llama la función y se imprime
        System.out.println("El número es Par? " + esPar(numero));
    }
}
