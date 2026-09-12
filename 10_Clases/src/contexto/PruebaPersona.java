package contexto;

//En el paquete contexto tomamos el ejemplo de la clase PruebaPersona

public class PruebaPersona {
    static void main() {
        System.out.println("*** Ejemplo de ToString ***");

        // Se ve como la varieble no se incrementó antes de definir el objeto
        System.out.println("Variable estática: " + Persona.contadorPersonas1);

        // Se ve como la variable no se incrementó antes de definir el objeto con el metodo getContadorPersona de la clase Persona
        System.out.println("Variable estática privada: " + Persona.getContadorPersonas());
        System.out.println();

        var persona1 = new Persona("Ignacio", "Roldán");
        System.out.println(persona1.toString());
        System.out.println(persona1); // Automáticamente llama ToString

        // Se ve como la variable se incrementó después de definir el objeto
        System.out.println("Variable estática: " + Persona.contadorPersonas1);
        System.out.println("Variable estática privada: " + Persona.getContadorPersonas());
        System.out.println();

        // Segundo objeto
        var persona2 = new Persona("Matias", "Torres");
        System.out.println(persona2);
        System.out.println("Variable estática: " + Persona.contadorPersonas1);
        System.out.println("Variable estática privada: " + Persona.getContadorPersonas());
        System.out.println();

        // Acá se ve el contador con la variable privada y usando el metodo getPersonaContador() después de definir el objeto
        // Tercer objeto
        var persona3 = new Persona("Santos", "Mira");
        System.out.println(persona3);
        System.out.println("Variable estatica Privada: " + Persona.getContadorPersonas());

        // No es recomendable establecer el contador desde los objetos sino a traves desde las clases ("Persona.contadorPersonas")
        System.out.println("\nContador usando los objetos: ");
        System.out.println("Variable estática: " + persona1.contadorPersonas1);
        System.out.println("Variable estática: " + persona2.contadorPersonas1);
        System.out.println("Variable estática privada: " + persona3.getContadorPersonas());
        System.out.println();
    }
}
