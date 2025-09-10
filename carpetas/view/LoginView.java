package carpetas.view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {


    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnLogin;


    public LoginView() {
        setTitle("Cine Tensh");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

       //! Panel izquierdo 

       JPanel panelIzquierdo = new JPanel();
       panelIzquierdo.setLayout(new GridBagLayout());
       panelIzquierdo.setPreferredSize(new Dimension(200 , 500));
       panelIzquierdo.setBackground(new Color(240,230,250));

       JLabel lblBienvenida = new JLabel(
               "<html><center>Bienvenido<br>a mi<br>proyecto final<br><br>¿Quién está<br>iniciando sesión?</center></html>");
        lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        panelIzquierdo.add(lblBienvenida);

        //! Panel principal 

        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new GridBagLayout());
        panelLogin.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblUsuario = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelLogin.add(lblUsuario, gbc);

        txtUsuario = new JTextField(20);
        gbc.gridx = 1;
        panelLogin.add(txtUsuario, gbc);

        JLabel lblPassword = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelLogin.add(lblPassword, gbc);

        txtPassword = new JPasswordField(20);
        gbc.gridx = 1;
        panelLogin.add(txtPassword, gbc);

        btnLogin = new JButton("Iniciar sesión");
        btnLogin.setBackground(new Color(255, 180, 180));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(btnLogin, gbc);

        //! Panel Header 

        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(220, 190, 250));
        header.setPreferredSize(new Dimension(800, 40));

        JLabel lblTitulo = new JLabel("Cine Tenshi");
        lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        JLabel lblAutor = new JLabel("Icyrox");
        lblAutor.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblAutor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

        header.add(lblTitulo, BorderLayout.WEST);
        header.add(lblAutor, BorderLayout.EAST);

        //! Inicio de secion 

        btnLogin.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String pass = new String(txtPassword.getPassword());

            if (usuario.equals("admin") && pass.equals("1234")) {
                dispose(); // cerrar login
                new AdminView();
            } else if (usuario.equals("usuario") && pass.equals("abcd")) {
                dispose();
                new UsuarioView();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        });
        

        
    
        add(panelIzquierdo, BorderLayout.WEST);
        add(panelLogin, BorderLayout.CENTER);
        add(header, BorderLayout.NORTH);

        
        setVisible(true);
    }
}
