public class CicloDoWhile {
    static void main() {
        System.out.println("*** Ciclo Do-While ***");

        var contador = 1;
        do {
            System.out.println(contador++);
        } while (contador <= 3);
    }
}
