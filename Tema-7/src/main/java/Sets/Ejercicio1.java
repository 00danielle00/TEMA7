package Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine().toLowerCase();
        String [] palabras= frase.split(" ");
        for (String p: palabras){
            lista.add(p);
        }
        System.out.println("Palabras únicas: "+lista);



    }
}
