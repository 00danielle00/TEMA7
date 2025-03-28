package problemas_programame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ninots {
    static Scanner in;

    public static boolean casoDePrueba() {

        int num = in.nextInt();
        if (num==0) {
            return false;
        } else {
            Map<String,Integer> ninots = new HashMap<>();
            Map<String,Integer> adultos = new HashMap<>();
            String palabra = in.nextLine();

            String[] palabras = palabra.split(" ");


            return true;
        }

    }
    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while (casoDePrueba());

    }
}
