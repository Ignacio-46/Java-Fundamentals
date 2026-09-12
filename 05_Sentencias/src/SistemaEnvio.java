import java.util.Scanner;

public class SistemaEnvio {
    static void main() {
        System.out.println("*** Sistema de Envíos ***");

        //Se solicita el destino del paquete
        System.out.print("Ingresa el destino del paquete (Nacional/Internacional): ");
        var destino = new Scanner(System.in).nextLine().toLowerCase().trim();

        //Se solicita el peso del paquete
        System.out.print("Ingrese el peso del paquete (en kg): ");
        var peso = Double.parseDouble(new Scanner(System.in).nextLine());

        //Cálculo del peso
        var tarifaNacional = peso * 10;
        var tarifaInternacional = peso * 20;

        //Decisión del costo
        //var costo = (paquete.equals("nacional"))? "El costo del envío del paquete es: $ " + tarifaNacional :
        //        (paquete.equals("internacional"))? "El costo del envío del paquete es: $ " + tarifaInternacional:
        //                "Destino Inválido";

        Double costoEnvio = switch (destino){
            case "nacional" -> tarifaNacional;
            case "internacional" -> tarifaInternacional;
            default -> {
                System.out.println("Destino Invalido. Ingrese nacional o internacional.");
                yield null;
            }
        };

        //Se imprime el costo
        if (costoEnvio != null){
            System.out.printf("El costo del envío del paquete es: $%.2f", costoEnvio);
        }
    }
}
