public class ArgumentosVariables {
    static void main() {
        imprimirNumero(1,2,3,4,5); // var args
        System.out.println();
        variosParametros("Karla", 10, 20, 30);
    }

    // Al utilizar el parametro "int..." recibe cualquier cantidad de parametros
    //que proporcionemos, siempre que sea de tipo entero
    static void imprimirNumero(int... numeros) {
        for (var i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    //Siempre va primero la cadena y después los de tipo entero
    static void variosParametros(String nombre, int... numeros) {
        System.out.println("\nNombre: " + nombre);
        for (var i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
