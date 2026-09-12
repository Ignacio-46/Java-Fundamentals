public class Excepciones {
    static void main() {
        System.out.println("*** Manejo de Excepciones ***");

        int valor1 = 10;
        int valor2 = 0;

        try {
            var resultado = valor1 / valor2;
            System.out.println("Resultado: " + resultado);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error = " + e);
        }
    }
}
