public class IndicesCadenas {
    static void main() {
        System.out.println("*** Indices de Cadenas ***");
        var cadena1 = "Hola Mundo";

        // Recupera el primer carácter
        var primerCaracter = cadena1.charAt(0); //recupera el caracter "H"
        System.out.println("primerCaracter = " + primerCaracter);

        //Recupera el último carácter (posición 9)
        var ultimoCaracter = cadena1.charAt(9); //recupera el caracter "o"
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        //Imprime el caracter "M" (indice 5)
        var caracterM = cadena1.charAt(5);
        System.out.println("caracterM = " + caracterM);
    }
}
