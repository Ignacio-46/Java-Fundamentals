public class Cadenas {
    static void main() {
        System.out.println("*** Cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo"); // de esta manera se escribe la cadena mas formal
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        var cadena4 = """
                Esto es un texto
                multilínea
                mas
                línea""";
        System.out.println("cadena4 = " + cadena4);
    }
}
