import java.util.Scanner;

public class SumaDiagonal {
    static void main() {
        System.out.println("*** Suma Diagonal ***");

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

        //Suma diagonal
        var sumaDiagonal = 0;
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                if (ren == col){
                    sumaDiagonal += matriz[ren][col];
                }
            }
        }

        //Se imprime la diagonal
        System.out.println("\nLa suma de la digonal de la matriz (3x3) es: " + sumaDiagonal);
    }
}
