package grafica;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	public inicio() {
		setTitle("Estacionamiento");
		getContentPane().setLayout(null);
		this.setSize(424,394);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 396, 343);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario : ");
		lblNewLabel.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		lblNewLabel.setBounds(10, 97, 117, 38);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 26));
		textField.setBounds(148, 107, 218, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña :");
		lblContrasea.setFont(new Font("Swis721 WGL4 BT", Font.ITALIC, 25));
		lblContrasea.setBounds(10, 181, 154, 38);
		panel.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 26));
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBounds(160, 191, 206, 32);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new grafica();
				dispose();
			}
		});
		btnNewButton.setBounds(113, 264, 163, 50);
		panel.add(btnNewButton);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
