package carpetas.control;

import carpetas.component.Pelicula;
import carpetas.component.Horario;
import carpetas.component.Ticket;
import java.util.List;

public class ControlUsuario {

    // Método para reservar una película con los asientos seleccionados
    public Ticket reservar(String nombreUsuario, Pelicula pelicula, Horario horario,
            List<String> asientosSeleccionados) {

        return new Ticket(pelicula, horario, nombreUsuario, asientosSeleccionados);
    }
}
