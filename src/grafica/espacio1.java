package grafica;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class espacio1 extends JPanel {
    public espacio1() {
        this.setBorder(BorderFactory.createTitledBorder("Hola"));
        // Establecer un tamaño preferido para cada espacio1 para que no se vean demasiado pequeños
        this.setPreferredSize(new Dimension(200, 200)); 
    }
}