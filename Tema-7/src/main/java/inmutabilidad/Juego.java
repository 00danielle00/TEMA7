package inmutabilidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {
    private String nombre;
    private int nivel;
    private List<String> listaPersonajes;


    public Juego(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        listaPersonajes = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }
    public void anyadirPersonaje(String nombre){
        listaPersonajes.add(nombre);
    }

    public List<String> getListaPersonajes() {
        return Collections.unmodifiableList(listaPersonajes);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", listaPersonajes=" + listaPersonajes +
                '}';
    }
}
