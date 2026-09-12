public class FuncionesRecursivas {

    static void funcionesRecursivas(int numero){
        //Caso Base
        if (numero == 1){
            System.out.println(numero + " ");
        }
        else {
            //Caso Recursivo
            System.out.println(numero + " ");
            funcionesRecursivas(numero - 1);
        }
    }

    static void main() {
        System.out.println("*** Funciones Recursivas ***");

        funcionesRecursivas(5);
    }
}
