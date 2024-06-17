package grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class grafica extends JFrame{
    JPanel inicio;
    JPanel panel = new JPanel();
    JPanel panel_1 = new JPanel();

    grafica(){
        this.setTitle("Estacionamiento");
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel.setBackground(new Color(127, 255, 212));
        panel.setBounds(10, 10, 966, 563);
        panel.setLayout(new FlowLayout()); // Establece el layout a null
        getContentPane().add(panel);

        panel_1.setBackground(new Color(72, 209, 204));
        panel_1.setBounds(10, 583, 966, 170);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JButton Agregar = new JButton("AGREGAR");
        Agregar.setForeground(new Color(0, 128, 0));
        Agregar.setBackground(Color.CYAN);
        Agregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                espacio1 nuevoPanel = new espacio1();
                nuevoPanel.setBounds(10, 10 + (210 * panel.getComponentCount()), 200, 200);
                panel.add(nuevoPanel);
                Agregar.setText("Hola");
                panel.revalidate();
                panel.repaint();
            }
        });
        Agregar.setBounds(10, 10, 200, 53);
        panel_1.add(Agregar);
    }

    public static void main(String[] args) {
        new grafica();
    }
}