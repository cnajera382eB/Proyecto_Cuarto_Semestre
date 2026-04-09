
package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
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
		
		this.setSize(1200,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(400,400,650,650);
		this.setTitle("Calculando interés");
		this.setLayout(null);
		
		
		
		try {
			Image iconImage = ImageIO.read(getClass().getResource("/Imagenes/JugadorDosAnimated.gif"));
			
			this.setIconImage(iconImage);
		} catch (Exception e) {

			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		JMenuBar Barra = new JMenuBar();
		this.setJMenuBar(Barra);
		JMenu menu_uno = new JMenu("Inicio");
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
		
		
		JMenu menu_tres = new JMenu("Cuenta");
		Barra.add(menu_tres);
		JMenuItem opt1_menu3= new JMenuItem("Login");
		menu_tres.add(opt1_menu3);
		JMenuItem opt2_menu3= new JMenuItem("Registro");
		menu_tres.add(opt2_menu3);
		JMenuItem opt3_menu3= new JMenuItem("Recuperación");
		menu_tres.add(opt3_menu3);
		
		
		opt1_menu3.addActionListener(e->{
			this.router("login");
		});
		
		opt2_menu3.addActionListener(e->{
			this.router("registro");
		});
		
		menu_tres.addSeparator();
		
		JMenu menu_cuatro = new JMenu("Ayuda");
		Barra.add(menu_cuatro);
		JMenuItem opt1_menu4= new JMenuItem("Ayudar a crear un usuario");
		menu_cuatro.add(opt1_menu4);
		JMenuItem opt2_menu4= new JMenuItem("Ayuda de acceso al sistema");
		menu_cuatro.add(opt2_menu4);
		JMenuItem opt3_menu4= new JMenuItem("Ayuda a la recuperación de contraseña");
		menu_cuatro.add(opt3_menu4);
		
		opt1_menu4.addActionListener(e->{
			this.router("ayuda");
		});
		
		
		menu_cuatro.addSeparator();
		
		
		JMenu menu_estudiantes = new JMenu("Usuarios");
		Barra.add(menu_estudiantes);
		JMenuItem opt1_menu_estudiantes= new JMenuItem("Alta de usuario");
		menu_estudiantes.add(opt1_menu_estudiantes);
		JMenuItem opt2_menu_estudiantes= new JMenuItem("Baja de usuario");
		menu_estudiantes.add(opt2_menu_estudiantes);
		JMenuItem opt3_menu_estudiantes= new JMenuItem("Consultar usuario");
		menu_estudiantes.add(opt3_menu_estudiantes);
		
		opt1_menu_estudiantes.addActionListener(e->{
			this.router("usuario");
		});
		
		
		
		menu_estudiantes.addSeparator();
		
		
		//this.login();
		//this.registro();
		//this.users();
		//this.login_new();
		//this.calculadora();
		//this.caculadora_layout();
		//this.calcular_interes();
		//this.pintar();
		//this.registro_perfeccionado();
		//this.Examen();
		this.router("login");
		//this.Mario_art();
		
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
		
		
		
		
		
		acces_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String email = email_input.getText();
				
				if (email.equals("")) {
					System.out.println("Vacío");
					email_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else
					email_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
				
				
				String password = password_input.getText();
				
				if (password.equals("")) {
					System.out.println("Vacío");
					password_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else
					password_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
				
				
				
			}});
		
	
	
		//Boton de cambiar a login
				JButton account_F = new JButton();
				account_F.setText("Ir a Registro");
				account_F.setSize(170, 35);
				account_F.setFont(new Font("Arial",Font.ITALIC,12));
				account_F.setLocation(120,380);
				login_contenedor.add(account_F);
				
				account_F.addActionListener(e ->{
					this.router("registro");
				});
				
				
		
			
		
	}
	
	
	
	public void registro() {
		JPanel rgs_container = new JPanel();
		
		rgs_container.setBounds(10, 50, 400, 800);
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
		
		register_bn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String bioTEXT = bio_text.getText();
				if (bioTEXT.equals("")) {
					System.out.println("Vacío");
					bio_text.setBorder(BorderFactory.createLineBorder(Color.red,3));
				} else
					bio_text.setBorder(BorderFactory.createLineBorder(Color.green,3));
				

				
				if (accept_terms.isSelected()) {
					
					accept_terms.setBorder(BorderFactory.createLineBorder(Color.green,5));
				} else if (reject_terms.isSelected()) {
					reject_terms.setBorder(BorderFactory.createLineBorder(Color.green,5));
				}else
					accept_terms.setBorder(BorderFactory.createLineBorder(Color.green,5));
					reject_terms.setBorder(BorderFactory.createLineBorder(Color.green,5));
					
				

				
				
				
				
			}
		});
		
		
		JButton acount_new = new JButton();
		acount_new.setText("Ir a login");
		acount_new.setSize(170, 35);
		acount_new.setFont(new Font("Arial",Font.ITALIC,12));
		acount_new.setLocation(120,300);
		rgs_container.add(acount_new);
		
		acount_new.addActionListener(e ->{
			this.router("login");
		});
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
		login_contenedor.setBackground(Color.BLUE);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Bienvenido");
		tag_tittle.setSize(225,140);
		tag_tittle.setLocation(125,5);
		tag_tittle.setBackground(Color.WHITE);
		//tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Bond",Font.ITALIC,40));
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

	public void calculadora () {

		JLabel panel_usuario = new JLabel();
		panel_usuario.setSize(500,700);
		panel_usuario.setLocation(250,50);
		panel_usuario.setBackground(Color.DARK_GRAY);
		panel_usuario.setLabelFor(null);
		this.add(panel_usuario);
		
		JLabel contenedor_numeros = new JLabel("180.00");
		contenedor_numeros.setSize(480,40);
		contenedor_numeros.setLocation(10,10);
		contenedor_numeros.setOpaque(true);
		contenedor_numeros.setBackground(Color.WHITE);
		contenedor_numeros.setFont(new Font("Arial", Font.BOLD,22));
		contenedor_numeros.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel_usuario.add(contenedor_numeros);
		
		int cor_x= 30, cor_y =60;
		String [] botones = {"CE","","","","7","8","9","/","4","5","6","*","1","2","3","+","0",".","-","="};
		
		for (int i = 0; i < 20; i++) {
			JButton ce= new JButton(botones[i]);
			ce.setSize(100,100);
			ce.setLocation(cor_x,cor_y);
			panel_usuario.add(ce);
			
			cor_x+=110;
			panel_usuario.add(ce);
			
			if (cor_x>=420) {
				cor_x=30;
				cor_y+=110;
			}
			
			
		}
		
		
		
		
		
		
		
	}

	public void caculadora_layout () {
		
		
		JLabel panel_usuario = new JLabel();
		panel_usuario.setSize(500,700);
		panel_usuario.setLocation(1,25);
		panel_usuario.setBackground(Color.DARK_GRAY);
		
		BorderLayout layout_uno = new BorderLayout();
		layout_uno.setVgap(20);
		panel_usuario.setLayout(layout_uno);
		this.add(panel_usuario);
		
		JLabel contenedor_numeros = new JLabel("180.00");
		contenedor_numeros.setOpaque(true);
		contenedor_numeros.setBackground(Color.WHITE);
		contenedor_numeros.setFont(new Font("Arial", Font.BOLD,22));
		contenedor_numeros.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel_usuario.add(contenedor_numeros,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.BLUE);
		centro.setLayout(new GridLayout(3,4));
		panel_usuario.add(centro,BorderLayout.CENTER);
		
		
		String [] botones = {"9","8","7","6","5","4","3","2","1","0",".",""};
		
		for (int i = 0; i < botones.length; i++) {
			JButton ce= new JButton(botones[i]);
			ce.setSize(100,100);
			ce.setFont(new Font("Arial",Font.BOLD,22));
			centro.add(ce);
			
		
		}
		
		JPanel sidebar = new JPanel();
		sidebar.setBackground(Color.gray);
		sidebar.setLayout(new GridLayout(6,1));
		panel_usuario.add(sidebar,BorderLayout.EAST);
		String [] botones_dos = {"+","-","*","/","=","CE"};
		
		for (int i = 0; i < botones_dos.length; i++) {
			
			JButton ce = new JButton();
			ce.setSize(100,100);
			ce.setFont(new Font("Arial",Font.BOLD,22));
			sidebar.add(ce);
		}
		
		this.repaint();
		
	}
	
	public void calcular_interes () {
		
		
		//Panel rosado
		JPanel login_contenedor_tres = new JPanel();
		login_contenedor_tres.setSize(350,150);
		login_contenedor_tres.setLocation(75,340);
		login_contenedor_tres.setBackground(Color.PINK);
		
		this.add(login_contenedor_tres);
		login_contenedor_tres.setLayout(null);
		this.setLayout(null);
		
		
		//panel verde
		JPanel login_contenedor_dos = new JPanel();
		login_contenedor_dos.setSize(350,200);
		login_contenedor_dos.setLocation(75,100);
		login_contenedor_dos.setBackground(Color.green);
		
		this.add(login_contenedor_dos);
		
		login_contenedor_dos.setLayout(null);
		this.setLayout(null);
		
		
		//panel blanco de fondo
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,1000
				);
		login_contenedor.setLocation(50,50);
		login_contenedor.setBackground(Color.white);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Interes");
		tag_tittle.setSize(78,50);
		tag_tittle.setLocation(10,5);
		tag_tittle.setBackground(Color.white);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Times New Rome",Font.PLAIN,17));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		tag_tittle.setForeground(Color.RED);
		login_contenedor.add(tag_tittle);
		
	
		
		//Contenedor de capital
		JTextField caja_uno = new JTextField();
		caja_uno.setSize(200,25);
		caja_uno.setLocation(140,50);
		caja_uno.setOpaque(true);
		login_contenedor_dos.add(caja_uno);
		
		
		//Contenedor de tiempo
		JTextField caja_dos = new JTextField();
		caja_dos.setSize(200,25);
		caja_dos.setLocation(140,100);
		login_contenedor_dos.add(caja_dos);
		
		//Contenedor de tasa de interes
		JTextField caja_tres = new JTextField();
		caja_tres.setSize(200,25);
		caja_tres.setLocation(140,150);
		login_contenedor_dos.add(caja_tres);
		
		//Contenedor de interes
		JTextField caja_cuatro = new JTextField();
		caja_cuatro.setSize(200,25);
		caja_cuatro.setLocation(140,50);
		caja_cuatro.setOpaque(false);
		login_contenedor_tres.add(caja_cuatro);
		this.repaint();
		
		//Contenedor de monto
		JTextField caja_cinco = new JTextField();
		caja_cinco.setSize(200,25);
		caja_cinco.setLocation(140,100);
		login_contenedor_tres.add(caja_cinco);
		this.repaint();
		
		
		
		//Mensajes de las opciones
		JLabel tag_tittle_uno = new JLabel();
		tag_tittle_uno.setText("Capital");
		tag_tittle_uno.setSize(50,25);
		tag_tittle_uno.setLocation(10,50);
		tag_tittle_uno.setBackground(Color.green);
		tag_tittle_uno.setOpaque(true);
		tag_tittle_uno.setFont(new Font("Times New Rome",Font.PLAIN,16));
		tag_tittle_uno.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_uno.setHorizontalAlignment(JLabel.CENTER);
		tag_tittle_uno.setForeground(Color.BLACK);
		login_contenedor_dos.add(tag_tittle_uno);
		
		JLabel tag_tittle_dos = new JLabel();
		tag_tittle_dos.setText("Tiempo");
		tag_tittle_dos.setSize(50,25);
		tag_tittle_dos.setLocation(10,150);
		tag_tittle_dos.setBackground(Color.green);
		tag_tittle_dos.setOpaque(true);
		tag_tittle_dos.setFont(new Font("Times New Rome",Font.PLAIN,16));
		tag_tittle_dos.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_dos.setHorizontalAlignment(JLabel.CENTER);
		tag_tittle_dos.setForeground(Color.BLACK);
		login_contenedor_dos.add(tag_tittle_dos);
		
		JLabel tag_tittle_tres = new JLabel();
		tag_tittle_tres.setText("Tasa de interés");
		tag_tittle_tres.setSize(50,25);
		tag_tittle_tres.setLocation(10,100);
		tag_tittle_tres.setBackground(Color.green);
		tag_tittle_tres.setOpaque(true);
		tag_tittle_tres.setFont(new Font("Times New Rome",Font.PLAIN,16));
		tag_tittle_tres.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_tres.setHorizontalAlignment(JLabel.CENTER);
		tag_tittle_tres.setForeground(Color.BLACK);
		login_contenedor_dos.add(tag_tittle_tres);
		
		JLabel tag_tittle_cuatro = new JLabel();
		tag_tittle_cuatro.setText("Interés");
		tag_tittle_cuatro.setSize(50,25);
		tag_tittle_cuatro.setLocation(10,50);
		tag_tittle_cuatro.setBackground(Color.PINK);
		tag_tittle_cuatro.setOpaque(true);
		tag_tittle_cuatro.setFont(new Font("Times New Rome",Font.PLAIN,16));
		tag_tittle_cuatro.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_cuatro.setHorizontalAlignment(JLabel.CENTER);
		tag_tittle_cuatro.setForeground(Color.BLACK);
		login_contenedor_tres.add(tag_tittle_cuatro);
		
		JLabel tag_tittle_cinco = new JLabel();
		tag_tittle_cinco.setText("Monto");
		tag_tittle_cinco.setSize(50,25);
		tag_tittle_cinco.setLocation(10,100);
		tag_tittle_cinco.setBackground(Color.PINK);
		tag_tittle_cinco.setOpaque(true);
		tag_tittle_cinco.setFont(new Font("Times New Rome",Font.PLAIN,16));
		tag_tittle_cinco.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_cinco.setHorizontalAlignment(JLabel.CENTER);
		tag_tittle_cinco.setForeground(Color.BLACK);
		login_contenedor_tres.add(tag_tittle_cinco);
		
		
		
		
		
		
		//Boton de ACEPTAR
		JButton acces_btn = new JButton();
		acces_btn.setText("Calcular");
		acces_btn.setSize(100, 25);
		acces_btn.setFont(new Font("Arial",Font.ITALIC,16));
		acces_btn.setLocation(75,240);
		login_contenedor.add(acces_btn);
		
		
		
		//boton de CANCELAR
		JButton acces_btn_dos = new JButton();
		acces_btn_dos.setText("Cancelar");
		acces_btn_dos.setSize(100, 25);
		acces_btn_dos.setFont(new Font("Arial",Font.ITALIC,16));
		acces_btn_dos.setLocation(225,240);
		login_contenedor.add(acces_btn_dos);
		
		this.repaint();
		
	}
	
	public void pintar () {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawLine(0, 0, 1000, 700);
                g2d.setColor(Color.orange);
                g2d.drawOval(100, 100, 150, 50);
                
                g2d.setStroke(new  BasicStroke(3));
                g2d.setColor(Color.magenta);
                g2d.drawPolygon(new int [] {300,100,500}, new int [] {100,300,500} , 3);
                
                g2d.drawRect(250, 400, 100, 100);
                g2d.drawRoundRect(500,150,100,100,10,10);
                g2d.drawArc(400, 100, 100, 100, 0, 360);
                
                g2d.setFont(new Font("Arial", Font.BOLD,30));
                g2d.drawString("Sirnight", 100, 100);
                
                g2d.fillOval(500, 100, 150, 55);
                
                g2d.fillPolygon(new int [] {500,300,700}, new int [] {300,500,500},3);
                
                g2d.setColor(Color.cyan);
                g2d.fillRoundRect(300, 250, 100, 95, 10, 10);
                g2d.fillArc(450, 150, 100, 100, 0, 160);
                
                
				try {
					
					BufferedImage image = ImageIO.read(new File("src/iconodeljuego.png"));
					g2d.drawImage(image, 0, 0, null);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
                

            }
        };
        
        
        
		
	
        pane.setSize(1000,700);
        pane.setLocation(0,0);
        this.add(pane);
	}
	
	
	public void registro_perfeccionado () {
		//Panel rosado 1
				JPanel login_contenedor_tres = new JPanel();
				login_contenedor_tres.setSize(350,200);
				login_contenedor_tres.setLocation(400,30);
				login_contenedor_tres.setBackground(Color.PINK);
				
				this.add(login_contenedor_tres);
				login_contenedor_tres.setLayout(null);
				this.setLayout(null);
				
				
				//panel verde 1
				JPanel login_contenedor_dos = new JPanel();
				login_contenedor_dos.setSize(350,300);
				login_contenedor_dos.setLocation(10,49);
				login_contenedor_dos.setBackground(Color.cyan);
				
				this.add(login_contenedor_dos);
				
				login_contenedor_dos.setLayout(null);
				this.setLayout(null);
				
				
				//Panel rosado 2
				JPanel login_contenedor_cuatro = new JPanel();
				login_contenedor_cuatro.setSize(350,300);
				login_contenedor_cuatro.setLocation(10,350);
				login_contenedor_cuatro.setBackground(Color.PINK);
				
				this.add(login_contenedor_cuatro);
				login_contenedor_cuatro.setLayout(null);
				this.setLayout(null);
				
				
				//panel verde 2
				JPanel login_contenedor_cinco = new JPanel();
				login_contenedor_cinco.setSize(350,200);
				login_contenedor_cinco.setLocation(400,300);
				login_contenedor_cinco.setBackground(Color.cyan);
				
				this.add(login_contenedor_cinco);
				
				login_contenedor_cinco.setLayout(null);
				this.setLayout(null);
				
				
				//panel blanco de fondo
				JPanel login_contenedor = new JPanel();
				login_contenedor.setSize(1000,8000);
				login_contenedor.setLocation(10,20);
				login_contenedor.setBackground(Color.green);
				//login_contenedor.setOpaque();
				this.add(login_contenedor);
				
				login_contenedor.setLayout(null);
				this.setLayout(null);
				
				//Mensaje acceder
				JLabel tag_tittle = new JLabel();
				tag_tittle.setText("Registro de usuarios");
				tag_tittle.setSize(170,40);
				tag_tittle.setLocation(10,0);
				tag_tittle.setBackground(Color.green);
				tag_tittle.setOpaque(true);
				tag_tittle.setFont(new Font("Times New Rome",Font.PLAIN,13));
				tag_tittle.setVerticalAlignment(JLabel.CENTER);
				tag_tittle.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle.setForeground(Color.RED);
				login_contenedor.add(tag_tittle);
				
			
				
				//Contenedor de nombre
				JTextField caja_uno = new JTextField();
				caja_uno.setSize(200,25);
				caja_uno.setLocation(140,20);
				caja_uno.setOpaque(true);
				login_contenedor_dos.add(caja_uno);
				
				
				//Contenedor de apellido paterno
				JTextField caja_dos = new JTextField();
				caja_dos.setSize(200,25);
				caja_dos.setLocation(140,50);
				login_contenedor_dos.add(caja_dos);
				
				//Contenedor de tasa de materno
				JTextField caja_tres = new JTextField();
				caja_tres.setSize(200,25);
				caja_tres.setLocation(140,80);
				login_contenedor_dos.add(caja_tres);
				
				//Contenedor de fecha de nacimiento
				JTextField caja_cuatro = new JTextField();
				caja_cuatro.setSize(100,25);
				caja_cuatro.setLocation(140,110);
				login_contenedor_dos.add(caja_cuatro);
				
				JRadioButton M_sexo = new JRadioButton("M");
				M_sexo.setSize(140,25);
				M_sexo.setLocation(140, 145);
				M_sexo.setBackground(Color.cyan);
				login_contenedor_dos.add(M_sexo);
				
				JRadioButton F_sexo = new JRadioButton("F");
				F_sexo.setSize(170,25);
				F_sexo.setLocation(140, 170);
				F_sexo.setBackground(Color.cyan);
				login_contenedor_dos.add(F_sexo);
				
				JRadioButton D_sexo = new JRadioButton("Prefiero no responder");
				D_sexo.setSize(140,25);
				D_sexo.setLocation(140, 150);
				D_sexo.setBackground(Color.cyan);
				login_contenedor_dos.add(D_sexo);
				
				String [] paises = {"Perú", "México","EEUU","China", "Sudcalifornia", "Egipto","España" }	;
				JComboBox paises_combo = new JComboBox(paises);
				paises_combo.setBounds(140, 200, 80, 70);
				login_contenedor_dos.add(paises_combo);
				
				
				
				
				
				
				//Mensajes de las opciones
				JLabel tag_tittle_uno = new JLabel();
				tag_tittle_uno.setText("Nombres");
				tag_tittle_uno.setSize(100,25);
				tag_tittle_uno.setLocation(10,20);
				tag_tittle_uno.setBackground(Color.cyan);
				tag_tittle_uno.setOpaque(true);
				tag_tittle_uno.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_tittle_uno.setVerticalAlignment(JLabel.CENTER);
				tag_tittle_uno.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle_uno.setForeground(Color.BLACK);
				login_contenedor_dos.add(tag_tittle_uno);
				
				JLabel tag_tittle_dos = new JLabel();
				tag_tittle_dos.setText("Apellido paterno");
				tag_tittle_dos.setSize(100,25);
				tag_tittle_dos.setLocation(10,50);
				tag_tittle_dos.setBackground(Color.cyan);
				tag_tittle_dos.setOpaque(true);
				tag_tittle_dos.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_tittle_dos.setVerticalAlignment(JLabel.CENTER);
				tag_tittle_dos.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle_dos.setForeground(Color.BLACK);
				login_contenedor_dos.add(tag_tittle_dos);
				
				JLabel tag_tittle_tres = new JLabel();
				tag_tittle_tres.setText("Apellido materno");
				tag_tittle_tres.setSize(100,25);
				tag_tittle_tres.setLocation(10,80);
				tag_tittle_tres.setBackground(Color.cyan);
				tag_tittle_tres.setOpaque(true);
				tag_tittle_tres.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_tittle_tres.setVerticalAlignment(JLabel.CENTER);
				tag_tittle_tres.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle_tres.setForeground(Color.BLACK);
				login_contenedor_dos.add(tag_tittle_tres);
				
				JLabel tag_tittle_cuatro = new JLabel();
				tag_tittle_cuatro.setText("Fecha de nacimiento");
				tag_tittle_cuatro.setSize(100,25);
				tag_tittle_cuatro.setLocation(10,110);
				tag_tittle_cuatro.setBackground(Color.cyan);
				tag_tittle_cuatro.setOpaque(true);
				tag_tittle_cuatro.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_tittle_cuatro.setVerticalAlignment(JLabel.CENTER);
				tag_tittle_cuatro.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle_cuatro.setForeground(Color.BLACK);
				login_contenedor_dos.add(tag_tittle_cuatro);
				
				JLabel tag_tittle_cinco = new JLabel();
				tag_tittle_cinco.setText("Sexo");
				tag_tittle_cinco.setSize(140,25);
				tag_tittle_cinco.setLocation(10,150);
				tag_tittle_cinco.setBackground(Color.cyan);
				tag_tittle_cinco.setOpaque(true);
				tag_tittle_cinco.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_tittle_cinco.setVerticalAlignment(JLabel.CENTER);
				tag_tittle_cinco.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle_cinco.setForeground(Color.BLACK);
				login_contenedor_dos.add(tag_tittle_cinco);
				
				JLabel tag_tittle_seis = new JLabel();
				tag_tittle_seis.setText("Nacionalidad");
				tag_tittle_seis.setSize(100,25);
				tag_tittle_seis.setLocation(10,220);
				tag_tittle_seis.setBackground(Color.cyan);
				tag_tittle_seis.setOpaque(true);
				tag_tittle_seis.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_tittle_seis.setVerticalAlignment(JLabel.CENTER);
				tag_tittle_seis.setHorizontalAlignment(JLabel.CENTER);
				tag_tittle_seis.setForeground(Color.BLACK);
				login_contenedor_dos.add(tag_tittle_seis);
				
				
				
				
				//ventana 3
				JCheckBox boton_uno = new JCheckBox("Mostrar foto de perfil");
				boton_uno.setSize(1000,40);
				boton_uno.setLocation(50, 125);
				boton_uno.setBackground(Color.PINK);
				login_contenedor_tres.add(boton_uno);
				
				JCheckBox boton_dos = new JCheckBox("Mostrar fecha de nacimiento");
				boton_dos.setSize(1000,40);
				boton_dos.setLocation(50, 155);
				boton_dos.setBackground(Color.PINK);
				login_contenedor_tres.add(boton_dos);
				
				
				
				
				
				
				//Boton de NUEVO
				JButton acces_btn = new JButton();
				acces_btn.setText("Nuevo");
				acces_btn.setSize(100, 30);
				acces_btn.setFont(new Font("Arial",Font.ITALIC,16));
				acces_btn.setLocation(100,30);
				login_contenedor_cinco.add(acces_btn);
				
				//boton de GUARDAR
				JButton acces_btn_dos = new JButton();
				acces_btn_dos.setText("Guardar");
				acces_btn_dos.setSize(100, 30);
				acces_btn_dos.setFont(new Font("Arial",Font.ITALIC,16));
				acces_btn_dos.setLocation(75,100);
				login_contenedor_cinco.add(acces_btn_dos);
				
				//boton de SALIR
				JButton acces_btn_tres = new JButton();
				acces_btn_tres.setText("Cancelar");
				acces_btn_tres.setSize(100, 30);
				acces_btn_tres.setFont(new Font("Arial",Font.ITALIC,16));
				acces_btn_tres.setLocation(75,170);
				login_contenedor_cinco.add(acces_btn_tres);
				
				this.repaint();
				
				JLabel tag_contenedor_descripcion = new JLabel();
				tag_contenedor_descripcion.setText("Descripción");
				tag_contenedor_descripcion.setSize(100,25);
				tag_contenedor_descripcion.setLocation(20,10);
				tag_contenedor_descripcion.setBackground(Color.pink);
				tag_contenedor_descripcion.setOpaque(true);
				tag_contenedor_descripcion.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_contenedor_descripcion.setVerticalAlignment(JLabel.CENTER);
				tag_contenedor_descripcion.setHorizontalAlignment(JLabel.CENTER);
				tag_contenedor_descripcion.setForeground(Color.BLACK);
				login_contenedor_cuatro.add(tag_contenedor_descripcion);
				
				JLabel tag_contenedor_preferencias = new JLabel();
				tag_contenedor_preferencias.setText("Preferencias");
				tag_contenedor_preferencias.setSize(100,25);
				tag_contenedor_preferencias.setLocation(190,10);
				tag_contenedor_preferencias.setBackground(Color.pink);
				tag_contenedor_preferencias.setOpaque(true);
				tag_contenedor_preferencias.setFont(new Font("Times New Rome",Font.PLAIN,12));
				tag_contenedor_preferencias.setVerticalAlignment(JLabel.CENTER);
				tag_contenedor_preferencias.setHorizontalAlignment(JLabel.CENTER);
				tag_contenedor_preferencias.setForeground(Color.BLACK);
				login_contenedor_cuatro.add(tag_contenedor_preferencias);
				
				JTextField contenedor_caja_uno = new JTextField();
				contenedor_caja_uno.setSize(150,200);
				contenedor_caja_uno.setLocation(20,50);
				contenedor_caja_uno.setOpaque(true);
				login_contenedor_cuatro.add(contenedor_caja_uno);
				
				String [] preferencais_seleccion = {"Mejorar", "Reducir recursos","Papa rellena","Hate premiun", "Modo DIOS", "En Garde","Activo torre" }	;
				JComboBox p_s_combo = new JComboBox(preferencais_seleccion);
				p_s_combo.setBounds(210, 50, 70, 50);
				login_contenedor_cuatro.add(p_s_combo);
		
	}
	
	public void Examen() {
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(700,80);
		login_contenedor.setLocation(50,0);
		login_contenedor.setBackground(Color.blue);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		
		this.setLayout(null);
		
		JLabel tag_tittle_blue = new JLabel();
		tag_tittle_blue.setText("Factura en Java- Eclpise- Array list y POO");
		tag_tittle_blue.setSize(390,50);
		tag_tittle_blue.setLocation(50,0);
		tag_tittle_blue.setBackground(Color.blue);
		tag_tittle_blue.setForeground(Color.white);
		tag_tittle_blue.setOpaque(true);
		tag_tittle_blue.setFont(new Font("Arial",Font.PLAIN,16));
		tag_tittle_blue.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_blue.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor.add(tag_tittle_blue);
		
		JLabel tag_tittle_blue_dos = new JLabel();
		tag_tittle_blue_dos.setText("[Sin base de datos]");
		tag_tittle_blue_dos.setSize(140,30);
		tag_tittle_blue_dos.setLocation(50,50);
		tag_tittle_blue_dos.setBackground(Color.blue);
		tag_tittle_blue_dos.setForeground(Color.white);
		tag_tittle_blue_dos.setOpaque(true);
		tag_tittle_blue_dos.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_blue_dos.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_blue_dos.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor.add(tag_tittle_blue_dos);
		
		JPanel login_contenedor_blanco = new JPanel();
		login_contenedor_blanco.setSize(700,800);
		login_contenedor_blanco.setLocation(50,50);
		login_contenedor_blanco.setBackground(Color.white);
		//login_contenedor.setOpaque();
		this.add(login_contenedor_blanco);
		
		login_contenedor_blanco.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Datos del cliente");
		tag_tittle.setSize(140,70);
		tag_tittle.setLocation(50,10);
		tag_tittle.setBackground(Color.white);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle);
		
		JLabel tag_tittle_dos = new JLabel();
		tag_tittle_dos.setText("Documento");
		tag_tittle_dos.setSize(100,70);
		tag_tittle_dos.setLocation(40,50);
		tag_tittle_dos.setBackground(Color.white);
		tag_tittle_dos.setOpaque(true);
		tag_tittle_dos.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_dos.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_dos.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_dos);
		
		JLabel tag_tittle_tres = new JLabel();
		tag_tittle_tres.setText("Dirección");
		tag_tittle_tres.setSize(100,70);
		tag_tittle_tres.setLocation(40,90);
		tag_tittle_tres.setBackground(Color.white);
		tag_tittle_tres.setOpaque(true);
		tag_tittle_tres.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_tres.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_tres.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_tres);
		
		JLabel tag_tittle_cuatro = new JLabel();
		tag_tittle_cuatro.setText("Nombres");
		tag_tittle_cuatro.setSize(100,70);
		tag_tittle_cuatro.setLocation(250,50);
		tag_tittle_cuatro.setBackground(Color.white);
		tag_tittle_cuatro.setOpaque(true);
		tag_tittle_cuatro.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_cuatro.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_cuatro.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_cuatro);
		
		JLabel tag_tittle_cinco = new JLabel();
		tag_tittle_cinco.setText("Teléfono");
		tag_tittle_cinco.setSize(100,70);
		tag_tittle_cinco.setLocation(250,90);
		tag_tittle_cinco.setBackground(Color.white);
		tag_tittle_cinco.setOpaque(true);
		tag_tittle_cinco.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_cinco.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_cinco.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_cinco);
		
		
		//Contenedor de la direccion
		JTextField input_documento = new JTextField();
		input_documento.setSize(100,25);
		input_documento.setLocation(135,75);
		login_contenedor_blanco.add(input_documento);
		
		JTextField input_direccion = new JTextField();
		input_direccion.setSize(100,25);
		input_direccion.setLocation(135,115);
		login_contenedor_blanco.add(input_direccion);
		
		JTextField input_nombres = new JTextField();
		input_nombres.setSize(100,25);
		input_nombres.setLocation(360,75);
		login_contenedor_blanco.add(input_nombres);
		
		JTextField input_telefono = new JTextField();
		input_telefono.setSize(100,25);
		input_telefono.setLocation(360,115);
		login_contenedor_blanco.add(input_telefono);
		
		JLabel tag_tittle_seis = new JLabel();
		tag_tittle_seis.setText("Datos de Factura");
		tag_tittle_seis.setSize(100,70);
		tag_tittle_seis.setLocation(50,140);
		tag_tittle_seis.setBackground(Color.white);
		tag_tittle_seis.setOpaque(true);
		tag_tittle_seis.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_seis.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_seis.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_seis);
		
		JLabel tag_tittle_siete = new JLabel();
		tag_tittle_siete.setText("Número de facturas:	1");
		tag_tittle_siete.setSize(140,70);
		tag_tittle_siete.setLocation(50,190);
		tag_tittle_siete.setBackground(Color.white);
		tag_tittle_siete.setOpaque(true);
		tag_tittle_siete.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_siete.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_siete.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_siete);
		
		JLabel tag_tittle_ocho = new JLabel();
		tag_tittle_ocho.setText("Fecha:		2021/50/21");
		tag_tittle_ocho.setSize(100,70);
		tag_tittle_ocho.setLocation(250,190);
		tag_tittle_ocho.setBackground(Color.white);
		tag_tittle_ocho.setOpaque(true);
		tag_tittle_ocho.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_ocho.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_ocho.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_ocho);
		
		JLabel tag_tittle_nueve = new JLabel();
		tag_tittle_nueve.setText("Ver listado de facturas");
		tag_tittle_nueve.setSize(200,70);
		tag_tittle_nueve.setLocation(10,250);
		tag_tittle_nueve.setBackground(Color.white);
		tag_tittle_nueve.setOpaque(true);
		tag_tittle_nueve.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_nueve.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_nueve.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_nueve);
		
		JLabel tag_tittle_aniadir = new JLabel();
		tag_tittle_aniadir.setText("Añadir ( + )");
		tag_tittle_aniadir.setSize(100,70);
		tag_tittle_aniadir.setLocation(200,250);
		tag_tittle_aniadir.setBackground(Color.white);
		tag_tittle_aniadir.setOpaque(true);
		tag_tittle_aniadir.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_aniadir.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_aniadir.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_aniadir);
		
		JLabel tag_tittle_eliminar = new JLabel();
		tag_tittle_eliminar.setText("Eliminar ( - )");
		tag_tittle_eliminar.setSize(200,70);
		tag_tittle_eliminar.setLocation(250,250);
		tag_tittle_eliminar.setBackground(Color.white);
		tag_tittle_eliminar.setOpaque(true);
		tag_tittle_eliminar.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_eliminar.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_eliminar.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_eliminar);
		
		
		String [] table_head = {"Producto", "Cantidad","Valor","Subtotal"};
		
		Object [][] table_body = {
				{"Cereal","5", "1000.00","5000.00"},
				{"Agua","2", "500.00","1000.00"},
				{"Leche","2", "300.00","600.00"}
				};
		
		JTable products = new JTable(table_body, table_head);
		JScrollPane final_table = new JScrollPane(products);
		final_table.setSize(500,100);
		final_table.setLocation(30,320);
		login_contenedor_blanco.add(final_table);
		login_contenedor_blanco.repaint();
		
		JLabel tag_tittle_subtotal = new JLabel();
		tag_tittle_subtotal.setText("Subtotal:		6600.00");
		tag_tittle_subtotal.setSize(200,30);
		tag_tittle_subtotal.setLocation(50,430);
		tag_tittle_subtotal.setBackground(Color.white);
		tag_tittle_subtotal.setOpaque(true);
		tag_tittle_subtotal.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_subtotal.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_subtotal.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_subtotal);
		
		JLabel tag_tittle_porcentaje_descuento = new JLabel();
		tag_tittle_porcentaje_descuento.setText("% de descuento");
		tag_tittle_porcentaje_descuento.setSize(200,30);
		tag_tittle_porcentaje_descuento.setLocation(50,460);
		tag_tittle_porcentaje_descuento.setBackground(Color.white);
		tag_tittle_porcentaje_descuento.setOpaque(true);
		tag_tittle_porcentaje_descuento.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_porcentaje_descuento.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_porcentaje_descuento.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_porcentaje_descuento);
		
		JLabel tag_tittle_IVA = new JLabel();
		tag_tittle_IVA.setText("IVA 19%:	1254.00");
		tag_tittle_IVA.setSize(200,30);
		tag_tittle_IVA.setLocation(50,490);
		tag_tittle_IVA.setBackground(Color.white);
		tag_tittle_IVA.setOpaque(true);
		tag_tittle_IVA.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_IVA.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_IVA.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_IVA);
		
		JLabel tag_tittle_total_factura = new JLabel();
		tag_tittle_total_factura.setText("Factura_		7,524.00");
		tag_tittle_total_factura.setSize(200,30);
		tag_tittle_total_factura.setLocation(50,520);
		tag_tittle_total_factura.setBackground(Color.white);
		tag_tittle_total_factura.setOpaque(true);
		tag_tittle_total_factura.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_total_factura.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_total_factura.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_total_factura);
		
		JLabel tag_tittle_valor_descontado = new JLabel();
		tag_tittle_valor_descontado.setText("Valor descontado:	330.00");
		tag_tittle_valor_descontado.setSize(200,30);
		tag_tittle_valor_descontado.setLocation(380,460);
		tag_tittle_valor_descontado.setBackground(Color.white);
		tag_tittle_valor_descontado.setOpaque(true);
		tag_tittle_valor_descontado.setFont(new Font("Arial",Font.PLAIN,12));
		tag_tittle_valor_descontado.setVerticalAlignment(JLabel.CENTER);
		tag_tittle_valor_descontado.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor_blanco.add(tag_tittle_valor_descontado);

		
		//Boton de "recordar"
		JCheckBox remember = new JCheckBox();
		remember.setSize(50,50);
		remember.setLocation(360,450);
		login_contenedor_blanco.add(remember);
		
		JTextField input_descuento = new JTextField();
		input_descuento.setSize(100,25);
		input_descuento.setLocation(240,465);
		login_contenedor_blanco.add(input_descuento);
		
		
		
		
		
		
		//Boton de Finalizar
		JButton acces_btn = new JButton();
		acces_btn.setText("Finalizar factura");
		acces_btn.setSize(110, 30);
		acces_btn.setFont(new Font("Arial",Font.ITALIC,9));
		acces_btn.setLocation(400,575);
		login_contenedor_blanco.add(acces_btn);
		this.repaint();
	}
	
	public void router(String target) {
		if(target.equals("login")) {
			getContentPane().removeAll();
			this.login();
			
		}
		
		if (target.equals("registro")) {
			getContentPane().removeAll();
			this.registro();
			
		}
		
		if (target.equals("ayuda")) {
			getContentPane().removeAll();
			this.ayuda();
			
		}
		
		if (target.equals("usuario")) {
			getContentPane().removeAll();
			this.usuario();
			
		}
		
		this.repaint();
		this.revalidate();
	}
	
	public void Mario_art() {
		
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                super.paintComponent(g);
                g.setColor(new Color(135, 206, 235));
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(new Color(222, 170, 155));
                g.fillRect(0, 300, getWidth(), 100);
                drawBlock(g, 100, 50);
                drawBlock(g, 150, 50);
                drawBlock(g, 450, 80);
                drawBlock(g, 30, 150);
                drawPlatform(g, 120, 200, 80, 100, new Color(230, 170, 160));
                drawPlatform(g, 200, 150, 80, 150, new Color(100, 160, 210));
                drawPipe(g, 320, 220);
                drawPlatform(g, 400, 200, 100, 100, new Color(0, 200, 80));
            }
            private void drawBlock(Graphics g, int x, int y) {
                g.setColor(new Color(255, 150, 80));
                g.fillRect(x, y, 40, 40);

                g.setColor(Color.BLACK);
                g.drawRect(x, y, 40, 40);
                g.setColor(Color.LIGHT_GRAY);
                g.fillOval(x + 5, y + 5, 8, 8);
                g.fillOval(x + 27, y + 5, 8, 8);
            }
            private void drawPlatform(Graphics g, int x, int y, int w, int h, Color color) {
                g.setColor(color);
                g.fillRect(x, y, w, h);

                g.setColor(Color.BLACK);
                g.drawRect(x, y, w, h);
                g.setColor(Color.LIGHT_GRAY);
                g.fillOval(x + 5, y + 5, 10, 10);
                g.fillOval(x + w - 15, y + 5, 10, 10);
                g.fillOval(x + 5, y + h - 15, 10, 10);
                g.fillOval(x + w - 15, y + h - 15, 10, 10);
            }
            private void drawPipe(Graphics g, int x, int y) {
                g.setColor(new Color(0, 180, 0));
                g.fillRect(x, y, 60, 80);
                g.setColor(new Color(0, 220, 0));
                g.fillRect(x - 10, y - 20, 80, 20);

                g.setColor(Color.BLACK);
                g.drawRect(x, y, 60, 80);
                g.drawRect(x - 10, y - 20, 80, 20);
                
                
				try {
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
                

            }
        };
        
        
        
		
	
        pane.setSize(1000,400);
        pane.setLocation(0,0);
        this.add(pane);
	}
	
	public void ayuda() {
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,400);
		login_contenedor.setLocation(50,50);
		login_contenedor.setBackground(Color.BLACK);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Ayuda");
		tag_tittle.setSize(150,120);
		tag_tittle.setLocation(125,20);
		tag_tittle.setBackground(Color.white);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial",Font.PLAIN,22));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor.add(tag_tittle);
	}
	
	public void usuario() {
		JPanel login_contenedor = new JPanel();
		login_contenedor.setSize(400,400);
		login_contenedor.setLocation(50,50);
		login_contenedor.setBackground(Color.GRAY);
		//login_contenedor.setOpaque();
		this.add(login_contenedor);
		
		login_contenedor.setLayout(null);
		this.setLayout(null);
		
		//Mensaje acceder
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Usuario");
		tag_tittle.setSize(150,120);
		tag_tittle.setLocation(125,20);
		tag_tittle.setBackground(Color.GRAY);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial",Font.PLAIN,22));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		login_contenedor.add(tag_tittle);
	}
	

}
