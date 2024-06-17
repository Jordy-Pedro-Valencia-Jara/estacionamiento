package grafica;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class espacio_a extends JPanel{
	espacio_a(){
		JLabel crono=new JLabel("Tiempo: ");
		JLabel tiempo=new JLabel("00:00:00");
		JLabel precio=new JLabel("Costo: ");
		JLabel pagar=new JLabel("0.00");
		JLabel Inicio=new JLabel("Inicio: ");
		JLabel Hini=new JLabel("00:00:00");
		JLabel Final=new JLabel("Final: ");
		JLabel HFin=new JLabel("00:00:00");
		this.setLayout(new GridLayout(4,2));
		this.add(Inicio);
		this.add(Hini);
		this.add(Final);
		this.add(HFin);
		this.add(crono);
		this.add(tiempo);
		this.add(precio);
		this.add(pagar);
	}
	}
	
