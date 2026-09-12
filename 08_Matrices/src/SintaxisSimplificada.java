public class SintaxisSimplificada {
    static void main() {
        System.out.println("*** Sintaxis Simplificada de la Matriz ***");

        //Definimos la Matriz
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        //Recorrer la Matriz
        //1. Ciclo más externo. Recorrer los renglones
        for (var ren = 0; ren < matriz.length; ren++){
            //2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
