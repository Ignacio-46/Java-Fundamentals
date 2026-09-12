import java.util.Scanner;

public class SistemaCalificaciones {
    static void main() {
        System.out.println("*** Sistema de calificaciones ***");
        String sistema;

        //Calificación
        System.out.print("Ingrese la calificación (1-10): ");
        var calificacion = Integer.parseInt(new Scanner(System.in).nextLine());

        //Evaluación
        sistema = switch (calificacion){
            case 9,10 -> "Su calificación es 'A'";
            case 8 -> "Su calificación es 'B'";
            case 7 -> "Su calificación es 'C'";
            case 6 -> "Su calificación es 'D'";
            case 1,2,3,4,5 -> "Su calificación es 'F'";
            default -> "Valor desconocido";
        };

        //Se imprime valor
        System.out.println(sistema);
    }
}
