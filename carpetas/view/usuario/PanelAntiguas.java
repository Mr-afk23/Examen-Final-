package carpetas.view.usuario;

import javax.swing.*;
import java.awt.*;

public class PanelAntiguas extends JPanel {

    public PanelAntiguas() {
        setLayout(new GridLayout(1, 4, 10, 10));
        setBorder(BorderFactory.createTitledBorder("Antiguas"));

        String[][] peliculas = {
                { "Titanic", "Drama", "195 min" },
                { "Toy Story", "Animación", "80 min" },
                { "Matrix", "Ciencia Ficción", "140 min" },
                { "El Rey León", "Animación", "88 min" }
        };

        for (String[] peli : peliculas) {
            add(crearTarjeta(peli[0], peli[1], peli[2]));
        }
    }

    private JPanel crearTarjeta(String titulo, String genero, String duracion) {
        JPanel tarjeta = new JPanel(new BorderLayout());
        tarjeta.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        JPanel infoPanel = new JPanel(new GridLayout(3, 1));
        infoPanel.add(new JLabel(titulo, SwingConstants.CENTER));
        infoPanel.add(new JLabel(genero, SwingConstants.CENTER));
        infoPanel.add(new JLabel(duracion, SwingConstants.CENTER));

        tarjeta.add(infoPanel, BorderLayout.CENTER);
        return tarjeta;
    }
}
