public class EjemplosFunciones {

    static void saludar (String mensaje) { //Funciones
        System.out.println("Mensaje: " + mensaje);
    }

    static void numero (Integer entero){
        System.out.println("Entero: " + entero);
    }

    static void decimal (Double flotante){
        System.out.println("Flotante: " + flotante);
    }

    static void main() { //metodo principal
        System.out.println("*** Funciones ***");
        saludar("Hola"); //Llama la función
        saludar("Adios");
        numero(10);
        numero(20);
        decimal(4.5);
        decimal(8.6);
    }
}
