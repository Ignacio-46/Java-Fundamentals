public class SintaxisSimplificada {
    static void main() {
        System.out.println("*** Sintaxis simplificada de un Arreglo ***");

        //Arreglo
        var entero = new int[]{100,200,300,400,500};

        //imprimir
        System.out.println("Valor 1: " + entero[0]);
        System.out.println("Valor 2: " + entero[1]);
        System.out.println("Valor 3: " + entero[2]);
        System.out.println("Valor 4: " + entero[3]);
        System.out.println("Valor 5: " + entero[4]);

        //Se imprime dirección de memoria
        System.out.println("Imprimir el Arreglo: " + entero);
    }
}
