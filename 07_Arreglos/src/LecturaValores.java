public class LecturaValores {
    static void main() {
        System.out.println("*** Lectura de valores de un Arreglo ***");

        //Arreglo
        var entero = new int[5];

        //Modificar valores
        entero[0] = 13;
        entero[2] = 21;
        entero[4] = 62;

        //Lectura de valores
        System.out.println("Valor 1: " + entero[0]);
        System.out.println("Valor 2: " + entero[1]);
        System.out.println("Valor 3: " + entero[2]);
        System.out.println("Valor 4: " + entero[3]);
        System.out.println("Valor 5: " + entero[4]);
    }
}
