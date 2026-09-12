public class Unarios {
    static void main() {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador Unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        //Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        //Pre-Incremento
        a = 3;
        resultado = ++a; //Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incrementó = " + a);

        //Post-Incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y después se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        //Pre-Decremento
        b = -2;
        resultado = --b; //Primero se incrementa y después se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decrementó = " + b);

        //Post-Decremento
        b = -2;
        resultado = b--; //Primero se usa el valor y después se incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);

    }
}
