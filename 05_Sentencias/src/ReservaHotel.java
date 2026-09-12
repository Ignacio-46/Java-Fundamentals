import java.util.Scanner;

public class ReservaHotel {
    static void main() {
        System.out.println("*** Sistema de Reserva Hotel ***");

        //Nombre
        System.out.print("Nombre del cliente: ");
        var nombre = new Scanner(System.in).nextLine();

        //Días
        System.out.print("Días de estadías: ");
        var dias = Integer.parseInt(new Scanner(System.in).nextLine());

        //Habitación
        System.out.print("Con vista al mar (true/false)? ");
        var vista = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        //Cálculo
        var vistaMar = (vista == true)? dias * 190.50 : dias * 150.50;

        //Decisión
        var habitacion = (vista == true)? "Sí :)" : "No :(";

        //Valores
        System.out.printf("""
                %n-------- Detalles de la Reservación ---------
                Cliente: %s
                Días de estadía: %d
                Costo Total: $%.2f
                Habitación con vista al mar: %s
                """, nombre, dias, vistaMar, habitacion);
    }
}
