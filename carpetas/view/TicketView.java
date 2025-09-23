package carpetas.view;

import carpetas.component.Ticket;
import javax.swing.*;
import java.awt.*;

public class TicketView extends JFrame {

    public TicketView(Ticket ticket) {
        setTitle("Ticket - " + ticket.getPelicula().getNombre());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea txtTicket = new JTextArea(ticket.generarTicket());
        txtTicket.setEditable(false);
        txtTicket.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(txtTicket, BorderLayout.CENTER);
    }
}
