package carpetas.component;

public class Horario {
    private String hora;
    private String sala;

    public Horario(String hora, String sala) {
        this.hora = hora;
        this.sala = sala;
    }

    // 🔹 Getters
    public String getHora() {
        return hora;
    }

    public String getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return hora + " - " + sala;
    }
}
