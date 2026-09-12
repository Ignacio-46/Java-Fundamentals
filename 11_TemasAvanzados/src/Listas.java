import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    static void main() {

        System.out.println("*** Listas ***\n");

        List<String> miLista = new ArrayList<>(); // Manejo Genérico: Indica el soporte de tipo de datos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        //miLista.add("Domingo"); también recorre por duplicado

        for(Object elemento : miLista){
            System.out.println("Día de la semana: " + elemento);
        }

        // Funciones Lambda (Funcione anónima de un código muy compacto)

        System.out.println("\nCon función Lambda:");
        miLista.forEach( elemento -> {
            System.out.println("Día de la semana: " + elemento);
        });

        System.out.println("\nCon función lambda pero solo los elementos: ");
        miLista.forEach(System.out::println);

        System.out.println("\nLista de nombres: ");
        List<String> nombresLista = Arrays.asList("Matias", "Santi", "Nahuelito");
        nombresLista.forEach(System.out::println);
    }
}
