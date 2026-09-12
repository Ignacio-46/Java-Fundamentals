package ventas;

public class PruebaVentas {
    static void main() {
        System.out.println("*** Sistema de Ventas ***");

        // Creación de objeto de la clase Producto
        System.out.println("Clase Producto: ");
        var producto1 = new Producto("Blusa", 30.00);
        System.out.println("ID: " + producto1.getIdProducto());
        System.out.println(producto1);

        var producto2 = new Producto("Zapato", 50.00);
        System.out.println("ID: " + producto2.getIdProducto());
        System.out.println(producto2);
        System.out.println();

        // Creación de objeto para la clase Orden
        // Primer Orden
        System.out.println("Clase Orden 1: ");
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Segundo Orden
        System.out.println("\nClase Orden 2: ");
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 15.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();

        System.out.println("\nCon el método ToSTring: ");
        System.out.println(orden1);
        System.out.println(orden2);
    }
}
