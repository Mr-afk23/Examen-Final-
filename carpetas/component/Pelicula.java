package carpetas.component;

public class Pelicula {
    private String titulo;
    private String genero;
    private String duracion;
    private String clasificacion;

    public Pelicula(String titulo, String genero, String duracion, String clasificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    // 🔹 Getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
