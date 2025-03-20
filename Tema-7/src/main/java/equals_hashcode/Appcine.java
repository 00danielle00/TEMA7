package equals_hashcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Appcine {
    static Queue<Persona> listapersonas = new LinkedList<>();
    static Random r = new Random();

    public static void main(String[] args) {

        System.out.println("***** CINE AL POBLE *****");
        generarCola();
        System.out.println("Hay "+listapersonas.size()+" a la cola"+listapersonas);
        System.out.println("La recaudación ha sido de "+recaudacion()+"€");

    }

    public static void generarCola() {

        int cola = r.nextInt(250);

        for (int i = 0; i < cola; i++) {
            listapersonas.offer(new Persona(r.nextInt(97) + 3));
        }
    }

    public static double recaudacion() {
        double dinero = 0;
        while (!listapersonas.isEmpty()) {
            dinero += obtenerDinero(listapersonas.peek().getEdad());
            listapersonas.poll();
        }
        return dinero;
    }

    private static double obtenerDinero(int edad) {
        if (edad >= 3 && edad <= 10) {
            return 1;
        } else if (edad >= 11 && edad <= 17) {
            return 2.5;
        } else {
            return 3.5;
        }
    }
}
