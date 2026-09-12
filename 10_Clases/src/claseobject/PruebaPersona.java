package claseobject;

//En el paquete claseobject tomamos el ejemplo de la clase PruebaPersona

public class PruebaPersona {
    static void main() {
        System.out.println("*** Ejemplo de ToString ***");

        var persona1 = new Persona("Ignacio", "Roldán");
        System.out.println(persona1.toString());
        System.out.println(persona1); // Automáticamente llama ToString
    }
}
