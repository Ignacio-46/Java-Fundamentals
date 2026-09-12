import java.util.Scanner;

public class CajeroAutomatico {
    static void main() {

        //Variables
        var True = true;
        var saldoActual = 1000.00;

        //Menú iterativo
        while (True){
            System.out.println("""
                    \n*** Aplicación de Cajero Automático ***
                    \nMenú:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir""");

            //Solicitar opción
            System.out.print("\nSeleccione una opción: ");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            //Aplicar opción con switch
            switch (opcion){
                case 1:
                    //Saldo actual
                    System.out.printf("Tu saldo actual es: $%.2f\n", saldoActual);
                    break;
                case 2:
                    //Retirar monto
                    System.out.print("Ingrese el monto a retirar: ");
                    var retiro = Double.parseDouble(new Scanner(System.in).nextLine());
                    if (retiro < saldoActual) {
                        saldoActual -= retiro;
                        System.out.printf("Tu saldo actual es: $%.2f\n", saldoActual);
                        break;
                    }
                    else{
                        System.out.printf("No cuentas con saldo suficiente.Tu saldo actual es: $%.2f\n", saldoActual);
                        break;
                    }
                case 3:
                    //Depositar
                    System.out.print("Ingrese el monto a depositar: ");
                    var depositar = Double.parseDouble(new Scanner(System.in).nextLine());
                    saldoActual += depositar;
                    System.out.printf("Tu nuevo saldo es: $%.2f\n", saldoActual);
                    break;
                case 4:
                    //Salir
                    System.out.println("Saliendo del Cajero Automático!!");
                    True = false;
                    break;
                    //Opción Invalida
                default: System.out.println("Opción Invalida");
                    break;
            }
        }
    }
}
