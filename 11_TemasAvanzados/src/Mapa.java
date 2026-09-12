import java.util.HashMap;
import java.util.Map;

public class Mapa {
    static void main() {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre ", " Santi");
        persona.put("Apellido ", " Mira");
        persona.put("Edad ", " 31");
        //Se imprime
        System.out.println("Valores del Mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Se modifica valores de la llave existente
        persona.put("Nombre ", " Mati");
        persona.put("Apellido ", " Torres");
        persona.put("Edad ", " 33");
        //Se imprime
        System.out.println("\nNuevo Valores del Mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Se remueve los valores
        persona.remove("Nombre ", " Mati");
        persona.remove("Apellido ", " Torres");
        //Se imprime
        System.out.println("\nSe removió Valores del Mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iteras los elementos del mapa por separado
        persona.put("Nombre ", " Nahuelito");
        persona.put("Edad ", " 37");
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((key, value) -> {
            System.out.println("Llave: " + key + ", Valor: " + value);
        });
    }
}
