import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class GestorPuntosTest {
    @Test
    public void testAniadirPuntos() {
        Map<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 0);
        GestorPuntos gestorPuntos = new GestorPuntos(jugadores);
        gestorPuntos.sumarPuntos("jugador1", 10);

        assertTrue(gestorPuntos.getJugadores().get("jugador1") == 10);
    }
    @Test
    public void testRestarPuntos(){
        Map<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);
        GestorPuntos gestorPuntos = new GestorPuntos(jugadores);
        gestorPuntos.restarPuntos("jugador1",4);
        assertTrue(gestorPuntos.getJugadores().get("jugador1")==6);
    }

    @Test
    public void testConsultarJugador(){
    Map<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);
        GestorPuntos gestorPuntos = new GestorPuntos(jugadores);
        assertTrue(gestorPuntos.obtenerPuntos("jugador1")==10);
    }

    @Test
    public void testResetearPuntos(){
        Map<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);
        GestorPuntos gestorPuntos = new GestorPuntos(jugadores);
        gestorPuntos.resetearPuntos("jugador1");
        assertTrue(gestorPuntos.obtenerPuntos("jugador1")==0);
    }

    @Test
    public void testAniadirPuntosAUsuarioInexistente() {
        Map<String, Integer> jugadores = new HashMap<>();
        GestorPuntos gestorPuntos = new GestorPuntos(jugadores);
        gestorPuntos.sumarPuntos("jugador1", 10);
        
        assertTrue(gestorPuntos.obtenerPuntos("jugador1")==10);
    }
}