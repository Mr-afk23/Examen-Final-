package carpetas.view.admin;

import javax.swing.*;

public class FormularioHorario extends JPanel {

    public JTextField txtHora;
    public JComboBox<String> cbSala;
    public JButton btnGuardar;

    public FormularioHorario() {
        // Establecer layout vertical
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Crear componentes
        txtHora = new JTextField("HH:mm");
        cbSala = new JComboBox<>(new String[] { "Sala 1", "Sala 2", "Sala 3" });
        btnGuardar = new JButton("Guardar Horario");

        // Agregar componentes al panel
        add(new JLabel("Hora:"));
        add(txtHora);

        add(new JLabel("Sala:"));
        add(cbSala);

        add(btnGuardar);

        // Acción del botón
        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "🕒 Horario guardado correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
