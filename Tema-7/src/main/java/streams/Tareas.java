package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tareas {
    public static void main(String[] args) {
        List <String> nombres = new ArrayList<>(Arrays.asList("Ana","Izan","Coraima","Danielle","Jorge"));
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);

    }
}
