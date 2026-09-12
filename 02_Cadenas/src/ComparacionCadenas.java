public class ComparacionCadenas {
    static void main() {
        System.out.println("*** Comparación de Cadenas (pool de cadenas) ***");
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparación de cadenas (==) comparar la referencia
        System.out.print("cadena1 es igual en referencia en cadena2: ");
        System.out.println(cadena1 == cadena2);

        //Comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia en cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Comparamos contenido con el metodo equals
        System.out.print("cadena1 es igual de contenido en cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
