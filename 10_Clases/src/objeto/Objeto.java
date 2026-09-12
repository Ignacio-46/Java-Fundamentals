package objeto;

public class Objeto {
    //Creación de Clase
    //Atributos
    String nombre;
    String apellido;

    //Metodo de la clase
    void mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    //Creación de objeto
    //Metodo principal
    static void main() {
        System.out.println("*** Clases y Objetos ***");

        //Se crea el objeto
        var objeto1 = new Objeto();
        objeto1.nombre = "Ignacio";
        objeto1.apellido = "Roldán";
        objeto1.mostrarPersona(); // se llama el metodo para imprimir

        System.out.println();

        var objeto2 = new Objeto();
        objeto2.nombre = "Matias";
        objeto2.apellido = "Torres";
        objeto2.mostrarPersona();
    }
}
