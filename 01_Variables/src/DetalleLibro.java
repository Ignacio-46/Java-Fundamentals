public class DetalleLibro {
    static void main() {
        String libro = "El señor de los anillos";
        int publicacion = 1954;
        boolean disponible = true;
        double precio = 500.50;

        System.out.println("Detalle del libro:");
        System.out.println("Libro: " + libro);
        System.out.println("Publicación: " + publicacion);
        System.out.println("Disponible: "+ disponible);
        System.out.println("Precio: $"+ precio);

        //Se modificó el título del libro
        libro = "El principito";
        System.out.println(libro);
    }
}
