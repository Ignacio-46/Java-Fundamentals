package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarArchivo {

    static void main() {
        boolean anexar = false;

        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            //Revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "nuevo\ncontenido";
            salida.println(nuevoContenido);
            //Guardamos información en el archivo
            salida.close();
            System.out.println("Se agregó contenido al archivo...");
        }
        catch (Exception e) {
            System.out.println("Error al escribir al archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
