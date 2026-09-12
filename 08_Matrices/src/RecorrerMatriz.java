public class RecorrerMatriz {
    static void main() {
        System.out.println("*** Recorrer la Matriz ***");

        //Definimos la Matriz
        final var REGLONES = 2;
        final var COLUMNAS = 3;

        var matriz = new int[REGLONES][COLUMNAS];

        //matriz[reglón][columna]
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //Recorrer la Matriz
        //1. Ciclo más externo. Recorrer los renglones
        for (var ren = 0; ren < REGLONES; ren++){
        //2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < COLUMNAS; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
