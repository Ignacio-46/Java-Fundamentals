import java.util.Scanner;

public class SistemaEmpleado {
    static void main() {
        //Ejercicio Sistema de Empleados
        System.out.println("*** Sistema de Empleados ***");

        //Entrada de datos
        var consola = new Scanner(System.in);

        //Datos del Empleado
        //Nombre
        System.out.print("Nombre del Empleado: ");
        var nombreEmplado = consola.nextLine();
        //Edad
        System.out.print("Edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        //Salario
        System.out.print("Salario: ");
        var salario = Double.parseDouble(consola.nextLine());
        //Jefe de Departamento
        System.out.print("Es jefe de departamento (true/false)?: ");
        var jefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Se imprime
        System.out.println("\n--- Datos del Empleado ---");
        System.out.println("Nombre del Emplado = " + nombreEmplado);
        System.out.println("edad = " + edad + " años");
        //System.out.println("salario = $" + salario + " pesos");
        System.out.printf("salario = $%.2f pesos%n" , salario);
        System.out.println("jefe de Departamento = " + jefeDepartamento);
    }
}
