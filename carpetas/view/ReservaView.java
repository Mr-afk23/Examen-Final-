package carpetas.view;

import carpetas.component.Pelicula;
import carpetas.component.Ticket;
import carpetas.component.Horario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaView extends JFrame {
    private Pelicula pelicula;
    private List<String> asientosSeleccionados = new ArrayList<>();

    public ReservaView(Pelicula pelicula) {
        this.pelicula = pelicula;
        setTitle("Reservar - " + pelicula.getNombre());
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Reserva para: " + pelicula.getNombre(), SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(lblTitulo, BorderLayout.NORTH);

        // Panel central con formulario + asientos
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());

        // Formulario usuario
        JPanel panelFormulario = new JPanel(new GridLayout(0, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del usuario"));

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();
        panelFormulario.add(lblNombre);
        panelFormulario.add(txtNombre);

        JLabel lblHorario = new JLabel("Horario:");
        JComboBox<String> comboHorario = new JComboBox<>(new String[] { "12:00", "15:00", "18:00", "21:00" });
        panelFormulario.add(lblHorario);
        panelFormulario.add(comboHorario);

        panelCentral.add(panelFormulario, BorderLayout.NORTH);

        // Panel de asientos
        JPanel panelAsientos = new JPanel(new GridLayout(5, 5, 5, 5));
        for (int i = 1; i <= 25; i++) {
            JButton btnAsiento = new JButton(String.valueOf(i));
            btnAsiento.setBackground(Color.GREEN);
            btnAsiento.addActionListener(e -> {
                if (btnAsiento.getBackground() == Color.GREEN) {
                    btnAsiento.setBackground(Color.RED);
                    asientosSeleccionados.add(btnAsiento.getText());
                } else {
                    btnAsiento.setBackground(Color.GREEN);
                    asientosSeleccionados.remove(btnAsiento.getText());
                }
            });
            panelAsientos.add(btnAsiento);
        }

        panelCentral.add(panelAsientos, BorderLayout.CENTER);
        add(panelCentral, BorderLayout.CENTER);

        // Botón confirmar
        JButton btnConfirmar = new JButton("Confirmar Reserva");
        add(btnConfirmar, BorderLayout.SOUTH);

        btnConfirmar.addActionListener(e -> {
            String nombreUsuario = txtNombre.getText().trim();
            if (nombreUsuario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingresa tu nombre.");
                return;
            }

            // Crear horario
            Horario horario = new Horario((String) comboHorario.getSelectedItem(), "Sala 1");

            // Crear ticket
            Ticket ticket = new Ticket(pelicula, horario, nombreUsuario, asientosSeleccionados);
            new TicketView(ticket).setVisible(true);
            dispose();
        });
    }
}
