public class CaracteresEspeciales {
    static void main() {
        System.out.println("*** Caracteres Especiales ***");
        //Salto de linea
        var cadena1 = "Hola \nMundo";
        System.out.println("cadena1 = " + cadena1);
        //Tabulador
        var cadena2 = "Hola \tMundo";
        System.out.println("cadena2 = " + cadena2);
        // \' - comilla simple
        var cadena3 = "Hola \'Mundo\'";
        System.out.println("cadena3 = " + cadena3);
        // \" - comilla doble
        var cadena4 = "Hola \"Mundo\"";
        System.out.println("cadena4 = " + cadena4);
        // \\ - caracter diagonal invertido
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
