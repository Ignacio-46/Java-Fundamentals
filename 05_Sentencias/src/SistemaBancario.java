import java.util.Scanner;

public class SistemaBancario {
    static void main() {
        //Ejercicio Sistema Bancario
        System.out.println("*** Sistema Bancario ***");

        //Solicitamos si quiere continuar dentro del sistema
        System.out.print("desea salir del sistema (true/false)? ");
        var deseo = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        //Decisión if - else con lógica NOT(!)
        if (!deseo){
            System.out.println("Continuamos dentro del sistema");
        }
        else {
            System.out.println("Saliendo del sistema");
        }
    }
}
