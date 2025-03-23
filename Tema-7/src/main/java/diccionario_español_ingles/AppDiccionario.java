package diccionario_español_ingles;

import java.util.Scanner;

public class AppDiccionario {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        diccionario.nuevoPar("perro", "dog");
        diccionario.nuevoPar("mesa","table");
        diccionario.nuevoPar("coche","car");

        diccionario.traduce("perro");
        diccionario.palabraAleatoria();
        diccionario.traduce("mesa");
        diccionario.primeraLetraTraduccion("perro");

        String respuesta="";
        while (true) {
            diccionario.primeraLetraTraduccion("perro");
            System.out.println("Indique la respuesta");
            respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("fin")){
                return;
            }else {

            }
        }


    }

}
