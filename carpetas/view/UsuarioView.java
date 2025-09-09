package carpetas.view;

import javax.swing.*;
import java.awt.event.*;
import carpetas.database.BaseDatos;
import carpetas.component.Pelicula;
import carpetas.component.Horario;
import carpetas.component.Ticket;
import carpetas.control.ControlUsuario;

public class UsuarioView extends JFrame {
    private JComboBox<Pelicula> cbPeliculas;
    private JComboBox<Horario> cbHorarios;
    private JTextField txtNombre;
    private ControlUsuario control = new ControlUsuario();

    public UsuarioView() {
        setTitle("Panel Usuario - Reservar Película");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Nombre del Usuario:"));
        txtNombre = new JTextField(20);
        panel.add(txtNombre);

        panel.add(new JLabel("Selecciona Película:"));
        cbPeliculas = new JComboBox<>(BaseDatos.peliculas.toArray(new Pelicula[0]));
        panel.add(cbPeliculas);

        panel.add(new JLabel("Selecciona Horario:"));
        cbHorarios = new JComboBox<>(BaseDatos.horarios.toArray(new Horario[0]));
        panel.add(cbHorarios);

        JButton btnReservar = new JButton("Reservar");
        btnReservar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pelicula p = (Pelicula) cbPeliculas.getSelectedItem();
                Horario h = (Horario) cbHorarios.getSelectedItem();
                String nombre = txtNombre.getText();

                Ticket ticket = control.reservar(nombre, p, h);
                dispose();
                new TicketView(ticket);
            }
        });

        panel.add(btnReservar);
        add(panel);
        setVisible(true);
    }
}
