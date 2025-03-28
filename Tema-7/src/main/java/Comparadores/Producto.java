package Comparadores;

import java.util.Objects;

public class Producto implements Comparable<Producto>{

    private String nombre;
    private Integer precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Producto producto) {
        int compararNombres = nombre.compareTo(producto.nombre);
        if(compararNombres != 0){
            return compararNombres;
        }
        return precio.compareTo(producto.precio);

    }

}
