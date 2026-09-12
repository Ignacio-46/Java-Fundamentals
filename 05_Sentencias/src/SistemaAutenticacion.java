import java.util.Scanner;

public class SistemaAutenticacion {
    static void main() {
        //Titulo
        System.out.println("*** Sistema de Autenticación ***");

        //Variables constantes
        final var USUARIO = "admin";
        final var PASSWORD = "123";

        //Usuario
        System.out.print("Ingrese el usuario: ");
        var usuario = new Scanner(System.in).nextLine();

        //Password
        System.out.print("Ingrese el password: ");
        var password = new Scanner(System.in).nextLine();

        //Comparación
        var autenticacion = switch (usuario){
            case USUARIO -> {
                if (password.equals(PASSWORD))
                    yield "Bienvenido al Sistema!!";
                else
                    yield "Password Incorrecto";
            }
            default -> {
                if (password.equals(PASSWORD))
                    yield "Usuario Incorrecto";
                else
                    yield "Usuario y Password Incorrectos";
            }
        };

        //Se imprime
        System.out.println(autenticacion);
    }
}
