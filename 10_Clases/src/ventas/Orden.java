package ventas;

public class Orden {

    // Atributos
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    // Constructor VACIO
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    // metodo de agregar productos
    public void agregarProducto(Producto producto) {
        if (contadorOrdenes < MAX_PRODUCTOS) {
            this.productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo del producto: " + Orden.MAX_PRODUCTOS);
        }
    }

    // Metodo de calculo total de los precios de los productos
    public double calcularTotal() {
        double total = 0;
        for (var i = 0; i < this.contadorProductos; i++) {
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    // Metodo de mostrar la Orden
    public void mostrarOrden() {
        System.out.println("ID orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la Orden: $" + totalOrden);
        System.out.println("\tProductos de la Orden: ");
        for (var i = 0; i < this.contadorProductos; i++) {
            System.out.println("\t\t" + this.productos[i]);
        }
    }

    // Se sobreescribió la Orden con el metodo ToString
    @Override
    public String toString() {
        var resultado = "ID orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la Orden: $" + totalOrden + "\n";
        resultado += "\tProductos de la Orden: " + "\n";
        for (var i = 0; i < this.contadorProductos; i++) {
            resultado += "\t\t" + this.productos[i] + "\n";
        }
        return resultado;
    }
}