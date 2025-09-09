package carpetas.view;


import javax.swing.*;
import carpetas.component.Ticket;

public class TicketView extends JFrame {
    public TicketView(Ticket ticket) {
        setTitle("🎟️ Ticket de Cine");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea(ticket.generarTicket());
        area.setEditable(false);

        add(new JScrollPane(area));
        setVisible(true);
    }
}
