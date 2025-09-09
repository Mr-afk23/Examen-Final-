package carpetas.component;

public class Ticket {
    private Pelicula pelicula;
    private Horario horario;
    private String usuario;

    public Ticket(Pelicula pelicula, Horario horario, String usuario) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.usuario = usuario;
    }

    public String generarTicket() {
        return "🎟️ Ticket de Cine\n" +
                "Cliente: " + usuario + "\n" +
                "Pelicula: " + pelicula.getTitulo() + "\n" +
                "Genero: " + pelicula.getGenero() + "\n" +
                "Duración: " + pelicula.getDuracion() + "\n" +
                "Clasificación: " + pelicula.getClasificacion() + "\n" +
                "Horario: " + horario.getHora() + " | Sala: " + horario.getSala();
    }
}
