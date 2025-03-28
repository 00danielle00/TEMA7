package Comparadores;

import java.util.Comparator;

public class Precio implements Comparator<Producto> {

    @Override
    public int compare(Producto prod1, Producto prod2) {
        int comparaadorPrecio = prod2.getPrecio().compareTo(prod1.getPrecio());
        if (comparaadorPrecio ==0){
            return comparaadorPrecio;
        }

        return prod1.getNombre().compareTo(prod2.getNombre());
    }
}
