package grafica;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import estacionamiento.tiempo;

public class espacio1 extends JPanel {
    public espacio1() {
    	espacio_a superior=new espacio_a();
    	Timer timer;
    	TimerTask task;
    	tiempo time=new tiempo();
    	tiempo inicio=new tiempo();
    	tiempo fin= new tiempo();
    	int count=0;
    	int cont=0;
    	this.setLayout(new GridLayout(2,1));
    	this.add(superior);
        // Establecer un tamaño preferido para cada espacio1 para que no se vean demasiado pequeños
        this.setPreferredSize(new Dimension(200, 200)); 
    }
}