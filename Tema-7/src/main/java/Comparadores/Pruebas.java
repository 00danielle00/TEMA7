package Comparadores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pruebas {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(3,2,45,23,5));

        Collections.sort(lista);

        System.out.println(lista);

        ArrayList<String> nombres=new ArrayList<>(Arrays.asList("Patricia","Andrew","Pol","Izan"));
        Collections.sort(nombres);
        Collections.reverse(nombres);

        System.out.println(nombres);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Pan",1));
        listaProductos.add(new Producto("Arroz con Pollo",5));
        listaProductos.add(new Producto("sudadera",6));


        Collections.sort(listaProductos, new Precio().reversed());
        System.out.println(listaProductos);

    }
}
