public class TipoVar {
    static void main() {
        // sin uso del var
        System.out.println("*** Uso de var en Java ***");
        String nombre1 = "Santi";
        System.out.println("1° nombre = " + nombre1);

        // con var
        var nombre2 = "Matias";
        System.out.println("2° nombre = " + nombre2);

        // Definir otras variables usando
        var edad = 34; // se infiere tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // se infiere tipo flotante
        var esCasado = true; // se infiere tipo booleano
        esCasado = false;
        // esCasado = "No"; no se puede asignar a un tipo distinto

        // Se debe definir su valor
        var precio = 5.5; // forma correcta
        System.out.println("precio = " + precio);
        // var precio;
        //precio = 10; esto lanza un error, tenemos que asignar su valor en una sola línea

        // se debe poder interferir el tipo de dato
        // var apellido = null; no se puede interferir el tipo de dato
        // se tiene que asignar su valor para que funcione correctamente porque "null" no lo toma como objeto
    }
}
