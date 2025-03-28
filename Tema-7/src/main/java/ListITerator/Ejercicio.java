package ListITerator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe un texto....");
        String texto = sc.nextLine();

        LinkedList<Character> lista = new LinkedList<>();
        ListIterator<Character> it = lista.listIterator();

        for (Character c : texto.toCharArray()){
            switch (c){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(c);
                    break;
            }
        }
        for (Character c: lista){
            System.out.print(c);
        }

    }
}
