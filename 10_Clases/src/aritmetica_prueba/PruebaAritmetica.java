package aritmetica_prueba; // se recomienda siempre hacer una carpeta de paquete y no de la carpeta del source para trabajar con las clases

import aritmetica.Aritmetica; // Se importó la clase Aritmetica dentro del paquete

public class PruebaAritmetica {

    static void main() {
        System.out.println("*** Ejemplo de aritmetica.Aritmética ***");

        //Se crea el objeto 1
        var objeto1 = new Aritmetica();
        objeto1.operando1 = 5;
        objeto1.operando2 = 7;
        objeto1.mostrarSuma();
        objeto1.mostrarResta();

        System.out.println();

        //Se crea el objeto 2
        var objeto2 = new Aritmetica();
        objeto2.operando1 = 12;
        objeto2.operando2 = 16;
        objeto2.mostrarSuma(); // Para que funciones los metodos importado se debe poner public a los metodos de la clase principal
        objeto2.mostrarResta();

    }
}
