package carpetas.view;

import carpetas.view.usuario.*;

import javax.swing.*;
import java.awt.*;

public class UsuarioView extends JFrame {

    private JPanel contentPanel;
    private CardLayout cardLayout;

    public UsuarioView() {
        setTitle("Cine Tenshi - Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);

        // === Menú lateral ===
        JPanel menuPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        menuPanel.setBackground(Color.DARK_GRAY);

        JButton btnProximamente = new JButton("🎥 Próximamente");
        JButton btnEstrenos = new JButton("✨ Estrenos");
        JButton btnActuales = new JButton("📺 Actuales");
        JButton btnAntiguas = new JButton("📼 Antiguas");

        JButton[] botones = { btnProximamente, btnEstrenos, btnActuales, btnAntiguas };
        for (JButton b : botones) {
            b.setFocusPainted(false);
            b.setBackground(Color.LIGHT_GRAY);
            menuPanel.add(b);
        }

        // === Contenido con CardLayout ===
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        contentPanel.add(new PanelProximamente(), "proximamente");
        contentPanel.add(new PanelEstrenos(), "estrenos");
        contentPanel.add(new PanelActuales(), "actuales");
        contentPanel.add(new PanelAntiguas(), "antiguas");

        // Acciones de botones
        btnProximamente.addActionListener(e -> cardLayout.show(contentPanel, "proximamente"));
        btnEstrenos.addActionListener(e -> cardLayout.show(contentPanel, "estrenos"));
        btnActuales.addActionListener(e -> cardLayout.show(contentPanel, "actuales"));
        btnAntiguas.addActionListener(e -> cardLayout.show(contentPanel, "antiguas"));

        // === Layout dividido ===
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuPanel, contentPanel);
        splitPane.setDividerLocation(200);

        add(splitPane);
        setVisible(true);
    }

}
