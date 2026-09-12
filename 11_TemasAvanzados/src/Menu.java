import java.util.Scanner;

public class Menu {

    static void main() {
        menu();
    }

    static void menu(){
        var salir = false;
        while (!salir) {
            try {
                mostrarMenu();
                var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
                salir = ejecutarOpciones(opcion);
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error " + e.getMessage());
            }
            finally {
                System.out.println(); // Un salto de línea por cada iteración
            }
        }
    }

    private static void mostrarMenu() {

        System.out.print(""" 
                    *** Saludos ***
                    
                    Menú:
                    1. Hola
                    2. Como estás?
                    3. Todo bien?
                    4. Salir\n
                    Seleccione una opción:\s""");
    }

    private static boolean ejecutarOpciones(int opcion) {
        var salir = false;
        switch (opcion) {
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 4 -> {
                System.out.println("Regresa Pronto!!");
                salir = true;
            }
            default -> System.out.println("Opción Incorrecta!: " + opcion);
        }
        return salir;
    }
}
