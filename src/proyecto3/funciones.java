package proyecto3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class funciones {
	
	//BOTONES
		JButton Agregar = new JButton();
		JButton Modificar = new JButton();
		JButton Eliminar = new JButton();
		
		
		
		Object [] [] funciones = new Object [30][7];
		Object []Objetos = new Object [30];
		
		JTable tabla = new JTable();
		JScrollPane SP = new JScrollPane();

		
		private void botones() {
			
			Agregar.setText("Agregar Usuario");
			Agregar.setBounds(1,1,150,50);
			
			//Funcion 
			
			ActionListener funcion_agregar = new ActionListener() {

					@Override
	 				public void actionPerformed(ActionEvent e) {

		 			agregar();
	 
	 				}
				};

	 		// Acción del evento
			Agregar.addActionListener(funcion_agregar);
			
			Modificar.setText("Modificar Usuario");
			Modificar.setBounds(240,500,145,50);
			
			//Funcion crear
			
			ActionListener funcion_modificar = new ActionListener() {

					@Override
	 				public void actionPerformed(ActionEvent e) {

		 			modificar();
	 
	 				}
				};

	 		// Acción del evento
			Modificar.addActionListener(funcion_modificar);
			
			Eliminar.setText("Eliminar Usuario");
			Eliminar.setBounds(490,500,145,50);
			
				//Funcion 		
			
			ActionListener funcion_eliminar = new ActionListener() {

					@Override
	 				public void actionPerformed(ActionEvent e) {

		 			eliminar();
	 
	 				}
				};

	 		// Acción del evento
			Eliminar.addActionListener(funcion_eliminar );
		}
		
		private void tabla () {
			
			String []datos = {"No.", "Nombre", "Apellido", "Rol", "Correo", "Teléfono"};
			funciones[0][0]= 1;
			funciones[0][1]= "Jonathan";
			funciones[0][2]= "Gaitan";
			funciones[0][3]= 2;
			funciones[0][4]= "asdgay@gmail.com";
			funciones[0][5]= 16267167;
			
			
			tabla = new JTable(funciones, datos);
			SP = new JScrollPane(tabla);
			SP.setBounds(40,120,800,300);
		}
		
		
		
private void agregar() {
			
			JFrame crear = new JFrame();
			JPanel p1 = new JPanel();
			
			//etiquetas
			JLabel l1 = new JLabel();
			JLabel l2 = new JLabel();
			JLabel l3 = new JLabel();
			JLabel l4 = new JLabel();
			JLabel l5 = new JLabel();
			JLabel l6 = new JLabel();
			JLabel l7 = new JLabel();
			p1.setLayout(null);
			
			//textos
			JTextField t1 = new JTextField();
			JTextField t2 = new JTextField();
			JTextField t3 = new JTextField();
			JTextField t4 = new JTextField();
			JTextField t5 = new JTextField();
			JPasswordField t6 = new JPasswordField();
			JTextField t7 = new JTextField();
			
			//boton
			JButton b1 = new JButton();
			JButton b2 = new JButton();
			
			l1.setText("Nombre:");
			l1.setBounds(50,25,90,80);
			l1.setFont(new Font("Serig", Font.PLAIN, 15));
			l1.setVisible(true);
			p1.add(l1);
			
			l2.setText("Apellido:");
			l2.setBounds(50,105,180,80);
			l2.setFont(new Font("Serig", Font.PLAIN, 15));
			l2.setVisible(true);
			p1.add(l2);
			
			l3.setText("Teléfono:");
			l3.setBounds(50,195,180,80);
			l3.setFont(new Font("Serig", Font.PLAIN, 15));
			l3.setVisible(true);
			p1.add(l3);
			
			l4.setText("Direccion:");
			l4.setBounds(50,285,100,80);
			l4.setFont(new Font("Serig", Font.PLAIN, 15));
			l4.setVisible(true);
			p1.add(l4);
			
			l5.setText("Correo:");
			l5.setBounds(50,375,90,80);
			l5.setFont(new Font("Serig", Font.PLAIN, 15));
			l5.setVisible(true);
			p1.add(l5);
			
			l7.setText("FechaNacimiento:");
			l7.setBounds(50,445,150,80);
			l7.setFont(new Font("Serig", Font.PLAIN, 15));
			l7.setVisible(true);
			p1.add(l7);
			
			l6.setText("Contraseña:");
			l6.setBounds(50,510,90,80);
			l6.setFont(new Font("Serig", Font.PLAIN, 15));
			l6.setVisible(true);
			p1.add(l6);
			
			
			crear.setTitle("Agregar");
			crear.setLocationRelativeTo(null);
			crear.setBounds(500,100,500,700);
			crear.setVisible(true);
			crear.add(p1);
			
			t1.setBounds(250,40,200,40);
			t2.setBounds(250,120,200,40);
			t3.setBounds(250,210,200,40);
			t4.setBounds(250,300,200,40);
			t5.setBounds(250,390,200,40);
			t6.setBounds(250,530,200,40);
			t7.setBounds(250,460,200,40);
			
			p1.add(t1);
			p1.add(t2);
			p1.add(t3);
			p1.add(t4);
			p1.add(t5);
			p1.add(t6);
			p1.add(t7);
			
			
			b1.setText("GUARDAR");
			b1.setBounds(90,590,140,40);
			p1.add(b1);
			
			ActionListener guardar = new ActionListener() {

				 @Override
				 public void actionPerformed(ActionEvent e) {
					 
					 
				 
				 	}
				};

				 // Acción del evento
				b2.addActionListener(guardar);
			
			
			
			
			
			b2.setText("CANCELAR");
			b2.setBounds(260,590,140,40);
			
			
			
			ActionListener funcion_b2 = new ActionListener() {

				 @Override
				 public void actionPerformed(ActionEvent e) {

					 System.exit(0);
				 
				 	}
				};

				 // Acción del evento
				b2.addActionListener(funcion_b2);
				p1.add(b2);
			
			}

private void modificar () {
	
	int seleccionar = tabla.getSelectedRow();
	if (seleccionar != -1) {
		
		JFrame crear = new JFrame();
		JPanel p1 = new JPanel();
		
		//etiquetas
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();
		JLabel l7 = new JLabel();
		p1.setLayout(null);
		
		//textos
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
		JTextField t5 = new JTextField();
		JPasswordField t6 = new JPasswordField();
		JTextField t7 = new JTextField();
		
		//boton
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		
		
		l1.setText("Nombre:");
		l1.setBounds(50,25,90,80);
		l1.setFont(new Font("Serig", Font.PLAIN, 15));
		l1.setVisible(true);
		p1.add(l1);
		
		l2.setText("Apellido:");
		l2.setBounds(50,105,180,80);
		l2.setFont(new Font("Serig", Font.PLAIN, 15));
		l2.setVisible(true);
		p1.add(l2);
		
		l3.setText("Teléfono:");
		l3.setBounds(50,195,180,80);
		l3.setFont(new Font("Serig", Font.PLAIN, 15));
		l3.setVisible(true);
		p1.add(l3);
		
		l4.setText("Direccion:");
		l4.setBounds(50,285,100,80);
		l4.setFont(new Font("Serig", Font.PLAIN, 15));
		l4.setVisible(true);
		p1.add(l4);
		
		l5.setText("Correo:");
		l5.setBounds(50,375,90,80);
		l5.setFont(new Font("Serig", Font.PLAIN, 15));
		l5.setVisible(true);
		p1.add(l5);
		
		l7.setText("FechaNacimiento:");
		l7.setBounds(50,445,150,80);
		l7.setFont(new Font("Serig", Font.PLAIN, 15));
		l7.setVisible(true);
		p1.add(l7);
		
		l6.setText("Contraseña:");
		l6.setBounds(50,510,90,80);
		l6.setFont(new Font("Serig", Font.PLAIN, 15));
		l6.setVisible(true);
		p1.add(l6);
		
		
		
		crear.setTitle("Modificar");
		crear.setLocationRelativeTo(null);
		crear.setBounds(500,100,500,700);
		crear.setVisible(true);
		crear.add(p1);
		
		t1.setBounds(250,40,200,40);
		t2.setBounds(250,120,200,40);
		t3.setBounds(250,210,200,40);
		t4.setBounds(250,300,200,40);
		t5.setBounds(250,390,200,40);
		t6.setBounds(250,530,200,40);
		t7.setBounds(250,460,200,40);
		
		t1.setText(funciones[seleccionar][0]+"");
		t2.setText(funciones[seleccionar][1]+"");
		t3.setText(funciones[seleccionar][2]+"");
		t4.setText(funciones[seleccionar][3]+"");
		t5.setText(funciones[seleccionar][4]+"");
		t6.setText(funciones[seleccionar][5]+"");
		t7.setText(funciones[seleccionar][6]+"");
		
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t6);
		p1.add(t7);
		
		b1.setText("GUARDAR");
		b1.setBounds(90,590,140,40);
		p1.add(b1);
		
		
		b2.setText("CANCELAR");
		b2.setBounds(260,590,140,40);
		p1.add(b2);

		ActionListener funcion_b2 = new ActionListener() {

			 @Override
			 public void actionPerformed(ActionEvent e) {

				 System.exit(0);
			 
			 	}
			};

			 // Acción del evento
			b2.addActionListener(funcion_b2);
		
	}
		
	}
	
	public void eliminar() {
		int seleccionar = tabla.getSelectedRow();
		if (seleccionar != -1) {
			
			JFrame crear = new JFrame();
			JPanel p1 = new JPanel();
			
			//etiquetas
			JLabel l1 = new JLabel();
			JLabel l2 = new JLabel();
			JLabel l3 = new JLabel();
			JLabel l4 = new JLabel();
			JLabel l5 = new JLabel();
			JLabel l6 = new JLabel();
			JLabel l7 = new JLabel();
			p1.setLayout(null);
			
			//textos
			JTextField t1 = new JTextField();
			JTextField t2 = new JTextField();
			JTextField t3 = new JTextField();
			JTextField t4 = new JTextField();
			JTextField t5 = new JTextField();
			JPasswordField t6 = new JPasswordField();
			JTextField t7 = new JTextField();
			
			//boton
			JButton b1 = new JButton();
			JButton b2 = new JButton();
			
			
			l1.setText("Nombre:");
			l1.setBounds(50,25,90,80);
			l1.setFont(new Font("Serig", Font.PLAIN, 15));
			l1.setVisible(true);
			p1.add(l1);
			
			l2.setText("Apellido:");
			l2.setBounds(50,105,180,80);
			l2.setFont(new Font("Serig", Font.PLAIN, 15));
			l2.setVisible(true);
			p1.add(l2);
			
			l3.setText("Teléfono:");
			l3.setBounds(50,195,180,80);
			l3.setFont(new Font("Serig", Font.PLAIN, 15));
			l3.setVisible(true);
			p1.add(l3);
			
			l4.setText("Direccion:");
			l4.setBounds(50,285,100,80);
			l4.setFont(new Font("Serig", Font.PLAIN, 15));
			l4.setVisible(true);
			p1.add(l4);
			
			l5.setText("Correo:");
			l5.setBounds(50,375,90,80);
			l5.setFont(new Font("Serig", Font.PLAIN, 15));
			l5.setVisible(true);
			p1.add(l5);
			
			l7.setText("FechaNacimiento:");
			l7.setBounds(50,445,150,80);
			l7.setFont(new Font("Serig", Font.PLAIN, 15));
			l7.setVisible(true);
			p1.add(l7);
			
			l6.setText("Contraseña:");
			l6.setBounds(50,510,90,80);
			l6.setFont(new Font("Serig", Font.PLAIN, 15));
			l6.setVisible(true);
			p1.add(l6);
			
			
			
			crear.setTitle("Modificar");
			crear.setLocationRelativeTo(null);
			crear.setBounds(500,100,500,700);
			crear.setVisible(true);
			crear.add(p1);
			
			t1.setBounds(250,40,200,40);
			t2.setBounds(250,120,200,40);
			t3.setBounds(250,210,200,40);
			t4.setBounds(250,300,200,40);
			t5.setBounds(250,390,200,40);
			t6.setBounds(250,530,200,40);
			t7.setBounds(250,460,200,40);
			
			t1.setText(funciones[seleccionar][0]+"");
			t2.setText(funciones[seleccionar][1]+"");
			t3.setText(funciones[seleccionar][2]+"");
			t4.setText(funciones[seleccionar][3]+"");
			t5.setText(funciones[seleccionar][4]+"");
			t6.setText(funciones[seleccionar][5]+"");
			t7.setText(funciones[seleccionar][6]+"");
			
			p1.add(t1);
			p1.add(t2);
			p1.add(t3);
			p1.add(t4);
			p1.add(t5);
			p1.add(t6);
			p1.add(t7);
			
			b1.setText("GUARDAR");
			b1.setBounds(90,590,140,40);
			p1.add(b1);
			
			
			b2.setText("CANCELAR");
			b2.setBounds(260,590,140,40);
			p1.add(b2);

			ActionListener funcion_b2 = new ActionListener() {

				 @Override
				 public void actionPerformed(ActionEvent e) {

					 System.exit(0);
				 
				 	}
				};

				 // Acción del evento
				b2.addActionListener(funcion_b2);
	}
	
}

		public void ejecutar() {
			
			botones();
			tabla();
		}
		
		
}
