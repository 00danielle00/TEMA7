package ListITerator;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner in;

    public static boolean casoDePrueba() {

        if (in.hasNext())
            return false;
        else {
            String entrada = in.nextLine();
            LinkedList<Character> texto = new LinkedList<>();
            ListIterator<Character> it = texto.listIterator();

            for (Character c : entrada.toCharArray()) {
                switch (c) {
                    case '-':
                        while (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                        break;
                }
            }
            String salida = "";
            for (Character c : texto) {
                System.out.print(salida);
            }
            return true;
        }

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while (casoDePrueba()) ;

    } // main

}
