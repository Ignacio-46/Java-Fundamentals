import java.util.Scanner;

public class SentenciaSWITCH {
    static void main() {
        //Aplicamos día de la semana con sentencia switch
        System.out.println("*** Dia de la semana ***");

        //Día
        System.out.print("Ingrese el dia de la sema (1-7): ");
        var dia = Integer.parseInt(new Scanner(System.in).nextLine());

        //Aplicamos los días con Switch
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día Invalido");
                break;
        }
    }
}
