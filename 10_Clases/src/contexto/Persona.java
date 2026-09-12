package contexto;

//En el paquete contexto tomamos el ejemplo de la clase Persona

//Esta parte vemos como el contexto es estático al definir la clase y se agrega el contador

public class Persona {

    // Atributos
    static int contadorPersonas1 = 0;
    private int idPersona;
    private String nombre;
    private String apellido;
    private static int contadorPersonas2 = 0; //esto es en caso de que la variable contadora sea privada

    // Constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Persona.contadorPersonas++; Se incrementa el contador

        // Asignamos el ID único con la ayuda de la variable estática
        this.idPersona = ++Persona.contadorPersonas1; // se utiliza eñ pro-incremento de manera automática

        // Se declara el contador privado para usar con el metodo get
        ++Persona.contadorPersonas2;
    }

    // Sobreescritura con ToString
    @Override
    public String toString() {
        return "ID: "+ this.idPersona
                + ", Nombre: " + this.nombre
                + ", Apellido: " + this.apellido
                + ", Dir. Mem.: " + super.toString();
        //super.toString() te muestra el mensaje oculto
    }

    // Metodo get en el contador
    public int getIdPersona() {
        return this.idPersona;
    }

    // Metodos gets y sets
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Metodo get en en el contador si es privado
    public static int getContadorPersonas() { // Este metodo se hace en caso de que el contador sea privado
        return Persona.contadorPersonas2;
    }
}
