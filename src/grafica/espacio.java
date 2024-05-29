package grafica;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.TimerTask;

import estacionamiento.tiempo;
public class espacio extends JFrame {
	Timer timer;
	TimerTask task;
	tiempo time=new tiempo();
	tiempo inicio=new tiempo();
	tiempo fin= new tiempo();
	int count=0;
	private JTextField textField;
	private JPasswordField passwordField;
	int cont=0;
	JLabel crono=new JLabel("Tiempo: ");
	JLabel tiempo=new JLabel("00:00:00");
	JLabel precio=new JLabel("Costo: ");
	JLabel pagar=new JLabel("0.00");
	JLabel Inicio=new JLabel("Inicio: ");
	JLabel Hini=new JLabel("00:00:00");
	JLabel Final=new JLabel("Final: ");
	JLabel HFin=new JLabel("00:00:00");


	
	public espacio(){
		timer=new Timer(1000,acciones);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Espacio "+cont);
		getContentPane().setLayout(null);
		this.setSize(424,394);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBounds(8, 8, 396, 343);
		getContentPane().add(panel);
		
		//panel.setBackground(Color.black);
		//panel.setLayout(null);
		crono.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		tiempo.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		precio.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		pagar.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		Inicio.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		Hini.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		Final.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		HFin.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		panel.add(crono);
		panel.add(tiempo);
		panel.add(precio);
		panel.add(pagar);
		panel.add(Inicio);
		panel.add(Hini);
		panel.add(Final);
		panel.add(HFin);
		JButton btnNewButton = new JButton("Iniciar");
		JButton btnNewButton1 = new JButton("continuar");
		JButton terminar=new JButton("Terminar");
		btnNewButton.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 29));
		btnNewButton1.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hini.setText(inicio.actual().dftoString());
				timer.start();
			}
		});
		terminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HFin.setText(fin.actual().dftoString());
				timer.stop();
			}
		});
		panel.add(btnNewButton);
		panel.add(btnNewButton1);
		panel.add(terminar);
		this.setResizable(false);
		this.setVisible(true);
		
	}	public  ActionListener acciones =new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			time.aumentar();
			tiempo.setText(time.dftoString());
			
		}
	};
	public static void main (String[]args) {
		new espacio();
	}
}
