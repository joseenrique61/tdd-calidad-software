import java.util.HashMap;
import java.util.Map;

public class GestorPuntos {
    private Map<String, Integer> jugadores = new HashMap<>();
    public Map<String, Integer> getJugadores() {
        return jugadores;
    }

    public GestorPuntos(Map<String, Integer> jugadores) {
        this.jugadores = jugadores;
    }

    private void crearJugadorSiNoExiste(String jugador) {
        if (!jugadores.containsKey(jugador)) {
            jugadores.put(jugador, 0);
        }
    }

    public void sumarPuntos(String jugador, int puntos) {
        crearJugadorSiNoExiste(jugador);
        jugadores.put(jugador, jugadores.get(jugador) + puntos);
    }

    public void restarPuntos(String jugador,int puntos){
        crearJugadorSiNoExiste(jugador);
        jugadores.put(jugador, jugadores.get(jugador) - puntos);
    }

    public int obtenerPuntos(String jugador){
        crearJugadorSiNoExiste(jugador);
        return jugadores.get(jugador);
    }

    public void resetearPuntos(String jugador){
        crearJugadorSiNoExiste(jugador);
        jugadores.put(jugador, 0);
    }
}