package persona_prueba;

import persona.Persona;

public class PruebaPersona {
    static void main() {
        System.out.println("*** Clase contexto.Persona ***");

        var persona1 = new Persona("Ignacio", "Roldán");
        System.out.println("Atributo Nombre: " + persona1.getNombre() + " \nAtributo Apellido: " + persona1.getApellido());

        System.out.println();

        var persona2 = new Persona("Ignacio", "Roldán");
        persona2.setNombre("Nahuelito");
        persona2.setApellido("Valdés");
        persona2.mostrarNombre();
        persona2.mostrarApellido();

        System.out.println();

        var persona3 = new Persona("Ignacio", "Roldán");
        persona3.setNombre("Matias");
        persona3.setApellido("Torres");
        persona3.mostrarNombre();
        persona3.mostrarApellido();

        System.out.println();

        var persona4 = new Persona("Ignacio", "Roldán");
        persona4.setNombre("Santi");
        persona4.setApellido("Mira");
        persona4.mostrarNombre();
        persona4.mostrarApellido();
    }
}
