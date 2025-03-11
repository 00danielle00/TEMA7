package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {
    static Scanner teclado = new Scanner(System.in);
    public static boolean esBalanceado(String expresion){
        Stack<String> pila = new Stack<>();
        String [] expresion_v =expresion.split("");
        for (int i = 0; i < expresion_v.length; i++) {
            if (expresion_v[i].equals("(")){
                pila.push(expresion_v[i]);
            } else if (expresion_v[i].equals(")")&& pila.contains("(")) {
                pila.pop();
            }
        }
        if (pila.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        String expresion = "(2+3))+(5-1)(";
        if (esBalanceado(expresion)) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
