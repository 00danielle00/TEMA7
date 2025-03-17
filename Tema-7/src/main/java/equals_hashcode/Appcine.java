package equals_hashcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Appcine {
    static Queue<Persona> listapersonas = new LinkedList<>();
    public static void main(String[] args) {

        System.out.println("***** CINE AL POBLE *****");
        generarCola();

    }
    public static void generarCola(){
        Random r = new Random();
        int cola = r.nextInt(250);

        for (int i = 0; i < cola; i++) {
            int edad = r.nextInt(98)+3;
            listapersonas.offer(new Persona(edad));
        }

        System.out.println("Hay "+cola+" a la cola. "+listapersonas);
    }
}
