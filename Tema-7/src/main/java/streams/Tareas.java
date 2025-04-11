package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tareas {
    public static void main(String[] args) {
        List <String> nombres = new ArrayList<>(Arrays.asList("Ana","Izan","Coraima","Danielle","Jorge"));
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);
        List<String> nombresMinusculas = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(nombresMinusculas);

        long cantidad = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .count();





    }
}
