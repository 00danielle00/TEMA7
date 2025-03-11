package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack <Integer> pila =new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(34);
        pila.push(2);
        System.out.println(pila.peek());

        System.out.println();
        for (Integer nums : pila) {
            System.out.println(nums);
        }

        System.out.println();
        pila.pop();
        System.out.println(pila.peek());

        System.out.println();
        while (!pila.isEmpty()){
            System.out.println(pila.pop()); //muestra a qué numeros elimina
        }
    }
}