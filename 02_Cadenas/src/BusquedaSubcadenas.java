public class BusquedaSubcadenas {
    static void main() {
        System.out.println("*** Búsqueda de Subcadenas ***");
        var cadena1 = "Hola Mundo";

        //indexOf - devuelve el índice de la primera aparición de la subcadena
        //Buscamos la subcadena "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //LastIndexOf - devuelve el índice de la última aparición de la subcadena
        //Buscamos la subcadena "Mundo"
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //No encontramos la subcadena devuelve -1
        var indice3 = cadena1.indexOf("Java");
        var indice4 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
        System.out.println("indice4 = " + indice4);
    }
}
