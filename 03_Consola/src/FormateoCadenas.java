public class FormateoCadenas {
    static void main() {
        System.out.println("*** Formateo Cadenas ***");
        var nombre = "Matias";
        var edad = 33;
        var salario = 20000.50;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d años, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //Metodo prinf
        System.out.printf("Nombre: %s, Edad: %d años, Salario: $%.2f", nombre, edad, salario);

        //Formateo con text block
        var numeroEmpleado = 12;
        mensaje = """
                \n%nDetalle Persona:\s
                -----------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        //%04d esto aplica hasta 4 dígitos - se agrega 2 ceros a la izquieda
        System.out.println(mensaje);

        //text block con printf directamente
        System.out.printf( """
                Detalle Persona:\s
                -----------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """,nombre, numeroEmpleado, edad, salario);
    }
}
