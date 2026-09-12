import java.util.Scanner;

public class SaludYFitness {
    static void main() {
        System.out.println("*** Aplicación de Salud y Fitness ***");

        //Variables
        var metaPasos = 10000;
        var caloriasPasos = 0.04;

        //Nombre
        System.out.print("Ingrese su nombre: ");
        var nombre = new Scanner(System.in).nextLine();

        //Calorías
        System.out.print("Cúantos pasos dió hoy? ");
        var pasosDiarios = Double.parseDouble(new Scanner(System.in).nextLine());

        //Cálculo
        var caloriasQuemadas = pasosDiarios * caloriasPasos;

        //Decisión
        var metaAlcanzada = (pasosDiarios >= metaPasos)? "Felicidades, alcanzaste la meta!!" : "No cumpliste la meta!!";

        //Valores
        System.out.printf("""
                ------------------------------------------
                Nombre: %s
                Meta: %.2f pasos
                Calorías quemadas: %.2f Kcal
                %s
                ------------------------------------------
                La meta de pasos diarios es de %d pasos
                """, nombre, pasosDiarios, caloriasQuemadas, metaAlcanzada, metaPasos);
    }
}
