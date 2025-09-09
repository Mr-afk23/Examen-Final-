package carpetas.database;

import java.util.ArrayList;
import carpetas.component.Pelicula;
import carpetas.component.Horario;

public class BaseDatos {
    public static ArrayList<Pelicula> peliculas = new ArrayList<>();
    public static ArrayList<Horario> horarios = new ArrayList<>();

    static {
        // Películas de ejemplo
        peliculas.add(new Pelicula("Avengers", "Acción", "2h30m", "PG-13"));
        peliculas.add(new Pelicula("Toy Story", "Animación", "1h45m", "Todo público"));

        // Horarios de ejemplo
        horarios.add(new Horario("14:00", "Sala 1"));
        horarios.add(new Horario("18:00", "Sala 2"));
    }
}
