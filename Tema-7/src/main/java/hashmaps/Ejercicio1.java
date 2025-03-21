package hashmaps;

import tareas_funcionario.Informe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();

        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");

        //mapa.put("hola", 9);

        //contar palabras de una frase mediante el for y el getOrDefault
        for (String palabra : palabras) {
            mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
            //otra forma de hacer el getordefault para el juez.
//            if (mapa.containsKey(palabra)){
//                mapa.put(palabra,mapa.get(palabra)+1);
//            }else {
//                mapa.put(palabra,1);
//            }
        }
        for (Map.Entry<String, Integer> map : mapa.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }

    }
}
