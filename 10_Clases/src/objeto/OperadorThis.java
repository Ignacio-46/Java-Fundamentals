package objeto;

public class OperadorThis {

    Integer operando1;
    Integer operando2;

    OperadorThis(int operando1, int operando2){
        System.out.println("\nEjecutando objeto.Constructor");
        this.operando1 = operando1; // El operador this hace que argumentos puedan ser iguales el valor
        this.operando2 = operando2;
        System.out.println("Obj. Dir. Mem. this: " + this); // El operador this apunta el mismo objeto en memoria
    }

    //Suma
    public void mostrarSuma(){
        var suma = this.operando1 + this.operando2;
        System.out.println("suma = " + suma);
    }
    //Resta
    public void mostrarResta(){
        var resta = this.operando1 - this.operando2;
        System.out.println("resta = " + resta);
    }

    static void main() {
        System.out.println("*** objeto.Constructor ***");

        var objeto1 = new OperadorThis(5, 7);
        objeto1.operando1 = 5;
        objeto1.operando2 = 7;

        objeto1.mostrarSuma();
        objeto1.mostrarResta();
        System.out.println("Obj. Dir. Mem. del objeto1: " + objeto1);


        System.out.println("\n*** Segundo objeto.Objeto ***");
        var objeto2 = new OperadorThis(12, 16);
        objeto2.mostrarSuma();
        System.out.println("Obj. Dir. Mem. del objeto2: " + objeto2);
    }
}
