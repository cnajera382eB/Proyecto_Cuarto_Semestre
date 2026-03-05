package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.HTML.Tag;
import java.awt.image.*;

public class Ventana extends JFrame{
	

	public Ventana() {
		
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(400,400,650,650);
		this.setTitle("Login");
		this.setLayout(null);
		
		
		
		try {
			Image iconImage = ImageIO.read(getClass().getResource("/Imagenes/reinoalejado.png"));
			
			this.setIconImage(iconImage);
		} catch (Exception e) {

			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		JMenuBar Barra = new JMenuBar();
		this.setJMenuBar(Barra);
		JMenu menu_uno = new JMenu("Archivo");
		Barra.add(menu_uno);
		JMenuItem opt1_menu1= new JMenuItem("Abrir");
		menu_uno.add(opt1_menu1);
		JMenuItem opt2_menu1= new JMenuItem("Cerrar");
		menu_uno.add(opt2_menu1);

		
		JMenu menu_dos = new JMenu("Guardar");
		menu_uno.add(menu_dos);
		
		JMenuItem opt1_menu2= new JMenuItem("Guardar");
		menu_dos.add(opt1_menu2);
		JMenuItem opt2_menu2= new JMenuItem("Guardar como");
		menu_dos.add(opt2_menu2);
		
		
		menu_uno.addSeparator();
		
		//this.login();
		//this.registro();
		//this.users();
		this.login_new();
		
		this.setVisible(true);
		this.repaint();
		
		
		
		
		
	}
	
	public void login() {
		
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,400);
		login_contenedor.setLocation(50,50);
		login_contenedor.setBackground(Color.cyan);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Bienvenido");
		tag_tittle.setSize(150,120);
		tag_tittle.setLocation(125,20);
		tag_tittle.setBackground(Color.cyan);
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
	
	public void registro() {
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
		
		
	}
	public void users() {
		JPanel panel_usuarios = new JPanel();
		panel_usuarios.setSize(900, 500);
		panel_usuarios.setLocation(20,10);
		panel_usuarios.setBackground(Color.PINK);
		JTextArea user_text =new JTextArea("Usuarios");
		user_text.setLocation(400,10);
		user_text.setSize(70,50);
		//YYY.setVerticalAlignment(JLabel.CENTER);
		//tittle_tag_two.setHorizontalAlignment(JLabel.CENTER);
		panel_usuarios.add(user_text);
		this.add(panel_usuarios);
		
		JButton boton_descarga = new JButton();
		boton_descarga.setText("Descargar");
		boton_descarga.setSize(20, 35);
		boton_descarga.setFont(new Font("Arial",Font.ITALIC,11));
		boton_descarga.setLocation(480,55);
		panel_usuarios.add(boton_descarga);
		
		JButton boton_anadir = new JButton();
		boton_anadir.setText("Añadir");
		boton_anadir.setSize(20, 35);
		boton_anadir.setFont(new Font("Arial",Font.ITALIC,11));
		boton_anadir.setLocation(530,55);
		panel_usuarios.add(boton_anadir);
		
		this.repaint();
		
		String [] table_head = {"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"};
		
		Object [][] table_body = {
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				{"Nombre", "Apellidos","Correo electronico","Número de control","Semestre", "Carreras", "Acciones"},
				};
		JTable students = new JTable(table_body, table_head);
		JScrollPane final_table = new JScrollPane(students);
		final_table.setSize(700,150);
		final_table.setLocation(100,100);
		panel_usuarios.add(final_table);
		panel_usuarios.repaint();
		
	}
	
	public void login_new () {
		
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,400);
		login_contenedor.setLocation(50,50);
		login_contenedor.setBackground(Color.cyan);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Bienvenido");
		tag_tittle.setSize(180,140);
		tag_tittle.setLocation(125,5);
		tag_tittle.setBackground(Color.cyan);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial",Font.PLAIN,22));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor.add(tag_tittle);
		
		//Contenedor del nombre del usuario
		JTextField email_input = new JTextField();
		email_input.setSize(180,40);
		email_input.setLocation(120,135);
		login_contenedor.add(email_input);
		
		//Contenedor de la contraseña
		JTextField password_input = new JTextField();
		password_input.setSize(180,40);
		password_input.setLocation(120,240);
		login_contenedor.add(password_input);
		
		
		//Boton del mensaje "Nombre del usuario"
		JLabel texto_generico_uno = new JLabel("Ingrese su email");
		texto_generico_uno.setFont(new Font("Arial",Font.PLAIN,16));
		texto_generico_uno.setSize(1170,150);
		texto_generico_uno.setLocation(125,80);
		login_contenedor.add(texto_generico_uno);
		
		
		//Boton del mensaje "Olvido su contraseña"
		JLabel texto_generico_dos = new JLabel("Ingrese su contraseña");
		texto_generico_dos.setFont(new Font("Arial",Font.PLAIN,16));
		texto_generico_dos.setSize(1170,150);
		texto_generico_dos.setLocation(125,155);
		login_contenedor.add(texto_generico_dos);
		
	
		this.repaint();
		
	}

	

}
