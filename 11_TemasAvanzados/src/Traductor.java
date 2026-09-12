public interface Traductor { //Clase Interface

    // Por default los metodos son públicos y abstractos
    void traducir();

    // Metodos con implementación por default
    default void iniciarTraductor() {
        System.out.println("\nIniciando traductor...");
    }

    // En esta clase tampoco se puede instanciar objeto parecido con la clase abstracta
}

//La clase no se establece en una relacion de Herencia cuando se trata de trabajar con interface, sino de implementación
class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduzco a Ingles");
    }
}

// Es una clase que implementa la interface
class Frances implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduzco a Frances");
    }

    //Se sobreescribió este metodo
    @Override
    public void iniciarTraductor() {
        System.out.println("\nIniciando traductor en Frances...");
    }
}

class PruebaTraductor {
    static void main() {

        System.out.println("*** Interfaces ***");

        // Clase Inglés
        Traductor ingles = new Ingles(); //Se puede instanciar los objetos donde la clase haya sido implementada por una Interface
        ingles.iniciarTraductor();
        ingles.traducir();

        // Clase Francés
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}