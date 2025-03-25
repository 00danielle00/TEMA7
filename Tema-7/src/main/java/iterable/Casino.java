package iterable;

public class Casino {
    private String juego;
    private double apuesta_minima;

    public Casino(String juego, double apuesta_minima) {
        this.juego = juego;
        this.apuesta_minima = apuesta_minima;
    }

    public String getJuego() {
        return juego;
    }

    public double getApuesta_minima() {
        return apuesta_minima;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "juego='" + juego + '\'' +
                ", apuesta_minima=" + apuesta_minima +
                '}';
    }
}
