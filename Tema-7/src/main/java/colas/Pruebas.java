package colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Pruebas {
    public static void main(String[] args) {
        //offer
        //poll
        //peek


        Queue<Integer> cola = new ArrayBlockingQueue<>(2);
        //con este tipo de lista le das un valor preddeterminado, si te pasas, salta error
        //se tiene que usar el .add
        cola.add(4);
        cola.add(6);

        //este tipo de cola no tiene final
        Queue<Integer> cola2 = new LinkedList<>();
        cola2.offer(2);
        cola2.offer(15);
        cola2.offer(56);

        System.out.println(cola2.poll());
        System.out.println(cola2.peek());
        System.out.println("----------------------");

        //doblecola

        Deque<Integer> coladoble = new LinkedList<>();
        coladoble.offer(3);
        coladoble.offerFirst(6);
        coladoble.offerLast(10);
        coladoble.pollFirst();
        coladoble.pollLast();
        System.out.println(coladoble);



    }
}
