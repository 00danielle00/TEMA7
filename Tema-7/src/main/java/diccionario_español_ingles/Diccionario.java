package diccionario_español_ingles;

import java.util.*;

public class Diccionario {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    private HashMap<String, String> mapaDiccionario;

    public Diccionario() {
        mapaDiccionario = new HashMap<>();
    }

    public void nuevoPar(String espanyol, String ingles) {
        mapaDiccionario.put(espanyol, ingles);
    }

    public void traduce(String espanyol) {
        System.out.println("Introduce una palabra a traducir: ");
        if (mapaDiccionario.containsKey(espanyol)) {
            System.out.println("Traducción de " + espanyol + ": " + mapaDiccionario.get(espanyol));
        } else {
            System.out.println("La palabra " + espanyol + " no está en el diccionario");
        }
    }

    public void palabraAleatoria() {

        int index = r.nextInt(mapaDiccionario.size());
        int indice =0;
        for (String p:mapaDiccionario.keySet()){
            if (indice==index){
                System.out.println(p);
            }
            indice++;
        }

    }

    public void primeraLetraTraduccion(String espanyol) {
        for (Map.Entry<String, String> map : mapaDiccionario.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue().substring(0, 1));
        }
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "mapaDiccionario=" + mapaDiccionario +
                '}';
    }

}
