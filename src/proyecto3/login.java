package proyecto3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.*;


public class login {

	JFrame inicio = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel("");
	JLabel l2 = new JLabel("");
	JTextField t1 = new JTextField ();
	JPasswordField t2 = new JPasswordField ();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	
	public void frame() {
		inicio.setTitle("Iniciar Sesión");
		inicio.setLocationRelativeTo(null);
		
		//                x   y  anch0-alto
		inicio.setBounds(600,200,330,370);
		inicio.setVisible(true);
		p1.setBounds(600,200,350,350);
		p1.setLayout(null);
		inicio.add(p1);
		
	}
	
	
	public void etiquetas() {
		//etiquetas
		l1.setText("Usuario:");
		l1.setBounds(20,70,90,80);
		l1.setFont(new Font("Serig", Font.PLAIN, 15));
		l1.setVisible(true);
		p1.add(l1);
		
		
		l2.setText("Contraseña:");
		l2.setFont(new Font("Serig", Font.PLAIN, 15));
		l2.setBounds(20,140,110,80);
		l2.setVisible(true);
		p1.add(l2);
		
		
		JLabel etiqueta2 = new JLabel(new ImageIcon("hoteles.png"));
		etiqueta2.setBounds(75,30,157,62);
		p1.add(etiqueta2);
		
	}
	public void textfiel() {
	//textfield
			t1.setBounds(20,130,280,35);
			t2.setBounds(20,200,280,35);
			t1.setVisible(true);
			t2.setVisible(true);
			p1.add(t1);
			p1.add(t2);
	}
	
	public void botones () {
		
		//INGRESAR
		b1.setText("Iniciar Sesión");
		b1.setBounds(80,250,160,40);
		p1.add(b1);
		
		// Funcionalidad
				ActionListener ingresar = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						if (t1.getText().equals("Jonathan") && t2.getText().equals("FenixJHM223")) {
							JOptionPane.showMessageDialog(null, "Bienvenido");
							inicio.setVisible(false);
							
							Menu_Principal mp = new Menu_Principal();
							
							mp.ejecutar();
							
						}
						

					}
				};

				// Acción del evento
				b1.addActionListener(ingresar);
		
		
	}
	
	public void ejecutar() {
		frame();
		etiquetas();
		textfiel();
		botones();
		
	}
	
	public static void main(String[] args) {
		login p1 = new login();
		p1.ejecutar();
	}
}
