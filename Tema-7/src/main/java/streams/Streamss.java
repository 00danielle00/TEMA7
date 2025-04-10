package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamss {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5, 6);
        List<Integer> numeritos = new ArrayList<>(Arrays.asList(1, 3, 3, 4, 4, 5, 6, 7, 8, 149, 149, 200, 20, 30, 30));

        long f = numeritos.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(f);

        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche", "San Vicente", "Mutxamel", "Eliana"));
        pueblos.stream()
//                .map(String::toUpperCase)
//                .filter(pueblo -> pueblo.contains("I"))
//                .filter(pueblo -> pueblo.endsWith("A"))
                .sorted()
                .forEach(System.out::println);


    }
}
