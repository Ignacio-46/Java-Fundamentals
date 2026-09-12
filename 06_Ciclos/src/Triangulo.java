import java.util.Scanner;

public class Triangulo {
    static void main() {
        System.out.println("*** Triangulo ***");

        System.out.print("Proporciona el número de filas (hasta 10): ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());

        //Iteramos sobre cada fila del tríangulo
        for (var fila = 1; fila <= numero; fila++){
            var espacios = " ".repeat(numero - fila);
            var  asterisco = "*".repeat(2 * fila - 1);
            System.out.println(espacios + asterisco);
        }
    }
}
