package lambda.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Smartphone", 150.0, "Electronica"));
        productos.add(new Producto("Laptop", 900.0, "Electronica"));
        productos.add(new Producto("Tablet", 250.0, "Electronica"));
        productos.add(new Producto("Papel Higienico", 1.35, "Higiene"));

        System.out.println("Productos añadidos: ");
        for (Producto p : productos) {
            System.out.println("Nombre: " + p.getNombre() + "," + " Precio:" + p.getPrecio());
        }

        FiltroProducto filtroProducto = producto -> producto.getCategoria().equalsIgnoreCase("Electronica") && producto.getPrecio() > 100;

        System.out.println("Productos filtrados");


    }
}
