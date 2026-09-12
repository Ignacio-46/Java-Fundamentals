public class IterarArreglo {
    static void main() {
        System.out.println("*** Iterar un Arreglo ***");

        //Arreglo
        var entero = new int[]{100,200,300,400,500};

        //Con while
        //System.out.println("\nCon While: ");
        //while ()

        //Con for
            System.out.println("\nCon For:");
        for (var i = 0; i < entero.length; i++){
            System.out.println("Valor del índice " + i  + ": " + entero[i]);
        }
    }
}
