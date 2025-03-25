package ListITerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas {
    public static void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'x', 'z'));

        ListIterator<Character> it = letras.listIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");

        }

        ListIterator<Character> iterator_atras = letras.listIterator(letras.size());

        while (iterator_atras.hasPrevious()) {
            System.out.print(iterator_atras.previous() + " ");
        }
    }
}
