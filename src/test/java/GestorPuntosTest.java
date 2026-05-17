import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import java.util.HashMap;

public class GestorPuntosTest {
    @Test
    public void testAniadirPuntos() {
        Map<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 0);
        GestorPuntos gestorPuntos = new GestorPuntos(jugadores);
        gestorPuntos.sumarPuntos("jugador1", 10);

        assertTrue(gestorPuntos.getJugadores().get("jugador1") == 10);
    }
}