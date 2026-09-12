import java.util.Scanner;

public class ValorPositivo {
    static void main() {
        System.out.println("*** Valor Positivo ***");
        System.out.print("\nIngrese un número: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        if (numero > 0){
            System.out.println("El numero " + numero + " es positivo");
        }
        else {
            if (numero < 0){
                System.out.println("El número " + numero +  " es negativo");
            }
            else {
                System.out.println("EL numero es " + numero);
            }
        }
    }
}
