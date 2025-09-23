package carpetas.view.admin;

import javax.swing.*;

public class FormularioPelicula extends JPanel {

    public JTextField txtTitulo;
    public JComboBox<String> cbGenero;
    public JSpinner spDuracion;
    public JComboBox<String> cbClasificacion;
    public JButton btnGuardar;

    public FormularioPelicula() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        txtTitulo = new JTextField();
        cbGenero = new JComboBox<>(new String[] { "Acción", "Comedia", "Drama", "Animación" });
        spDuracion = new JSpinner(new SpinnerNumberModel(120, 30, 300, 10));
        cbClasificacion = new JComboBox<>(new String[] { "TP", "PG-13", "18+" });
        btnGuardar = new JButton("Guardar Película");

        add(new JLabel("Título:"));
        add(txtTitulo);
        add(new JLabel("Género:"));
        add(cbGenero);
        add(new JLabel("Duración (min):"));
        add(spDuracion);
        add(new JLabel("Clasificación:"));
        add(cbClasificacion);
        add(btnGuardar);

        // Acción del botón
        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "🎬 Película guardada correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
