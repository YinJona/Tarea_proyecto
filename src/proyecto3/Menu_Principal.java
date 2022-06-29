package proyecto3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Menu_Principal {

	JFrame principal = new JFrame();
	JTabbedPane Pestañas = new JTabbedPane();
	
	JPanel Inicio = new JPanel();
	
	funciones FM = new funciones();
	
	
	
	public void valor() {
	
				//frame
				principal.setTitle("Hoteles GT-Usuarios");
				principal.setLocationRelativeTo(null);
				// x y anch0-alto
				principal.setBounds(300,100,900,700);
				principal.setVisible(true);
				JButton cerrar = new JButton ("SALIR");
				cerrar.setBackground(Color.red);
				cerrar.setForeground(Color.white);
				cerrar.setBounds(150,1,110,50);
				
				
				ActionListener funcion_cerrar = new ActionListener() {

					 @Override
					 public void actionPerformed(ActionEvent e) {

						 System.exit(0);
					 
					 	}
					};

					 // Acción del evento
					cerrar.addActionListener(funcion_cerrar);
					
				principal.add(FM.Agregar);
				principal.add(cerrar);
				principal.add(Pestañas);
				
				Inicio.setLayout(null);
				Pestañas.addTab("Inicio", Inicio);
				
				//funciones
				
				FM.ejecutar();
				
				Inicio.add(FM.Eliminar);
				Inicio.add(FM.Modificar);
				Inicio.add(FM.SP);
				
}
	
	public void ejecutar() {
		
		valor();
	}
	
	//public static void main(String[] args) throws ClassNotFoundException {
	
	//Menu_Principal menu = new Menu_Principal();
	//menu.valor();
	
	//}
}

