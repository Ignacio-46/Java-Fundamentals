package aritmetica;

public class Aritmetica {

    //Atributos
    public Integer operando1;
    public Integer operando2;

    //Metodos de la clase
    //Suma
    public void mostrarSuma(){
        var suma = operando1 + operando2;
        System.out.println("suma = " + suma);
    }
    //Resta
    public void mostrarResta(){ //Se le puso public debido a que se importa desde el paquete de PruebaAritmetica
        var resta = operando1 - operando2;
        System.out.println("resta = " + resta);
    }
    //Multiplicación
    void mostrarMultiplicacion(){
        var multiplicacion = operando1 * operando2;
        System.out.println("multiplicación = " + multiplicacion);
    }
    //División
    void mostrarDivision(){
        var division = operando1 / operando2;
        System.out.println("división = " + division);
    }

    //Metodo Principal
    static void main() {
        System.out.println("*** Clase Aritmética ***");

        //Se crea el objeto 1
        var objeto1 = new Aritmetica();
        objeto1.operando1 = 5;
        objeto1.operando2 = 7;

        //Se imprime los valores del objeto 1
        objeto1.mostrarSuma();
        objeto1.mostrarResta();
        objeto1.mostrarMultiplicacion();
        objeto1.mostrarDivision();

        System.out.println();

        //Se crea el objeto 2
        var objeto2 = new Aritmetica();
       objeto2.operando1 = 12;
       objeto2.operando2 = 16;

        //Se imprime los valores del objeto 2
        objeto2.mostrarSuma();
        objeto2.mostrarResta();
        objeto2.mostrarMultiplicacion();
        objeto2.mostrarDivision();
    }
}
