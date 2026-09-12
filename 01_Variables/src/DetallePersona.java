public class DetallePersona {
    static void main() {
        String nombre = "Ignacio";
        int edad = 34;
        double altura = 1.61;
        String pais = "Argentina";
        char estadocivil;
        estadocivil = 'S'; //C - casado / S - Soltero

        //Se imprime
        System.out.println("---*** Detalle de la Persona***---");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Altura: " + altura);
        System.out.println("Nacionalidad: " + pais);
        System.out.println("Estado Civil: " + estadocivil);
    }
}
