package Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> lista = new LinkedHashSet<>();
        String palabra = "";
        do {
            System.out.print("Escribe una URL visitada( o salir para terminar ):");
            lista.add(palabra);
            palabra=sc.next();


        }while (!palabra.equals("salir"));

        System.out.println("Historial de navegación");
        for (String pala: lista) {
            System.out.println(pala);
        }
    }
}
