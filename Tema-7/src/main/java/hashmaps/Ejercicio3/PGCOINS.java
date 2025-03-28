package hashmaps.Ejercicio3;

import java.util.Scanner;

public class PGCOINS {
    static Scanner in;

    public static void casoDePrueba() {
        String contrasenya = in.next();
        String expresion = "^.*(?=.{12,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[+_)(*&^%$#@!./,;{}]).*$";

        if (contrasenya.matches(expresion)){
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }


    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

}
