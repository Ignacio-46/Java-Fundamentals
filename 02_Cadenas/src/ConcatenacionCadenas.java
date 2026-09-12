public class ConcatenacionCadenas {
    static void main() {
        System.out.println("*** Más Concatenaciones en cadenas ***");
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        //metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        //StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        //constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        //join
        resultado = String.join(" ", cadena1, cadena2, "Adíos");
        System.out.println("resultado Join = " + resultado);
    }
}
