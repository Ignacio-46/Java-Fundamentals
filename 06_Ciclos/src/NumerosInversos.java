public class NumerosInversos {
    static void main() {
        System.out.println("*** Números Inversos ***");

        var contador = 10;
        System.out.println("Con do while: ");
        do{
            System.out.println(contador-- + " ");
        } while (contador > 0);


        System.out.println("\nCon For: ");
        for (var i = 10; i > 0; i--){
                System.out.println(i + " ");
            }
        }
    }
