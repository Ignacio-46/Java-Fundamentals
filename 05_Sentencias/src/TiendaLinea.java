import java.util.Scanner;

public class TiendaLinea {
    static void main() {
        //Ejercicio de tienda en línea con descuento
        System.out.println("*** Tienda en Linea con Descuento ***");

        //Variables declaradas
        final var MINIMO = 1000;
        var subdescuento1 = 0.10; //Descuento del 10%
        var subdescuento2 = 0.05; //Descuento del 5%
        var isMiembro = true;

        //Monto de la compra
        System.out.print("Cúal fue el monto de tu compra? ");
        var monto = Double.parseDouble(new Scanner(System.in).nextLine());

        //Miembro de la tienda
        System.out.print("Eres miembro de la tienda (true/false)? ");
        var miembro = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        //Decisión comparando entre el monto y la membresía
        if (monto >= MINIMO && miembro == isMiembro){
            var compra = monto * subdescuento1;
            var descuento1 = monto - compra;

            //Se imprime tienda de línea con descuento de 10%
            System.out.printf("""
                ------------------------------------------------
                Felicidades, has obtenido un descuento de 10%%
                Monto de la Compra: $%.2f
                Monto del Descuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """, monto, compra, descuento1);
        }
        else if (monto < MINIMO && miembro == isMiembro) {
            var compra = monto * subdescuento2;
            var descuento2 = monto - compra;

            //Se imprime tienda de línea con descuento %5
            System.out.printf("""
                -----------------------------------------------
                Felicidades, has obtenido un descuento de 5%%
                Monto de la Compra: $%.2f
                Monto del Descuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """, monto, compra, descuento2);
        }
        else {
            var submonto = monto;
            //Se imprime tienda de línea sin descuento
            System.out.printf("""
                ----------------------------------------------
                No obtuviste nigún tipo de descuento descuento.
                Te invitamos a hacerte miembro de la tienda!!
                Monto final de la compra: $%.2f
                """, submonto);
        }
    }
}
