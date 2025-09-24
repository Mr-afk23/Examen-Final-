package carpetas.view.usuario;

import carpetas.component.Pelicula;
import carpetas.view.ReservaView;
import javax.swing.*;
import java.awt.*;

public class PanelAntiguas extends JPanel {

    public PanelAntiguas() {
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("🎞 Películas Antiguas", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        add(lblTitulo, BorderLayout.NORTH);

        // Lista de películas (cada array: {titulo, genero, duracion, rutaImagen})
        Object[][] antiguas = {
                { "Titanic", "Drama", "195 min", "assets/avatar2.jpeg" }, // ⚠️ no tienes titanic, usamos avatar2 como
                                                                          // demo
                { "Toy Story", "Animación", "80 min", "assets/buzz.jpeg" }, // ⚠️ tampoco toy story, usamos buzz
                { "Matrix", "Ciencia Ficción", "140 min", "assets/nope.jpeg" }, // ⚠️ no tienes matrix, usamos nope
                { "El Rey León", "Animación", "88 min", "assets/sonic.jpeg" } // ⚠️ no tienes rey león, usamos sonic
        };

        // Panel con FlowLayout para que las tarjetas se acomoden automáticamente
        JPanel grid = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));

        for (Object[] pelicula : antiguas) {
            grid.add(crearCard((String) pelicula[0], (String) pelicula[1], (String) pelicula[2], (String) pelicula[3]));
        }

        // Scrollpane vertical
        JScrollPane scroll = new JScrollPane(grid);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        add(scroll, BorderLayout.CENTER);
    }

    private JPanel crearCard(String titulo, String genero, String duracion, String rutaImagen) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        card.setPreferredSize(new Dimension(200, 350));

        // Imagen
        JLabel lblImagen;
        try {
            ImageIcon icon = new ImageIcon(rutaImagen);
            Image img = icon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
            lblImagen = new JLabel(new ImageIcon(img));
        } catch (Exception e) {
            lblImagen = new JLabel("Sin imagen", SwingConstants.CENTER);
        }
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        card.add(lblImagen, BorderLayout.CENTER);

        // Info
        JPanel infoPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        infoPanel.add(new JLabel("🎬 " + titulo));
        infoPanel.add(new JLabel("📂 Género: " + genero));
        infoPanel.add(new JLabel("⏱ Duración: " + duracion));

        // Botón Reservar
        JButton btnReservar = new JButton("Reservar");
        btnReservar.addActionListener(e -> {
            Pelicula p = new Pelicula(titulo, genero, duracion, "");
            new ReservaView(p).setVisible(true);
        });
        infoPanel.add(btnReservar);

        card.add(infoPanel, BorderLayout.SOUTH);

        return card;
    }
}
