package lambda.Pokemon;

public class Pokedex {

    private String pokemon;
    private Integer entrenadores;

    public Pokedex(String pokemon, int entrenadores) {
        this.pokemon = pokemon;
        this.entrenadores = entrenadores;
    }

    public Integer getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Integer entrenadores) {
        this.entrenadores = entrenadores;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }
}
