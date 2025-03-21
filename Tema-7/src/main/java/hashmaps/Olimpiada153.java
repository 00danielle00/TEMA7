package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Olimpiada153 {

    static Scanner in = new Scanner(System.in);

    public static boolean casoDePrueba() {
        int num = in.nextInt();
        if (num == 0) {
            return false;
        } else {
            String numeros = in.nextLine();
            String[] vector = numeros.split(" ");

            Map<String, Integer> mapa = new HashMap<>();

            int contadorMax = 0;
            String claveMax = "";


            for (String numero : vector) {
                if (mapa.containsKey(numero)) {
                    mapa.put(numero, mapa.get(numero) + 1);
                } else {
                    mapa.put(numero, 1);
                }

                if (contadorMax < mapa.get(numero)) {
                    contadorMax = mapa.get(numero);
                    claveMax = numero;
                }
            }
            System.out.println(claveMax);


            return true;
        }

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while (casoDePrueba()) {

        }
    }
}

