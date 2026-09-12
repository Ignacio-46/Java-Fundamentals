import java.util.Scanner;

public class AdministracionCuentas {
    static void main() {
        //Ejercicio del menú iterativo
        //Variable
        var True = true;

        //Menú Iterativo
        while (True) {
            System.out.println("""
                    *** Sistema de Administración de Cuentas ***
                    \nMenú:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir""");

            //Solicitar el número del menú
            System.out.print("\nSeleccione una opción:\s ");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            //Condición de las opciones
            if (opcion == 1){
                System.out.println("Creando tu cuenta...");
            }
            else if (opcion == 2){
                System.out.println("Eliminando tu cuenta...");
            }
            else if (opcion == 3) {
                System.out.println("Saliendo del sistema");
                System.out.println("\nSaliendo Sistema de Administración de Cuentas");
                True = false;
            }
            else {
                System.out.println("Número Invalido");
            }
        }
    }
}
