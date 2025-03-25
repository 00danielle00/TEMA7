package iterable;

import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10, 23, 45, 1, 3, 5));
        Iterator<Integer> it = numeros.iterator();


        while (it.hasNext()) {
            //simpre hacer primero
            Integer num = it.next();
            if (num == 23) {
                it.remove();
            }
        }

        System.out.println(numeros);
        ArrayList<Casino> listacasino = new ArrayList<>();
        listacasino.add(new Casino("poker", 500));
        listacasino.add(new Casino("ruleta", 29));
        listacasino.add(new Casino("blackjack", 50));

        Iterator<Casino> itt = listacasino.iterator();

        while (itt.hasNext()) {
            Casino casino = itt.next();
            System.out.println(casino);

            if (casino.getApuesta_minima() > 0.20) {
                System.out.println("Raul no puede jugar");
            }
            if (casino.getApuesta_minima() < 30) {
                itt.remove();
            }
        }
        System.out.println(listacasino);

        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("casa", "Hause");
        diccionario.put("lápiz", "pencil");

        for (Map.Entry<String, String> map : diccionario.entrySet()) {

        }
        Iterator<Map.Entry<String, String>> iterator = diccionario.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> mapita = iterator.next();
            System.out.println("Palabra en español: " + mapita.getKey() + ",palabra en inglés: " + mapita.getValue());
        }
    }
}
