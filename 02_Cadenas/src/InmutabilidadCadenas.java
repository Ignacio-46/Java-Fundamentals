public class InmutabilidadCadenas {
    static void main() {
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1; // de esta forma no se elimina en memoria el valor de variable de la cadena1
        cadena1 = "Adios"; // se modificó su valor
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
