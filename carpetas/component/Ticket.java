package carpetas.component;

import java.util.List;

public class Ticket {
    private Pelicula pelicula;
    private Horario horario;
    private String usuario;
    private List<String> asientos;

    public Ticket(Pelicula pelicula, Horario horario, String usuario, List<String> asientos) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.usuario = usuario;
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String generarTicket() {
        return "🎟️ Ticket de Cine\n" +
                "Cliente: " + usuario + "\n" +
                "Película: " + pelicula.getNombre() + "\n" +
                "Género: " + pelicula.getGenero() + "\n" +
                "Duración: " + pelicula.getDuracion() + "\n" +
                "Clasificación: " + pelicula.getClasificacion() + "\n" +
                "Horario: " + horario.getHora() + " | Sala: " + horario.getSala() + "\n" +
                "Asientos: " + String.join(", ", asientos);
    }
}
