package colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {
    public static void main(String[] args) {
        Queue<String> playlist = new LinkedList<>();
        playlist.offer("Mirrors - Justin Timberlake");
        playlist.offer("Toxic - Britney Spears");
        playlist.offer("Clavaito - Channel");
        playlist.offer("La Reina - La Reina");

        System.out.println("Estado inicial de la playlist "+playlist);

        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo "+playlist.poll());
            System.out.println("Estado de la playlist despues de reproducir la canción "+playlist);
        }

        System.out.println("La playlist ha terminado");
    }
}
