package inmutabilidad;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        Juego pokemon = new Juego("Pokeman plata",100);
        pokemon.anyadirPersonaje("pep");
        pokemon.anyadirPersonaje("clock");


//        listapokemon.add("pokachu");
//        listapokemon.add("Squirtle");
//        listapokemon.add("Charmander");

        System.out.println(pokemon);








    }
}
