import java.util.Scanner;

public class TicketVenta {
    static void main() {
        System.out.println("*** Ticket Venta ***");

        //Nombre del producto
        System.out.print("Ingrese el producto: ");
        var producto = new Scanner(System.in).nextLine();
        //Precio del producto (decimal)
        System.out.print("Ingrese el precio: ");
        var precio = Double.parseDouble(new Scanner(System.in).nextLine());
        //Impuesto de 10%
        var impuesto = precio * 0.10;
        //Solicitar el Descuento
        System.out.print("Aplicar algún descuento (%)? ");
        var subdescuento = Integer.parseInt(new Scanner(System.in).nextLine());
        var descuento = precio * (subdescuento / 100.0);
        //Total
        var total = precio + impuesto - descuento;

        //Se imprime el ticket Venta
        System.out.printf("""
                %nTicket Venta
                ----------------------------------
                Producto: %s
                Precio: $%.2f
                Impuesto(10%%): $%.2f
                Descuento(%d%%): $%.2f
                ----------------------------------
                Total: $%.2f
                """, producto, precio, impuesto, subdescuento, descuento, total);
    }
}
