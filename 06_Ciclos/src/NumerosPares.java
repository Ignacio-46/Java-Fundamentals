public class NumerosPares {
    static void main() {
        //Número Pares con While
        System.out.println("*** Números Pares del 0 a 20 ***");

        //Números pares con while
        var contador = 0;
        System.out.println("Con while:");

        while (contador <= 20){
            //Revisamos si es un número par
            if (contador % 2 == 0){
                System.out.print(contador + " ");
            }
            contador++;
        }

        //Números pares con For
        System.out.println("\nCon for: ");

        for (var i = 0; i <= 20; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
