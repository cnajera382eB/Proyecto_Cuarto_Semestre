package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.HTML.Tag;

public class Ventana extends JFrame{

	public Ventana() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(400,400,650,650);
		this.setTitle("Holamundo");
		this.setLayout(null);
		
		//
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,400);
		login_contenedor.setLocation(50,50);
		login_contenedor.setBackground(Color.RED);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
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
		
		
		JPanel rgs_container = new JPanel();
		
		rgs_container.setBounds(500, 50, 400, 800);
		rgs_container.setOpaque(true);
		rgs_container.setBackground(Color.blue);
		rgs_container.setLayout(null);
		this.add(rgs_container);
		
		//titulo
		JLabel tittle_tag_two = new JLabel();
		tittle_tag_two.setText("REGISTRO");
		tittle_tag_two.setSize(150,120);
		tittle_tag_two.setLocation(125,0);
		tittle_tag_two.setBackground(Color.BLACK);
		tittle_tag_two.setOpaque(true);
		tittle_tag_two.setFont(new Font("Arial",Font.PLAIN,22));
		tittle_tag_two.setVerticalAlignment(JLabel.CENTER);
		tittle_tag_two.setHorizontalAlignment(JLabel.CENTER);
		rgs_container.add(tittle_tag_two);
		
		//label name
		JLabel caja_uno = new JLabel("Nombre de usuario:");
		caja_uno.setBounds(50,100,150,40);
		caja_uno.setHorizontalAlignment(JLabel.CENTER);
		//bio_tag.setOpaque(true);
		rgs_container.add(caja_uno);
		//input name
		
		JLabel bio_tag = new JLabel("BIO");
		bio_tag.setBounds(50,200,300,70);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		//bio_tag.setOpaque(true);
		rgs_container.add(bio_tag);
		
		//textArea bio
		
		JTextArea bio_text =new JTextArea();
		bio_text.setLocation(50,130);
		bio_text.setSize(300,50);
		rgs_container.add(bio_text);
		//label preferences
		JCheckBox opc_swee = new JCheckBox("Dulce");
		opc_swee.setBounds(50, 270, 70, 40);
		//opc_swee.setOpaque(true);
		opc_swee.setForeground(Color.PINK);
		rgs_container.add(opc_swee);
		
		JCheckBox opc_salty = new JCheckBox("Salado");
		opc_salty.setBounds(150, 270, 70, 40);
		//opc_salty.setOpaque(true);
		opc_salty.setForeground(Color.green);
		rgs_container.add(opc_salty);
		
		JCheckBox opc_healty = new JCheckBox("Saludable");
		opc_healty.setBounds(250, 270, 70, 40);
		//opc_healty.setOpaque(true);
		opc_healty.setForeground(Color.RED);
		rgs_container.add(opc_healty);
		
		this.repaint();
		//preferences
		
		
		//label terms
		
		JRadioButton accept_terms = new JRadioButton("Acepto todos los terminos");
		accept_terms.setBounds(50, 350, 180, 40);
		rgs_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo todos los terminos");
		reject_terms.setBounds(220, 350, 200, 40);
		rgs_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);
		//terms
		
		//combo
		
		String [] colonias = {"Camino real", "Arcoiris","Villareal","Ayuntamiento" }	;
		JComboBox colonias_combo = new JComboBox(colonias);
		colonias_combo.setBounds(50, 400, 300, 50);
		rgs_container.add(colonias_combo);
		
		JButton register_bn = new JButton("crear cuenta");
		register_bn.setBounds(50, 490, 300, 60);
		rgs_container.add(register_bn);
		this.repaint();
		
	}

}
