import java.util.Scanner;

public class IntroducirDatos {
    static void main() {
        System.out.println("*** Introducir datos en la Matriz ***");

        System.out.print("Proporciona los renglones: ");
        var renglones = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print("Proporciona las columnas: ");
        var columnas = Integer.parseInt(new Scanner(System.in).nextLine());

        var matriz = new int[renglones][columnas];

        System.out.println("\nProporción de lo valores: ");
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(new Scanner(System.in).nextLine());
            }
        }
        System.out.println("\nLa Matriz: ");
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
