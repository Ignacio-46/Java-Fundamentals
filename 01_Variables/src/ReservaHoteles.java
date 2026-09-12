public class ReservaHoteles {
    static void main() {
        // Ejercicio de Reservación de Hoteles
        System.out.println("*** Reservación de Hoteles ***");
        var nombreCliente = "Santi Mira";
        var diasEstancias = 7;
        var tarifaDiaria = 5000.50;
        var vistaAlMar = true;

        // Se imprime el datalle
        System.out.println("Cliente = " + nombreCliente);
        System.out.println("Días Estancias = " + diasEstancias + " días");
        System.out.println("Tarifa Diaria = $" + tarifaDiaria);
        System.out.println("Vista al Mar = " + vistaAlMar);

        // se modifica su valores
        System.out.println("\n*** Nueva Reservación ***");
        nombreCliente = "Nahuel Valdes";
        diasEstancias = 5;
        tarifaDiaria = 3000.50;
        vistaAlMar = false;
        System.out.println("Cliente = " + nombreCliente);
        System.out.println("Días Estancias = " + diasEstancias + " días");
        System.out.println("Tarifa Diaria = $" + tarifaDiaria);
        System.out.println("Vista al Mar = " + vistaAlMar);
    }
}
