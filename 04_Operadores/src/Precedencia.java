public class Precedencia {
    static void main() {
        System.out.println("*** Precedencia Operador ***");
        //Precedencia de Operadores en Java
        //1. Paréntesis y Corchetes
        //2. Operadores Unarios -, ++, --
        //3. Operadores aritméticos *, / %
        //4. Operadores aritméticos + y -
        //5. Relacionales <, <=, >, >=
        //6. Equivalencias == y!=
        //7. Lógicos && y ||
        //8. Asignación =, +=, -=, *=, etc.

        //Expresión
        // Paso 1. División 12 / 3 = 4
        // Paso 2. Multiplicación 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9

        var a = 12 / 3 + 2 * 3 - 1;
        System.out.println("a = " + a);
    }
}
