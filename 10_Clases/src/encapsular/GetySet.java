package encapsular;

// Este paquete es para ver los encapsulamientos con ejemplo de la Aritmética

public class GetySet {

    // Atributos
    private Integer operando1;
    private Integer operando2;

    // objeto.Constructor
    public GetySet(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //Metodo Suma
    public void mostrarSuma(){
        var suma = operando1 + operando2;
        System.out.println("suma = " + suma);
    }
    //Metodo Resta
    public void mostrarResta(){
        var resta = operando1 - operando2;
        System.out.println("resta = " + resta);
    }

    //Utilizamos el metodo get del operando1
    public int getOperando1(){
        return this.operando1;
    }

    //Utilizamos el metodo set del operando1
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    //Utilizamos el metodo get del operando2
    public int getOperando2(){
        return this.operando2;
    }

    //Utilizamos el metodo set del operando2
    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
}
