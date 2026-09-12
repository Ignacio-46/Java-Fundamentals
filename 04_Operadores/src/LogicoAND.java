public class LogicoAND {
    static void main() {
        System.out.println("*** Operado Lógico 'AND' ***");
        boolean a = false, b = false;
        //AND o && regresa el valor verdadero si ambos cumple la condición true

        //false && false
        var resultado = a && b;
        System.out.println("resultado a(false) && b(false)= " + resultado);
        //false && true
        b= true;
        resultado = a && b;
        System.out.println("resultado a(false) && b(true)= " + resultado);
        //true && false
        a = true;
        b = false;
        resultado = a && b;
        System.out.println("resultado a(true) && b(false)= " + resultado);
        //true && true
        a = true;
        b = true;
        resultado = a && b;
        System.out.println("resultado a(true) && b(true)= " + resultado);
    }
}
