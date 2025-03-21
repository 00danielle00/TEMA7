package hashmaps;

import tareas_funcionario.Informe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> mapa = new HashMap<>();

        System.out.println("Dime una palabra: ");
        String palabra = sc.nextLine();
        char[] palabras = palabra.toCharArray();

        for (char pal:palabras ){
            mapa.put(pal,mapa.getOrDefault(pal,0)+1);
        }

        for (Map.Entry<Character, Integer> map : mapa.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }

    }
}
