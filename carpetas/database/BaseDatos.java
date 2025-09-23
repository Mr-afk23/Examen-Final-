package carpetas.database;

import java.util.ArrayList;
import carpetas.component.Pelicula;
import carpetas.component.Horario;

public class BaseDatos {
    public static ArrayList<Pelicula> estrenos = new ArrayList<>();
    public static ArrayList<Pelicula> principales = new ArrayList<>();
    public static ArrayList<Pelicula> antiguas = new ArrayList<>();
    public static ArrayList<Horario> horarios = new ArrayList<>();

    static {
        // Estrenos (10)
        estrenos.add(new Pelicula("Avengers", "Acción", "2h30m", "PG-13"));
        estrenos.add(new Pelicula("Inside Out 2", "Animación", "1h40m", "TP"));
        estrenos.add(new Pelicula("Oppenheimer", "Drama/Histórico", "3h00m", "+16"));
        estrenos.add(new Pelicula("Barbie", "Comedia/Fantasía", "1h55m", "TP"));
        estrenos.add(new Pelicula("Dune: Parte 2", "Ciencia Ficción", "2h46m", "PG-13"));
        estrenos.add(new Pelicula("Spider-Man: Across the Spider-Verse", "Animación/Acción", "2h20m", "PG"));
        estrenos.add(new Pelicula("Godzilla x Kong", "Acción/Fantasía", "1h55m", "PG-13"));
        estrenos.add(new Pelicula("The Batman", "Acción/Crimen", "2h56m", "PG-13"));
        estrenos.add(new Pelicula("Doctor Strange in the Multiverse of Madness", "Acción/Fantasía", "2h06m", "PG-13"));
        estrenos.add(new Pelicula("Frozen II", "Animación/Fantasía", "1h43m", "TP"));

        // Principales (10)
        principales.add(new Pelicula("Gladiador", "Acción/Drama", "2h50m", "+16"));
        principales.add(new Pelicula("Deadpool", "Acción/Comedia", "2h05m", "+18"));
        principales.add(new Pelicula("Avatar", "Ciencia Ficción", "2h42m", "PG-13"));
        principales.add(new Pelicula("Joker", "Drama/Crimen", "2h02m", "+18"));
        principales.add(new Pelicula("Inception", "Ciencia Ficción/Acción", "2h28m", "PG-13"));
        principales.add(new Pelicula("The Dark Knight", "Acción/Drama", "2h32m", "PG-13"));
        principales.add(new Pelicula("Avengers: Endgame", "Acción/Ciencia Ficción", "3h01m", "PG-13"));
        principales.add(new Pelicula("Black Panther", "Acción/Aventura", "2h14m", "PG-13"));
        principales.add(new Pelicula("The Matrix", "Ciencia Ficción/Acción", "2h16m", "R"));
        principales.add(new Pelicula("Interstellar", "Ciencia Ficción/Drama", "2h49m", "PG-13"));

        // Antiguas (10)
        antiguas.add(new Pelicula("Titanic", "Drama", "3h15m", "PG-13"));
        antiguas.add(new Pelicula("El Padrino", "Crimen", "2h55m", "+18"));
        antiguas.add(new Pelicula("Forrest Gump", "Drama/Romance", "2h22m", "PG-13"));
        antiguas.add(new Pelicula("Volver al Futuro", "Ciencia Ficción/Aventura", "1h56m", "PG"));
        antiguas.add(new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", "Fantasía/Aventura", "2h58m",
                "PG-13"));
        antiguas.add(new Pelicula("Jurassic Park", "Ciencia Ficción/Aventura", "2h07m", "PG-13"));
        antiguas.add(new Pelicula("Rocky", "Deporte/Drama", "2h00m", "PG"));
        antiguas.add(new Pelicula("Star Wars: Episodio IV - Una Nueva Esperanza", "Ciencia Ficción/Aventura", "2h01m",
                "PG"));
        antiguas.add(new Pelicula("El Exorcista", "Terror", "2h12m", "R"));
        antiguas.add(new Pelicula("Psicosis", "Suspenso/Terror", "1h49m", "R"));

        horarios.add(new Horario("14:00", "Sala 1"));
        horarios.add(new Horario("18:00", "Sala 2"));
    }
}
