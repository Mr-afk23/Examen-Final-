package carpetas.view;

import carpetas.view.admin.PanelTabla;
import carpetas.view.admin.FormularioPelicula;
import carpetas.view.admin.FormularioHorario;
import carpetas.database.BaseDatos;

import javax.swing.*;
import java.awt.*;

public class AdminView extends JFrame {

    private JPanel contentPanel;
    private CardLayout cardLayout;

    public AdminView() {
        setTitle("Panel de Admin - Cine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // pantalla completa

        // === Panel izquierdo (menú) ===
        JPanel menuPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        menuPanel.setBackground(Color.DARK_GRAY);

        JButton btnEstrenos = new JButton("🎬 Estrenos");
        JButton btnPrincipales = new JButton("⭐ Películas principales");
        JButton btnAntiguas = new JButton("📼 Películas antiguas");
        JButton btnAgregarPelicula = new JButton("➕ Agregar Película");
        JButton btnAgregarHorario = new JButton("⏰ Agregar Horario");

        JButton[] botones = { btnEstrenos, btnPrincipales, btnAntiguas, btnAgregarPelicula, btnAgregarHorario };
        for (JButton b : botones) {
            b.setFocusPainted(false);
            b.setBackground(Color.LIGHT_GRAY);
            menuPanel.add(b);
        }

        // === Panel derecho (CardLayout) ===
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Columnas para las tablas
        String[] columnas = { "Título", "Género", "Duración", "Clasificación" };

        // Agregar paneles con las listas de BaseDatos
        contentPanel.add(new PanelTabla("Lista de Estrenos", BaseDatos.estrenos, columnas), "estrenos");
        contentPanel.add(new PanelTabla("Películas Principales", BaseDatos.principales, columnas), "principales");
        contentPanel.add(new PanelTabla("Películas Antiguas", BaseDatos.antiguas, columnas), "antiguas");
        contentPanel.add(new FormularioPelicula(), "agregarPelicula");
        contentPanel.add(new FormularioHorario(), "agregarHorario");

        // Conectar botones con el CardLayout
        btnEstrenos.addActionListener(e -> cardLayout.show(contentPanel, "estrenos"));
        btnPrincipales.addActionListener(e -> cardLayout.show(contentPanel, "principales"));
        btnAntiguas.addActionListener(e -> cardLayout.show(contentPanel, "antiguas"));
        btnAgregarPelicula.addActionListener(e -> cardLayout.show(contentPanel, "agregarPelicula"));
        btnAgregarHorario.addActionListener(e -> cardLayout.show(contentPanel, "agregarHorario"));

        // === SplitPane (menú + contenido) ===
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuPanel, contentPanel);
        add(splitPane);

        // Ajustar tamaño del divider después de mostrar ventana
        SwingUtilities.invokeLater(() -> splitPane.setDividerLocation(200));

        setVisible(true); // mostrar ventana
    }
}
