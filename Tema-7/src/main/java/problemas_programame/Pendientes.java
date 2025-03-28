package problemas_programame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pendientes {
    static Scanner in;

    public static boolean casoDePrueba() {
        int pendientes = in.nextInt();

        if (pendientes == 0) {
            return false;
        } else {
            Set<Integer> p = new HashSet<>();
            int pareja = 0;
            for (int i = 0; i < pendientes; i++) {
                int pendiente = in.nextInt();
                if (p.contains(pendiente)) {
                    pareja++;
                    p.remove(pendiente);
                } else {
                    p.add(pendiente);
                }

            }
            System.out.println(pareja);
            return true;
        }

    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        while (casoDePrueba()) {

        }

    }

}
