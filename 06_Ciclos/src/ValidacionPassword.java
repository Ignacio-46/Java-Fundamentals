import java.util.Scanner;

public class ValidacionPassword {
    static void main() {
        System.out.println("*** Validación Password ***");
        var salir = false;

        while (!salir){
            System.out.print("Ingrese el Password (Al menos de 6 caracteres): ");
            var password = new Scanner(System.in).nextLine();

            if (password.length() >= 6) {
                System.out.println("El valor del Password es valido: " + password);
                break;
            }
            else {
                System.out.println("El password no cumple los requisitos. Debe tener al menos 6 caracteres" );
            }
        }
    }
}
