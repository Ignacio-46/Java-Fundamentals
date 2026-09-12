import java.util.Scanner;

public class NumeroMayor {
    static void main() {
        System.out.println("*** El mayor de 2 números ***");

        //Primer número
        System.out.print("Ingrese el primer número: ");
        var numero1 = Integer.parseInt(new Scanner(System.in).nextLine());

        //Segundo número
        System.out.print("Ingrese el segundo número: ");
        var numero2 = Integer.parseInt(new Scanner(System.in).nextLine());

        //Comparación del numero mayor
        var mayor = (numero1 > numero2)? "El número 1 es mayor : " + numero1 :
                    (numero1 == numero2)? "Los números son iguales" : "El número 2 es mayor : " + numero2 ;

        //Se muestra el valor
        System.out.println(mayor);
    }
}
