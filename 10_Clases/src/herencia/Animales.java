package herencia;

//Clase Padre
public class Animales {
    protected void comer(){
        System.out.println("Comiendo!!");
    }

    protected void cagar(){
        System.out.println("Cagando!!");
    }

    protected void dormir(){
        System.out.println("Durmiendo!!");
    }
}

// Clase hija
class Perro extends Animales{
    void hacerSonido(){
        System.out.println("Puedo ladrar!!");
    }

    // Sobreescritura del metodo de la clase padre
    @Override //significa sobreescribir
    protected void dormir(){
        System.out.println("Mensaje sobreescrito: ");
        System.out.println("Durmiendo 15 horas al día!!");
        System.out.println("Mensaje que fue ocultado al sobreescribir: ");
        super.dormir(); // llama el metodo de la clase padre donde se ocultó el mensaje que tenía antes
    }
}

//Se realiza la Herencia
class PruebaAnimal{
    static void main() {
        System.out.println("*** Ejemplo de Herencia ***");

        // Clase padre
        System.out.println("Clase Padre, soy un animal");
        var animal1 = new Animales();
        animal1.comer();
        animal1.cagar();
        animal1.dormir();
        // animal1.hacerSonido(); no se puede realizar porque este metodo no existe en la clase padre

        // Clase hija
        System.out.println("\nClase Hija, soy un Perro");
        var perro1 = new Perro();
        perro1.comer(); //se puede tomar los metodos de la clase padre
        perro1.cagar();
        perro1.dormir(); //sobreescrito heredado del padre
        perro1.hacerSonido(); //metodo de la clase hija
    }
}