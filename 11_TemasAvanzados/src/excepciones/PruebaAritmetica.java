package excepciones;

public class PruebaAritmetica {
    static void main() {

        System.out.println("*** Manejo de Excepciones ***");

        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println("\nResultado = " + resultado);
        }
        catch (Exception e) {
            System.out.println("\nError: " + e);
        }
        finally {
            System.out.println("Se revisó la división entre cero"); //Siempre se ejecuta
        }
    }
}
