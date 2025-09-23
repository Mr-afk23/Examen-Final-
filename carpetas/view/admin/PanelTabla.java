package carpetas.view.admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import carpetas.component.Pelicula;

public class PanelTabla extends JPanel {

    public PanelTabla(String titulo, ArrayList<Pelicula> peliculas, String[] columnas) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(titulo, SwingConstants.CENTER);
        label.setAlignmentX(CENTER_ALIGNMENT);

        // Convertir ArrayList a Object[][]
        Object[][] datos = new Object[peliculas.size()][4];
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula p = peliculas.get(i);
            datos[i][0] = p.getNombre(); // ← cambio aquí
            datos[i][1] = p.getGenero();
            datos[i][2] = p.getDuracion();
            datos[i][3] = p.getClasificacion();
        }

        JTable table = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scrollPane = new JScrollPane(table);

        add(label);
        add(scrollPane);
    }
}
