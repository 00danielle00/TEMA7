package colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1 {
    public static void main(String[] args) {
        //a
        Queue<Character> cola = new LinkedList<>();
        //b
        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');
        //c
        boolean empty = cola.isEmpty();
        if (empty) {
            System.out.println("La cola está vacía");
        } else {
            System.out.println("La lista no está vacia");
        }
        //d
        System.out.println("Hay en la cola: " + cola.size() + " elementos en cola");
        //e
        System.out.println("Primer elemento: " + cola.peek());
        //f
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
