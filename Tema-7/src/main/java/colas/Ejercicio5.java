package colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce una palabra: ");
        String palabla = sc.next();
        Deque<Character> lista = new LinkedList<>();
        for (int i = 0; i < palabla.length(); i++) {
            lista.offer(palabla.charAt(i));
        }
       esPalindromo(lista);

    }

    public static boolean esPalindromo(Deque<Character> lista) {
        while (lista.size()> 1) {

            if (lista.peekFirst() == lista.peekLast()) {
                lista.pollFirst();
                lista.pollLast();

            } else {
                System.out.println("No es palindroma ");
                return false;
            }
        }
        System.out.println("Es palindroma");
        return true;
    }
}
