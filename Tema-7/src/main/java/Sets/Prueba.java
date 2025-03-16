package Sets;

import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        Set<Character> letras = new HashSet<>();
        letras.add('d');
        letras.add('t');
        letras.add('a');
        letras.add('n');
        letras.add('t');//no se añaden los repetidos
        System.out.println(letras);

        Set<Character> letrasenlazadas = new LinkedHashSet<>(); //respeta orden de insercion
        letrasenlazadas.add('z');
        letrasenlazadas.add('b');
        letrasenlazadas.add('g');

        System.out.println(letrasenlazadas.add('z'));
        System.out.println();
        System.out.println(letrasenlazadas);

        Set<Character>letrasorenadas = new TreeSet<>(); //te ordena el contenido
        letrasorenadas.add('v');
        letrasorenadas.add('n');
        letrasorenadas.add('b');
        letrasorenadas.add('p');

        System.out.println(letrasorenadas);
        letrasorenadas.remove('n');
        System.out.println();
        System.out.println(letrasorenadas);
    }
}


