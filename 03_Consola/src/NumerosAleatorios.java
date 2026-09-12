import java.util.Random;

public class NumerosAleatorios {
    static void main() {
        //Números Aleatorios
        System.out.println("*** Números Aleatorios ***");
        var ramdom = new Random();

        //Se genera un número aleatorio entre 0 y 9
        var numeroAleatorio = ramdom.nextInt(10);
        System.out.println("Número Aleatorio entre 0 y 9 = " + numeroAleatorio);

        //Se genera un número aleatorio entre 1 y 10
        numeroAleatorio = ramdom.nextInt(10) + 1;
        System.out.println("Número Aleatorio entre 1 y 10 = " + numeroAleatorio);

        //Se genera un número aleatorio entre 0.0 y 1.0
        var flotanteAleatorio = ramdom.nextFloat(10);
        System.out.println("Flotante Aleatorio = " + flotanteAleatorio);

        //Lanzamiento de dados
        var dado = ramdom.nextInt(6) + 1;
        System.out.println("Lanzamiento de dado = " + dado);
    }
}
