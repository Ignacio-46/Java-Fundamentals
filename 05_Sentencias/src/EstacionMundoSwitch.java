import java.util.Scanner;

public class EstacionMundoSwitch {
    static void main() {
        //Ejercicio de estación de año con switch
        System.out.println("*** Estación del Año ***");
        String estacion;

        //Dia
        System.out.print("Ingrese el mes del año (1-12): ");
        var mes = Integer.parseInt(new Scanner(System.in).nextLine());

        //Aplicamos la estacion con switch
        estacion = switch (mes) {
            case 1,2,12 -> "La estación para el mes " + mes + " es Verano";
            case 3,4,5 -> "La estación para el mes " + mes + " es Otoño";
            case 6,7,8 -> "La estación para el mes " + mes + " es Invierno";
            case 9,10,11 -> "La estación para el mes " + mes + " es Primavera";
            default -> "Estación Desconocida";
        };

        //Se imprime el valor
        System.out.println(estacion);
    }
}
