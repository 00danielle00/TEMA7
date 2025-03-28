package Comparadores;

import java.util.*;

public class PruebaMapas {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"uno");
        map.put(2,"dos");
        map.put(3,"tres");

        List<Map.Entry<Integer,String>>listaMapa = new ArrayList<>(map.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Integer,String> m : listaMapa){
            System.out.println(m.getKey()+" --> "+m.getValue());
        }

    }
}
