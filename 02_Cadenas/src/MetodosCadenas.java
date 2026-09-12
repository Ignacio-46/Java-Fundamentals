public class MetodosCadenas {
    static void main() {
        System.out.println("*** Metodos de Cadenas ***");
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Obtener nuevo carácter de una cadena
        var nuevoCaracter = cadena1.replace("o","a");
        System.out.println("nuevoCaracter = " + nuevoCaracter);

        //Convertir Mayúscula
        var cadenaMayuscula = cadena1.toUpperCase();
        System.out.println("cadenaMayuscula = " + cadenaMayuscula);

        //Convertir Minúscula
        var cadenaMinuscula = cadena1.toLowerCase();
        System.out.println("cadenaMinuscula = " + cadenaMinuscula);

        //Eliminar los espacio al inicio y al final
        var cadena2 = "   El santi es un trucho       ";
        System.out.println("cadena2 con espacio = " + cadena2);
        System.out.println("cadena2 sin espacio = " + cadena2.trim());
    }
}
