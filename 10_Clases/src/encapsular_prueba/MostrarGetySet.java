package encapsular_prueba;

import encapsular.GetySet;

//Acá se ve los encapsulamientos de la clase GetySet importado desde el paquete encapsulamiento

// El metodo principal
public class MostrarGetySet {

        static void main() {
            System.out.println("*** Encapsulamiento ***");

            var objeto1 = new GetySet(5, 7);
            System.out.println("Atributo operando1: " + objeto1.getOperando1());
            objeto1.setOperando1(10);
            objeto1.setOperando2(15);
            objeto1.mostrarSuma();
            objeto1.mostrarResta();

            var objeto2 = new GetySet(12, 16);
            System.out.println("\nAtributo operando2: " + objeto2.getOperando2());
            objeto2.setOperando1(2);
            objeto2.setOperando2(4);
            objeto2.mostrarSuma();
            objeto2.mostrarResta();
        }
}
