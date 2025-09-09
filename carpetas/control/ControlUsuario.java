package carpetas.control;

import carpetas.component.Pelicula;
import carpetas.component.Horario;
import carpetas.component.Ticket;

public class ControlUsuario {
    public Ticket reservar(String nombreUsuario, Pelicula p, Horario h) {
        return new Ticket(p, h, nombreUsuario);
    }
}
