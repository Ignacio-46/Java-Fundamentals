import java.util.Scanner;

public class SistemaAutenticacion {
    static void main() {
        System.out.println("*** Sistema de Autenticación ***");
        final var usuario = "admin";
        final var password = "123";

        //Solicita el nombre del usuario
        System.out.print("Cúal es tu usuario? ");
        var usuarioOriginal = new Scanner(System.in).nextLine();

        //Solicita el password del usuario
        System.out.print("Cúal es tu password? ");
        var passwordOriginal = new Scanner(System.in).nextLine();

        //Comparar si son verdaderos con 'equals'
        var datos = usuario.equals(usuarioOriginal) && password.equals(passwordOriginal);
        System.out.println("Los datos son correctos? " + datos);
    }
}
