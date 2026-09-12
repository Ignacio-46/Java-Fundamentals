public class ReemplazarSubcadenas {
    static void main() {
        System.out.println("*** Reemplazo de subcadenas ***");
        var cadena1 = "Hola Mundo";
        System.out.println("cadena original = " + cadena1);

        //Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena1.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena1.replace("Hola","Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
