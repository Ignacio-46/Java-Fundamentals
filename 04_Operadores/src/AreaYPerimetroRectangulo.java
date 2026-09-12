import java.util.Scanner;

public class AreaYPerimetroRectangulo {
    static void main() {
        System.out.println("*** Calculo de Área y Perímetro de un Rectángulo ***");

        //Cálculo del Área
        System.out.println("*** Área y Perímetro de un Rectángulo ***");
        System.out.print("Ingrese la base: ");
        var base = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.print("Ingrese la altura: ");
        var altura = Double.parseDouble(new Scanner(System.in).nextLine());
        var area = base * altura;
        System.out.printf("""
                -----------
                Área: %.2f%n""", area);

        //Cálculo del Perímetro
        var perimetro = 2 * (base + altura);
        System.out.printf("""
                -----------
                Perímetro: %.2f""", perimetro);
    }
}
