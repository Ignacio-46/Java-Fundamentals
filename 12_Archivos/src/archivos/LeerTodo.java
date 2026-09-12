package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    static void main() {
        var nombreArchivo = "mi_archivo.txt";
        try {
            // Leer todas las líneas de archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo)); // Indica la ruta del archivo a la cual queremos leer
            for (String linea : lineas){
                System.out.println(linea);
            }
            System.out.println();
            //Más simplificado
            lineas.forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace(); // Imprime al detalle
        }
    }
}
