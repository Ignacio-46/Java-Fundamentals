public class Constantes {
    static void main() {
        System.out.println("*** Constantes en Java ***");
        // siempre se define con "final var" para declarar una variable constante
        final var DIAS_SEMANAS = 7;
        System.out.println("DIAS_SEMANAS = " + DIAS_SEMANAS);
        //DIAS_SEMANAS = 8; no se puede modificar su valor una vez inicializado
        final var MENSAJE_BIENVENIDA = "Bienvenidos a la Univesidad de Jav@";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO + "s");
    }
}
