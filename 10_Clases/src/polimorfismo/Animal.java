package polimorfismo;

// clase padre
public class Animal {
    protected void HacerSonido() {
        System.out.println("Hago sonido");
    }
}

// clase hija
class Perro extends Animal {
    @Override
    protected void HacerSonido() {
        System.out.println("Guau guau guau guau!!");
    }
}

// clase hija
class Gato extends Animal {
    @Override
    protected void HacerSonido() {
        System.out.println("Miauuuuuuuuuuu!!");
    }
}

// clase para la prueba del sonido
class PruebaSonido {
    // Metodo Polimórfico
    static void imprimirSonido(Animal animal) {
        animal.HacerSonido();
    }

    static void main() {
        System.out.println("*** Ejemplo de polimorfismo ***");

        //clase objeto del padre (Animal)
        var animal = new Animal();
        imprimirSonido(animal);
        var perro1 = new Perro();
        imprimirSonido(perro1);
        var gato1 = new Gato();
        imprimirSonido(gato1);
    }
}