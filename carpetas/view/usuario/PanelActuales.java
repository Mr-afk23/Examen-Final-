package carpetas.view.usuario;

import javax.swing.*;
import java.awt.*;

public class PanelActuales extends JPanel {

    public PanelActuales() {
        setLayout(new GridLayout(1, 4, 10, 10));
        setBorder(BorderFactory.createTitledBorder("Actuales"));

        String[][] peliculas = {
                { "Avengers", "Acción", "150 min" },
                { "Mario Bros", "Animación", "95 min" },
                { "Top Gun Maverick", "Acción", "130 min" },
                { "Frozen II", "Animación", "103 min" }
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
