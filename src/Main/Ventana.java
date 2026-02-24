package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.html.HTML.Tag;

public class Ventana extends JFrame{

	public Ventana() {
		this.setVisible(true);
		//this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(400,400,650,650);
		this.setTitle("Holamundo");
		this.setLayout(null);
		
		//
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,400);
		login_contenedor.setLocation(70,90);
		login_contenedor.setBackground(Color.RED);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Acceder");
		tag_tittle.setSize(150,120);
		tag_tittle.setLocation(125,20);
		tag_tittle.setBackground(Color.white);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial",Font.PLAIN,22));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor.add(tag_tittle);
		
		//Contenedor del nombre del usuario
		JTextField email_input = new JTextField();
		email_input.setSize(200,40);
		email_input.setLocation(125,100);
		login_contenedor.add(email_input);
		
		//Contenedor de la contraseña
		JTextField password_input = new JTextField();
		password_input.setSize(180,40);
		password_input.setLocation(120,180);
		login_contenedor.add(password_input);
		
		//Boton de "recordar"
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setSize(140,40);
		remember.setLocation(120,240);
		login_contenedor.add(remember);
		
		//Boton del mensaje "Nombre del usuario"
		JLabel texto_generico_uno = new JLabel("Nombre de usuario");
		texto_generico_uno.setFont(new Font("Arial",Font.PLAIN,16));
		texto_generico_uno.setSize(1170,100);
		texto_generico_uno.setLocation(125,42);
		login_contenedor.add(texto_generico_uno);
		
		//Boton del mensaje "Olvido su contraseña"
		JLabel texto_generico_dos = new JLabel("¿Olvido su contraseña?");
		texto_generico_dos.setFont(new Font("Arial",Font.PLAIN,16));
		texto_generico_dos.setSize(1170,150);
		texto_generico_dos.setLocation(125,90);
		login_contenedor.add(texto_generico_dos);
		
		
		//Boton de ACEPTAR
		JButton acces_btn = new JButton();
		acces_btn.setText("Aceptar");
		acces_btn.setSize(200, 35);
		acces_btn.setFont(new Font("Arial",Font.ITALIC,18));
		acces_btn.setLocation(120,280);
		login_contenedor.add(acces_btn);
		this.repaint();
		
	}

}
