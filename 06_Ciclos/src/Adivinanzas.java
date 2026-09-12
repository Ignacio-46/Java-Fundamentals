import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    static void main() {
        System.out.println("*** Juego de Adivinanzas ***");
        var salir = false;
        var contador1 = 1;
        var contador2 = 9;
        var random = new Random();
        var numeroAleatorio = random.nextInt(50) + 1;

        while (!salir) {
            System.out.print("Ingrese un número (1-50): ");
            var numero = Integer.parseInt(new Scanner(System.in).nextLine());

            System.out.println("Intentos: " + contador1 +". Te queda " + contador2 + " intentos.");
            contador2 -= 1;

            if (numero == numeroAleatorio) {
                    System.out.println("Felicidades!! ganaste!! el número es: " + numero);
                    break;
            }
            else if (contador1 == 10){
                System.out.println("Fallaste!! El numero secreto es '" + numeroAleatorio+ "' ¡¡Fin del juego!!");
                break;
            }
            else if (numero >= numeroAleatorio) {
                    System.out.println("Cerca, cerca.....El número secreto es menor!!");
                contador1 += 1;
            }
            else if (numero <= numeroAleatorio){
                    System.out.println("Cerca, cerca.....El número secreto es mayor!!");
                contador1 += 1;
            }
        }
    }
}
