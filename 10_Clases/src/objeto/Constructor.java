package objeto;

public class Constructor {

    //Atributos
    Integer operando1;
    Integer operando2;

    //El constructor debe llamarse lo mismo que la clase
    public Constructor(int op1, int op2){ // no es necesario ponerle public
        System.out.println("\nEjecutando objeto.Constructor");
        operando1 = op1;
        operando2 = op2;
    }

    Constructor(){} // objeto.Constructor vacío (se puede inicializar otra típo de características pero no de los atributos)

    //Suma
    void mostrarSuma(){
        var suma = operando1 + operando2;
        System.out.println("suma = " + suma);
    }
    //Resta
    void mostrarResta(){
        var resta = operando1 - operando2;
        System.out.println("resta = " + resta);
    }

    static void main() {
        System.out.println("*** objeto.Constructor ***");

        //Se crea el objeto 1
        var objeto1 = new Constructor(5, 7); // Se crea el objeto con argumentos
        objeto1.operando1 = 5;
        objeto1.operando2 = 7;

        //Se imprime los valores del objeto 1
        objeto1.mostrarSuma();
        objeto1.mostrarResta();

        //objeto.Constructor vacío (sobrecarga de constructores)
        System.out.println("\n*** objeto.Constructor vacío ***");
        var objeto2 = new Constructor();
        objeto2.operando1 = 15;
        objeto2.operando2 = 5;
        objeto2.mostrarSuma();
    }
}
