package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        System.out.println("Introduce el primer numero:");
        pila.push(teclado.nextInt());
        System.out.println("Introduce el segundo número:");
        pila.push(teclado.nextInt());
        System.out.println("Introduce el tercer número:");
        pila.push(teclado.nextInt());

        System.out.println("Números invertidos:");
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}
