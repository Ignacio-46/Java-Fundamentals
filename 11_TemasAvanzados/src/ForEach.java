public class ForEach {
    static void main() {

        // En esta seccion se utiliza el ciclo ForEach
        System.out.println("*** Ciclo For Each ***");

        int edades[] = {5,10,15,30,60}; // Un Array

        // ForEach
        for (var edad : edades) { // (Variable:Array)
            System.out.println("edad = " + edad);
        }
    }
}
