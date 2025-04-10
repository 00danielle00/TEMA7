package lambda.Pokemon;

import lambda.Pokemon.Pokedex;

@FunctionalInterface
public interface Pokemon {

    void atacar(int nivel, Pokedex pokedex);

}
