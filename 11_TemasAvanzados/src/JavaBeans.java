import java.io.Serializable;

public class JavaBeans {
    static void main() {

        System.out.println("*** JavaBeans ***");
        var persona = new Persona();
        persona.setNombre("Ignacio");
        persona.setApellido("Roldán");
        System.out.println("Nombre: " + persona); // con metodo ToString
        System.out.println("\nNombre: " + persona.getNombre()); // utilizando get
        System.out.println("Apellido: " + persona.getApellido());
    }
}

class Persona implements Serializable {

    //Atributos
    private String nombre;
    private String apellido;

    //Constructor vacío
    public Persona() {}

    //Metodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
