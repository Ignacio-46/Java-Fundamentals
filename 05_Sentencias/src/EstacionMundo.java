import java.util.Scanner;

public class EstacionMundo {
    static void main() {
        System.out.println("*** Estación del Año ***");

        //Mes del año
        System.out.print("Ingrese el mes del año (1-12): ");
        var mes = Integer.parseInt(new Scanner(System.in).nextLine());

        //Invierno
        var invierno = (mes >= 1 && mes <= 2 || mes == 12);
        //Primavera
        var primavera = (mes >= 3 && mes <= 5);
        //Verano
        var verano = (mes >= 6 && mes <= 8);
        //Otoño
        var otonio = (mes >= 9 && mes <= 11);

        //Comparación
        var estacion =
                (invierno)? "La estación para el mes " + mes + " es Invierno" :
                    (primavera)? "La estación para el mes " + mes + " es Primavera" :
                        (verano)? "La estación para el mes " + mes + " es Verano" :
                                (otonio)? "La estación para el mes " + mes + " es Otoño" : "Estación Desconocida";

        //Se imprime estación
        System.out.println(estacion);
    }
}

