package carpetas.view;

import javax.swing.*;
import java.awt.event.*;
import carpetas.component.Pelicula;
import carpetas.component.Horario;
import carpetas.control.*;

public class AdminView extends JFrame {

    private JTextField txtTitulo, txtGenero, txtDuracion, txtClasificacion;
    private JTextField txtHora, txtSala;

    private ControlAdmin control = new ControlAdmin();

    public AdminView() {
        setTitle("Panel de Admin - Cine");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // --- Formulario Película ---
        panel.add(new JLabel("Título:"));
        txtTitulo = new JTextField(20);
        panel.add(txtTitulo);

        panel.add(new JLabel("Género:"));
        txtGenero = new JTextField(20);
        panel.add(txtGenero);

        panel.add(new JLabel("Duración:"));
        txtDuracion = new JTextField(20);
        panel.add(txtDuracion);

        panel.add(new JLabel("Clasificación:"));
        txtClasificacion = new JTextField(20);
        panel.add(txtClasificacion);

        JButton btnAddPelicula = new JButton("Agregar Película");
        btnAddPelicula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pelicula p = new Pelicula(
                        txtTitulo.getText(),
                        txtGenero.getText(),
                        txtDuracion.getText(),
                        txtClasificacion.getText());
                        control.agregarPelicula(p);
                JOptionPane.showMessageDialog(null, "Película agregada con éxito");
            }
        });
        panel.add(btnAddPelicula);

        // --- Formulario Horario ---
        panel.add(new JLabel("Hora:"));
        txtHora = new JTextField(20);
        panel.add(txtHora);

        panel.add(new JLabel("Sala:"));
        txtSala = new JTextField(20);
        panel.add(txtSala);

        JButton btnAddHorario = new JButton("Agregar Horario");
        btnAddHorario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Horario h = new Horario(txtHora.getText(), txtSala.getText());
                control.agregarHorario(h);
                JOptionPane.showMessageDialog(null, "Horario agregado con éxito");
            }
        });
        panel.add(btnAddHorario);

        add(panel);
        setVisible(true);
    }
}
