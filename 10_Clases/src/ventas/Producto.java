package ventas;

// Clase Herencia
public class Producto {

    // Atributos
    private String nombre;
    private Double precio;
    private final int idProducto;
    private static int contadorProductos = 0;

    // Constructor
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProductos;
    }

    // Metodos getters y setters
    // Nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Precio
    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    // Id Producto
    public int getIdProducto() {
        return this.idProducto;
    }

    // Sobreescritura
    @Override
    public String toString() {
        return "Producto {" +
                "Nombre = '" + this.nombre + '\'' +
                ", Precio = $" + this.precio +
                ", IdProducto = " + this.idProducto +
                '}';
    }
}
