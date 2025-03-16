package Stack;

import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        Stack<Character> letras = new Stack<>();
        letras.push('a');
        letras.push('b');
        letras.push('c');
        letras.push('c');
        letras.push('e');

        while (!letras.isEmpty()){
            System.out.println(letras.size());
            System.out.println();
            System.out.println(letras.peek());
            System.out.println();
            System.out.println(letras.pop());
        }

    }
}
