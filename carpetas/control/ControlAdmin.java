package carpetas.control;

import carpetas.component.Pelicula;
import carpetas.component.Horario;
import carpetas.database.*;;

public class ControlAdmin {
    public void agregarPelicula(Pelicula p) {
        BaseDatos.peliculas.add(p);
    }

    public void agregarHorario(Horario h) {
        BaseDatos.horarios.add(h);
    }
}
