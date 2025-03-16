package Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio4 {

    public static void main(String[] args) {
        TreeSet<Integer> lista = new TreeSet<>();
        TreeSet<Integer> lista2 = new TreeSet<>();
        lista.add(3);
        lista.add(6);
        lista.add(9);
        lista.add(1);
        System.out.println("lista1: " + lista);
        lista2.add(2);
        lista2.add(8);
        lista2.add(3);
        lista2.add(7);
        lista2.add(10);
        System.out.println("Lista2: " + lista2);

        TreeSet<Integer> nums3 = new TreeSet<>();

        while (!lista.isEmpty() || !lista2.isEmpty()) {
            if (!lista.isEmpty()) {
                nums3.add(lista.pollFirst());
            } else {
                nums3.add(lista2.pollFirst());
            }
        }
        System.out.println(nums3);
    }

}
