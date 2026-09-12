public class LogicoOR {
    static void main() {
        System.out.println("*** Operador Lógico OR ***");
        boolean a = false, b = false;
        //OR o || regresa el valor verdadero si cualquiera cumple true

        //false || false
        var resultado = a || b;
        System.out.println("resultado a(false) || b(false) = " + resultado);
        //false || true
        b = true;
        resultado = a || b;
        System.out.println("resultado a(false) || b(true) = " + resultado);
        //true || false
        a = true;
        b = false;
        resultado = a || b;
        System.out.println("resultado a(true) || b(false) = " + resultado);
        //true || true
        b = true;
        resultado = a || b;
        System.out.println("resultado a(true) || b(true) = " + resultado);
    }
}
