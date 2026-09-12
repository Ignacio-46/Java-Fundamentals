public class TiendaLinea {
    static void main() {

        // Ejercicio Tienda Línea
        System.out.println("*** Tienda en Linea (Detalle de Producto) *** ");
        String nombreProducto = "Joystick";
        double precioProducto = 500.50;
        int cantidadDisponible = 5;
        boolean isDisponible = true;

        // Se imprime el detalle
        System.out.println("nombre Producto = " + nombreProducto);
        System.out.println("precio Producto = $" + precioProducto);
        System.out.println("cantidad Disponible = " + cantidadDisponible);
        System.out.println("Disponible = " + isDisponible);

        // Se modificó las varibles
        System.out.println("\nProducto modificado: ");
        nombreProducto = "Parlantes";
        precioProducto = 1000.50;
        cantidadDisponible = 10;
        isDisponible = false;

        // Se imprime el datalle modificado
        System.out.println("Cantidad Disponible = " + cantidadDisponible);
        System.out.println("Precio Producto = $" + precioProducto);
        System.out.println("Nombre Producto = " + nombreProducto);
        System.out.println("Disponible = " + isDisponible);
    }
}
