public class OperadorNOT {
    static void main() {
        System.out.println("*** Operado de Negación (NOT) ***");
        boolean a = false, b = true;
        //El operador de not lo que hace es transformar los booleanos de verdadero a falso y viceversa

        //false -> true
        var resultado = !a;
        System.out.println("resultado a(false) negada = " + resultado);
        //true -> false
        resultado = !b;
        System.out.println("resultado de b(true) negada = " + resultado);
    }
}
