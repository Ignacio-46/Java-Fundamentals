import java.util.TreeSet;
import java.util.Set;

public class Sets {
    static void main() {
        System.out.println("*** Sets ***");

        Set<String> conjunto = new TreeSet<>(); // Mantiene el orden de los elementos
        conjunto.add("Matías");
        conjunto.add("Matías"); // No permite elementos duplicado
        conjunto.add("Nahuelito");
        conjunto.add("Santi");

        System.out.println("Elementos del set: ");
        conjunto.forEach(System.out::println);

        // Remover un elemento
        System.out.println("\nNuevos elementos del set: ");
        conjunto.remove("Santi");
        conjunto.forEach(System.out::println);
    }
}
