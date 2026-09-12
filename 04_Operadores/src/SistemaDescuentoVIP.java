import java.util.Scanner;

public class SistemaDescuentoVIP {
    static void main() {
        System.out.println("*** Sistema de Descuento VIP ***");
        final var MINIMO = 10;

        //Solicitar al usuario los datos
        System.out.print("Cúanto artículos compró? ");
        var articulos = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Es miembro de la tienda (true/false)? ");
        var isMembresia = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        //Verificación
        var minimo = MINIMO <= articulos;
        var isMiembro = isMembresia == true;
        var descuentoVIP = minimo && isMiembro;

        //Se imprime
        System.out.printf("""
                %nTicket del cliente
                -------------------------------
                Artículos comprado: %d
                Miembro de la tienda: %s
                Descuento VIP: %s""", articulos, isMiembro, descuentoVIP);
    }
}
