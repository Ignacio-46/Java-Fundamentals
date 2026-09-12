public class OperadorTernario {
    static void main() {
        System.out.println("*** Operado Ternario ***");
        //Sintaxis: condición? exp1 : exp2

        //Determinar si un número es par o impar
        var numero = 2;
        var resultado = (numero % 2 == 0)? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);

        //Cálcula si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18)? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        //Valor positivo, negativo o cero (operador ternario anidado)
        var valor = 0;
        var solicitarNumero = (valor > 0)? "Positivo" : (valor < 0)? "Negativo" : "Cero";
        System.out.println("\nEl numero " + valor + " es " + solicitarNumero);
    }
}
