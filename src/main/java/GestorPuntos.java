import java.util.Map;
import java.util.HashMap;

public class GestorPuntos {
    private Map<String, Integer> jugadores = new HashMap<>();
    public Map<String, Integer> getJugadores() {
        return jugadores;
    }

    public GestorPuntos(Map<String, Integer> jugadores) {
        this.jugadores = jugadores;
    }

    public void sumarPuntos(String jugador, int puntos) {
        jugadores.put(jugador, jugadores.get(jugador) + puntos);
    }
}