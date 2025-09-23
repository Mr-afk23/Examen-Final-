package carpetas.control;

import carpetas.component.Pelicula;
import carpetas.component.Horario;
import carpetas.database.BaseDatos;

public class ControlAdmin {

    public void agregarPelicula(Pelicula p, String categoria) {
        switch (categoria.toLowerCase()) {
            case "estrenos":
                BaseDatos.estrenos.add(p);
                break;
            case "principales":
                BaseDatos.principales.add(p);
                break;
            case "antiguas":
                BaseDatos.antiguas.add(p);
                break;
            default:
                System.out.println("⚠️ Categoría desconocida: " + categoria);
        }
    }

    public void agregarHorario(Horario h) {
        BaseDatos.horarios.add(h);
    }
}
