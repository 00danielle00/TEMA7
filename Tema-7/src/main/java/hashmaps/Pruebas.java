package hashmaps;

import tareas_funcionario.Informe;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();

        notas.put("Adrián", 3);
        notas.put("Raúl", 4);
        notas.put("Manuel", 7);
        notas.put("Adrián", 4);

        System.out.println("Nota para raúl: " + notas.get("Raúl"));
        System.out.println("Nota para Adrian: " + notas.get("Adrián"));
        System.out.println("Lista de notas: " + notas);
        notas.remove("Manuel");
        System.out.println("Notas actualizadas: " + notas);

        //imprimir las claves

        System.out.println(notas.keySet());

        //imprimir valores
        System.out.println(notas.values());

        if (notas.containsKey("Adrián")) {
            System.out.println("Adrian existe");
        }

        if (notas.containsValue(10)) {
            System.out.println("alguien tiene un 10");
        }

        //recorrer mapas, keyset(), values()

        for (String claves : notas.keySet()) {
            System.out.println("Clave: " + claves);
        }

        for (Integer nota : notas.values()) {
            System.out.println("Notas: " + nota);
        }

        //estructura entryset(Interfaz), imprime ambos valores: la clave y el valor

        for (Map.Entry<String, Integer> nota: notas.entrySet()) {
            System.out.println("Nota de: "+nota.getKey()+" es de "+nota.getValue());
        }
        //para que nos respete la estructura y el orden, usamos linkedHashMap


    }
}
