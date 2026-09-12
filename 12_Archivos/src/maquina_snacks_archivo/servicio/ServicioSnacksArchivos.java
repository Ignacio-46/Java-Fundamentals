package maquina_snacks_archivo.servicio;

import maquina_snacks_archivo.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    //Nombre del archivo
    private final String NOMBRE_ARCHIVO = "snacks.txt";

    //Crea la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    //Constructor vacío
    public ServicioSnacksArchivos() {
        //Creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe) {
                this.snacks = obtenerSnacks();
            }
            else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); //Guarda el archivo en disco
                System.out.println("Se ha producido un archivo exitosamente");
            }
        }
        catch (Exception e) {
            System.out.println("Error al crear el archivo " + e.getMessage());
        }
        //Si no existe, cargamos algunos snacks iniciales
        if (!existe) {
            CargaSnacksIniciales();
        }
    }

    private void CargaSnacksIniciales() {
        this.agregarSnacks(new Snack("Papas", 70.0));
        this.agregarSnacks(new Snack("Refresco", 50.0));
        this.agregarSnacks(new Snack("Sandwich", 120.0));
    }

    private List<Snack> obtenerSnacks() {
        var snacks = new ArrayList<Snack>();
        try{
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String[] lineaSnack = linea.split("-"); //Parseo separado por un guion
                var idSnack = lineaSnack[0]; //No se usa
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack); //Agregamos el snack leído a la lista
            }
        }
        catch (Exception e){
            System.out.println("Error al leer el archivo de snacks " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnacks(Snack snack) {
        // Se agrega el nuevo snack
        //1. Se guarda en la lista en memoria
        this.snacks.add(snack);

        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnacksArchivo(snack);
    }

    private void agregarSnacksArchivo(Snack snack) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close(); //Se inscribe la información en el archivo
        }
        catch (Exception e) {
            System.out.println("Error al agregar snack " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("---- Snacks en el inventario -----");
        //Mostramos la lista de snacks en el archivo
        var inventario = "";
        for (Snack snack : this.snacks) {
            inventario += snack.toString() + "\n";
        }
        System.out.println(inventario);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
