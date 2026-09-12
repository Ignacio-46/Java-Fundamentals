public class SumarFunciones {
    //definimos la función sumar
    static int sumar (int a, int b){
        var resultado = a + b;
        return resultado;
    }

    static void main() {
        System.out.println("*** Sumar Funciones ***");

      var resultado_funcion = sumar(3,8);
      System.out.println("\nResultado = " + resultado_funcion);

      resultado_funcion = sumar(10,20);
        System.out.println("Resultado = " + resultado_funcion);
    }
}
