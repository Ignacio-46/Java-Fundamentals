import java.util.Scanner;

public class DiaSemana {
    static void main() {
        //Aplicamos día de la semana con sentencia switch
        System.out.println("*** Dia de la semana ***");

        //Día
        System.out.print("Ingrese el dia de la semana (1-7): ");
        var dia = Integer.parseInt(new Scanner(System.in).nextLine());
        String diaSemana;

        //Aplicamos los días con Switch mejorado
        diaSemana = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día Invalido";
        };

        //Se muestra el valor del día
        System.out.println(diaSemana);
    }
}
