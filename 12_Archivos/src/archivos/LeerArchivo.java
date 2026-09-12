package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    static void main() {
        // Leer un archivo
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido de Archivo: ");
            // Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo)); // Lee el archivo
            // Leemos línea a línea el archivo
            var linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                // Antes de terminar el ciclo, nos movemos en la siguiente línea
                linea = entrada.readLine();
            }
            entrada.close();
        }
        catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
