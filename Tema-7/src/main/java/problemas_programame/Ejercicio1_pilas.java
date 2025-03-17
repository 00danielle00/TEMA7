package problemas_programame;

import java.util.Stack;

public class Ejercicio1_pilas {
    static java.util.Scanner in;


    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String expresion = in.nextLine();

            if (esBalanceado(expresion)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean esBalanceado(String expresion) {
        Stack<String> pila = new Stack<>();
        String[] expresion_vector = expresion.split("");

        for (int i = 0; i < expresion_vector.length; i++) {

            if (expresion_vector[i].equals("(") || (expresion_vector[i].equals(")") && !pila.contains("("))) {
                pila.push(expresion_vector[i]);
            } else if (expresion_vector[i].equals(")") && pila.contains("(")) {
                pila.pop();
            }
        }
        return pila.isEmpty();
    }
}


