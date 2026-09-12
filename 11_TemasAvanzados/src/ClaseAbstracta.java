public class ClaseAbstracta {
    static void main() {
        System.out.println("*** Clase Abstracta ***");

        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); Error no se puede instanciar un objeto de la clase abstracta

        // Clase hija Rectangulo
        FiguraGeometrica figuraGeometrica = new Rectangulo(); // Se puede instanciar la clase hija
        figuraGeometrica.dibujar();

        // Clase hija Círculo
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }

    // Clase abstracta (clase padre)
    static abstract class FiguraGeometrica { // no se puede instanciar o crear un objeto en esta clase
        public abstract void dibujar();
    }

    static class Rectangulo extends FiguraGeometrica {
        @Override
        public void dibujar() {
            System.out.println("Se debe dibujar un Rectangulo");
        }
    }

    static class Circulo extends FiguraGeometrica {
        @Override
        public void dibujar() {
            System.out.println("\nSe debe dibujar un Circulo");
        }
    }
}
