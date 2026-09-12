public class EjemplosMatrices {
    static void main() {
        System.out.println("*** Ejemplos de Matrices ***");
        //definimos una matriz
        //int[][] matriz = new int[2][3];

        //Opción más fácil
        var matriz = new int[2][3];

       //matriz[reglón][columna]
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //Se imprime los valores
        System.out.println("Valor de la matriz[0][0] = " + matriz[0][0]);
        System.out.println("Valor de la matriz[0][1] = " + matriz[0][1]);
        System.out.println("Valor de la matriz[0][2] = " + matriz[0][2]);
        System.out.println("Valor de la matriz[1][0] = " + matriz[1][0]);
        System.out.println("Valor de la matriz[1][1] = " + matriz[1][1]);
        System.out.println("Valor de la matriz[1][2] = " + matriz[1][2]);
    }
}
