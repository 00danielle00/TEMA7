package mercadam;

import java.lang.reflect.Array;
import java.util.*;

public class Mercadam {
    static Random r = new Random();
    private static Set<Cliente> clientes = new HashSet<>();;


    public Mercadam() {
    }


    public static void generarClientes() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String[] aux = caracteres.split("");
        String usuario = "";
        String passwd = "";
        for (int i = 0; i < 8; i++) {
            usuario += aux[r.nextInt(aux.length)];
            passwd += aux[r.nextInt(aux.length)];
        }
        clientes.add(new Cliente(usuario, passwd));
        System.out.println(clientes);
    }

    public static Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

    @Override
    public String toString() {
        return "Mercadam{" +
                "clientes=" + clientes +
                '}';
    }
}
