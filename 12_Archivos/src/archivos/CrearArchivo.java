package archivos;

import java.io.File; //input - output
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CrearArchivo {

    static void main() {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println(nombreArchivo + " ya existe");
            }
            else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo)); //Crea el archivo
                //Se guarda el archivo a disco duro
                salida.close();
                System.out.println("Se ha creado el archivo: " + nombreArchivo);
            }
        }
        catch (IOException e) {
            System.out.println("Error al crear el archivo " + e.getMessage());
            e.printStackTrace(); // Muestra los detalles de los errores del archivo
        }
    }
}
