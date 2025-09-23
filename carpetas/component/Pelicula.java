package carpetas.component;

public class Pelicula {
    private String nombre;
    private String genero;
    private String duracion;
    private String clasificacion;

    // Constructor
    public Pelicula(String nombre, String genero, String duracion, String clasificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
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
}
