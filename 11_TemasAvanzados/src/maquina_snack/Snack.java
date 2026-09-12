package maquina_snack;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {

    private static int contador_snack = 0;
    private int id_snack;
    private String nombre;
    private Double precio;

    public Snack(){
        this.id_snack = ++contador_snack;
    }

    public Snack(String nombre, Double precio) {
        this(); // LLama al constructor vacío y tiene que estar en la primera línea
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContador_snack() {
        return contador_snack;
    }

    public static void setContador_snack(int contador_snack) {
        Snack.contador_snack = contador_snack;
    }

    public int getId_snack() {
        return id_snack;
    }

    public void setId_snack(int id_snack) {
        this.id_snack = id_snack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack {" +
                "id_snack = " + id_snack +
                ", nombre = '" + nombre + '\'' +
                ", precio = $" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return id_snack == snack.id_snack && Objects.equals(nombre, snack.nombre) && Objects.equals(precio, snack.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_snack, nombre, precio);
    }
}
