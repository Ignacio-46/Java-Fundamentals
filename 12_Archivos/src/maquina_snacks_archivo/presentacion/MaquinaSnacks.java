package maquina_snacks_archivo.presentacion;

import maquina_snacks_archivo.servicio.IServicioSnacks;
import maquina_snacks_archivo.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivo.servicio.ServicioSnacksLista;
import maquina_snacks_archivo.dominio.Snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    static void main() {
        maquinaSnacks();
    }

    static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);

        //Creamos el objeto para obtener servicio de snacks (lista)
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        List<Snack> productos = new ArrayList<>();

        System.out.println("**** Maquina de snacks ***");
        servicioSnacks .mostrarSnacks(); // Muestra el inventario de snack disponible
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error " + e.getMessage());
            }
            finally {
                System.out.println(); // Un salto de línea por cada iteración
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                    Menú:
                    1. Comprar Snack
                    2. Mostrar Ticket
                    3. Agregar nuevo Snack
                    4. Inventario Snacks
                    5. Salir\n
                    Seleccione una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks) {
        System.out.print("Que Snack quieres comprar (id)? ");
        var id_snack = Integer.parseInt(consola.nextLine());
        // Validar el snack que exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack : servicioSnacks.getSnacks()){
            if(id_snack == snack.getId_snack()) {
                //Agregamos el snack a lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado exitosamente: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + id_snack);
        }
    }

    private static void mostrarTicket(List<Snack> productos) {
        var tickect = "*** Ticket de Ventas ***";
        var total = 0.0;
        for (var producto : productos) {
            tickect += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        tickect += "\n\tTotal -> $" + total;
        System.out.println(tickect);
    }

    private static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks) {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = consola.nextDouble();
        consola.nextLine();
        servicioSnacks .agregarSnacks(new Snack(nombre, precio));
        System.out.println("Tu snack agregado exitosamente\n");
        servicioSnacks .mostrarSnacks();
    }

    private static void listarInventarioSnacks(Scanner consola, IServicioSnacks servicioSnacks) {
        servicioSnacks.mostrarSnacks();
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks) { //Se llama a la interface y se pasa como parametro
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola, servicioSnacks);
            case 4 -> listarInventarioSnacks(consola, servicioSnacks);
            case 5 -> {
                System.out.println("Regresa Pronto!!");
                salir = true;
            }
            default -> System.out.println("Opción Incorrecta!: " + opcion);
        }
        return salir;
    }
}

