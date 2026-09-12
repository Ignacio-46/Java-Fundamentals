public class SumaAcumulativa {
    static void main() {
        System.out.println("*** Suma Acumulativa ***");

        var acumulador = 0;
        var numero = 1;
        final var MAXIMO = 5;

        //con while
        System.out.println("Con while: ");

        while (numero <= MAXIMO){
            //Imprimir lo que va a sumar
            System.out.println("Acumulador + número -> " + acumulador + " + " + numero);

            //Realiza la suma acumulativa
            acumulador += numero ++;

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumulador + "\n");
        }
        System.out.println("La suma de los primero " + MAXIMO + " números: " + acumulador);

        //con do while
        System.out.println("\nCon do while: ");

        var acumulador1 = 0;
        var numero1 = 1;
        final var MAXIMO1 = 5;

        do {
            //Imprimir lo que va a sumar
            System.out.println("Acumulador + número -> " + acumulador1 + " + " + numero1);

            //Realiza la suma acumulativa
            acumulador1 += numero1 ++;

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumulador1 + "\n");

            System.out.println("La suma de los primero " + MAXIMO1 + " números: " + acumulador1);

        }while (numero1 <= MAXIMO1);

        System.out.println("\nCon For: ");

        var numero2 = 1;
        final var MAXIMO2 = 5;

        for (var i = 0; numero2 <= MAXIMO2; numero2++){
            //Imprimir lo que va a sumar
            System.out.println("Acumulador + número -> " + i + " + " + numero2);

            //Realiza la suma acumulativa (i es el acumulador)
            i += numero2;

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + i + "\n");
        }
        System.out.println("La suma de los primero " + MAXIMO2 + " números: 15");
    }
}
