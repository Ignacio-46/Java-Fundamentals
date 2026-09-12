import java.util.Scanner;

public class PromedioCalificaciones {
    static void main() {
        System.out.println("*** Promedio de Calificaciones ***");

        //Solicita calificación
        System.out.print("Cúantas calificaciones desea agregar? ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());

        //Arreglo
        var calificaciones = new int[numero];

        //Proporciona calificación
        var total = 0;
        for (var i = 0; i < numero; i++) {
            System.out.print("Calificación[" + i + "] = ");
            calificaciones[i] = Integer.parseInt(new Scanner(System.in).nextLine());
            total += calificaciones[i];
        }

        //Promedio de calificaciones
        var promedio = total / numero;

        //Se imprime el promedio
        System.out.printf("\nPromedio de las Calificaciones: %d", promedio);
    }
}
