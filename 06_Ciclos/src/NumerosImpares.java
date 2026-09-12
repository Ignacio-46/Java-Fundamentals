public class NumerosImpares {
    static void main() {
        System.out.println("*** Números Impares ***");

        //Números Impares con do while

        var contador = 0;
        System.out.println("Con do while: ");

        do {
            if (contador % 2 != 0)
                System.out.println(contador + " ");
            contador ++;
        }while (contador <= 20);

        //Números Impares con for
        System.out.println("Con For: ");

        for (var i = 1; i <= 20; i++){
            if (i % 2 != 0)
                System.out.println(i + " ");
        }
    }
}
