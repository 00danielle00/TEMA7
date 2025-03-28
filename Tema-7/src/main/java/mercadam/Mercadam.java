package mercadam;

import java.lang.reflect.Array;
import java.util.*;

public class Mercadam {
    static Random r = new Random();
    private static Set<Cliente> clientes;


    public Mercadam() {
        clientes = new HashSet<>();
    }


    public static String generarClientes(int tamano) {
        int longitud=0;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String passwd = "";
        for (int i = 0; i < 8; i++) {
             r.nextInt(caracteres.length());
            passwd += caracteres.charAt(longitud);
        }
        return passwd;
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
