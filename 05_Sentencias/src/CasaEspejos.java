import java.util.Scanner;

public class CasaEspejos {
    static void main() {
        //Ejercicio casa de los espejos
        System.out.println("*** Casa de los espejos ***");

        //Variable declarada
        final var MINIMO = 10;

        //Se solicita al usuario su edad
        System.out.print("Cúantos años tenés? ");
        var edad = Integer.parseInt(new Scanner(System.in).nextLine());

        //Se solicita si tiene miedo
        System.out.print("Tienes miedo a la oscuridad (true/false)? ");
        var oscuridad = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        //if - else con lógica NOT(!)
        if (edad > MINIMO && !oscuridad){
            System.out.println("Ingresa a la casa de los espejos!!");
        }
        else {
            System.out.println("No puede ingresa a la casa");
        }
    }
}
