import java.util.Scanner;

public class Calculadora {
    static void main() {

        double valor1 = 0, valor2 = 0, resultado;
        var True = true;

        while (True) {
            System.out.println("""
                    *** Cálculadora en Java ***
                    \nMenú:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);

            System.out.print("Seleccione una opción: ");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            if (opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                valor1 = Double.parseDouble(new Scanner(System.in).nextLine());

                System.out.print("Dame el valor 2: ");
                valor2 = Double.parseDouble(new Scanner(System.in).nextLine());
            }

            switch (opcion){
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("La suma es: %.2f\n", resultado);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("La resta es: %.2f\n", resultado);
                }
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("La multiplicación es: %.2f\n", resultado);
                }
                case 4 -> {
                    resultado = valor1 / valor2;
                    if (valor2 == 0){
                        System.out.print("Error. No es posible dividir por cero.\n");
                    }
                    else {
                        System.out.printf("La división es: %.2f\n", resultado);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del Programa Cálculadora!!!");
                    True = false;
                }
                default -> System.out.println("Opción Invalida: " + opcion);
            }
        }
    }
}
