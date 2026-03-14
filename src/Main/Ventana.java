
package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
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
		//this.login_new();
		//this.calculadora();
		//this.caculadora_layout();
		//this.calcular_interes();
		//this.pintar();
		this.registro_perfeccionado();
		
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
	
	

}
