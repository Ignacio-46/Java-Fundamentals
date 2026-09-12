public class TipoDatos {
    static void main() {
        //tipo de datos en Java
        System.out.println("Tipo de datos en Java\n");

        //Enteros (valor por default es 0)
        System.out.println("Enteros:");
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Punto Flotante (valor por default es 0.0)
        System.out.println("\nFlotante: ");
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (valor por default es )
        System.out.println("\nCaracter: ");
        char tipoChar = 'A'; //caractere del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; //solo toma los caracteres
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booloeanos (valor por default es false)
        System.out.println("\nBooleanos: ");
        boolean tipoBooleano = true;
        System.out.println("tipoBooleano = " + tipoBooleano);
        tipoBooleano = false;
        System.out.println("tipoBooleano = " + tipoBooleano);
        
        //Tipos object (Referencia)
        System.out.println("\nString: ");
        String tipoNombre = null; //String (valor por default es null)
        System.out.println("tipoNombre = " + tipoNombre);
        tipoNombre = "Ignacio";
        System.out.println("tipoNombre = " + tipoNombre);
    }
}
